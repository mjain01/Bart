package com.bart.Bart;

import Model.Response;
import Model.Station;
import Model.StationResponse;
import Model.Stations;
import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;
import net.minidev.json.parser.ParseException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @ResponseBody
    @GetMapping("/stations")
    public StationResponse getAllStations() throws ParseException {
        RestTemplate restTemplate=new RestTemplate();
        Response s=restTemplate.getForObject("http://api.bart.gov/api/stn.aspx?cmd=stns&key=MW9S-E7SL-26DU-VV8V&json=y", Response.class);
        List<Station> stations= getAllStationDetail(s);
        StationResponse stationResponse = getOnlyNames(stations);
        return  stationResponse;

    }

    private StationResponse getOnlyNames(List<Station> stations) {
        List<String> names=new ArrayList<>();
    for(Station station:stations){
           names.add(station.getName()) ;
        }
    return new StationResponse(names);
    }

    public List<Station> getAllStationDetail(Response response)
    {
        return response.getRoot().getStations().getStation();
    }

}
