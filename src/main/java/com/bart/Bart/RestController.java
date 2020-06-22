package com.bart.Bart;

import Model.API1.Station;
import Model.API2.StationInformationParent;
import Model.API3.Stop;
import Model.API3.Train;
import Model.API3.TrainDetailsParent;
import com.bart.Bart.Logic.Service;
import com.bart.Bart.Response.SourceAndDestination;
import com.bart.Bart.Response.StationResponse;
import Model.API1.StationsParent;
import com.bart.Bart.Response.TrainDetailResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    RestTemplate restTemplate=new RestTemplate();


    @Autowired
    ObjectMapper mapper;

    @Autowired
    Service service;

    @ResponseBody
    @GetMapping("/stations")
    public StationResponse getAllStations() throws Exception {
        StationsParent s=restTemplate.getForObject("http://api.bart.gov/api/stn.aspx?cmd=stns&key=MW9S-E7SL-26DU-VV8V&json=y", StationsParent.class);
        List<Station> stations= service.getAllStationDetail(s);
        StationResponse stationResponse = service.getOnlyNames(stations);
        service.putInMap(stations);
        return  stationResponse;

    }



    @ResponseBody
    @GetMapping("/{source}/{destination}")
    public TrainDetailResponse getTrainDetails(@PathVariable String source, @PathVariable String destination) throws Exception{
        source=service.getAbbreviation(source);
        destination=service.getAbbreviation(destination);
        String routeNo = service.getRouteNo(source, destination);
        TrainDetailsParent trainDetailsParent=restTemplate.getForObject("https://api.bart.gov/api/sched.aspx?cmd=routesched&route="+routeNo+"&key=MW9S-E7SL-26DU-VV8V&json=y", TrainDetailsParent.class);
        return service.makeTrainDetailResponse(trainDetailsParent , source, destination);
    }



    @ResponseBody
    @GetMapping("/station/{source}")
    public StationInformationParent getStationInfo(@PathVariable String source) throws Exception {
        service.fillAbbrIfEmpty();
        source=service.getAbbr(source);
        String json=restTemplate.getForObject("https://api.bart.gov/api/stn.aspx?cmd=stninfo&orig="+source+"&key=MW9S-E7SL-26DU-VV8V&json=y",String.class);
        json = service.cleaningJSON(json);
        System.out.println(source+"="+json);
        StationInformationParent sip=mapper.readValue(json,StationInformationParent.class);
        return sip;
    }


}
