package com.bart.Bart;

import Model.API1.Station;
import Model.API2.StationInformationParent;
import Model.API3.Stop;
import Model.API3.Train;
import Model.API3.TrainDetailsParent;
import com.bart.Bart.Response.SourceAndDestination;
import com.bart.Bart.Response.StationResponse;
import Model.API1.StationsParent;
import com.bart.Bart.Response.TrainDetailResponse;
import net.minidev.json.parser.ParseException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    Map<String,String> abbr=new HashMap<>();
    @ResponseBody
    @GetMapping("/stations")
    public StationResponse getAllStations() throws ParseException {
        RestTemplate restTemplate=new RestTemplate();
        StationsParent s=restTemplate.getForObject("http://api.bart.gov/api/stn.aspx?cmd=stns&key=MW9S-E7SL-26DU-VV8V&json=y", StationsParent.class);
        List<Station> stations= getAllStationDetail(s);
        StationResponse stationResponse = getOnlyNames(stations);
        putInMap(stations);
        return  stationResponse;

    }

    private void putInMap(List<Station> stations) {
        if(abbr.size()==0)
        {
            for(Station station : stations)
            {
                abbr.put(station.getName(),station.getAbbr());
            }
        }
    }

    @ResponseBody
    @GetMapping("/{source}/{destination}")
    public TrainDetailResponse getTrainDetails(@PathVariable String source, @PathVariable String destination) throws ParseException{
        source=getAbbreviation(source);
        destination=getAbbreviation(destination);
        RestTemplate restTemplate=new RestTemplate();
        String routeNo = getRouteNo(source, destination);
        TrainDetailsParent trainDetailsParent=restTemplate.getForObject("https://api.bart.gov/api/sched.aspx?cmd=routesched&route="+routeNo+"&key=MW9S-E7SL-26DU-VV8V&json=y", TrainDetailsParent.class);
        System.out.println(trainDetailsParent);
        return makeResponse(trainDetailsParent , source, destination);
    }

    public TrainDetailResponse makeResponse(TrainDetailsParent trainDetailsParent, String source, String dest){
        List<Train> trainList = trainDetailsParent.getRoot().getRoute().getTrain();
        List<SourceAndDestination> sourceAndDestinations=new ArrayList<>();
        for(Train train : trainList)
        {
            SourceAndDestination sad=new SourceAndDestination();
            for(Stop stop : train.getStop())
            {
                if(stop.getStation().equals(source))
                    sad.setSource(stop);
                if(stop.getStation().equals(dest))
                    sad.setDestination(stop);
            }
            if(sad.getDestination()!=null&&sad.getSource()!=null)
                sourceAndDestinations.add(sad);
        }
        TrainDetailResponse trainDetailResponse = new TrainDetailResponse();
        trainDetailResponse.setSourceAndDestinationList(sourceAndDestinations);
        return trainDetailResponse;
    }
    public String getRouteNo(String source, String destination) throws ParseException{
        StationInformationParent sipSource = getStationInfo(source);
        StationInformationParent sipDest = getStationInfo(destination);
        String route = getCommonRoute(sipSource,sipDest);

        return route.split(" ")[1];
    }

    public String getCommonRoute(StationInformationParent sipSource, StationInformationParent sipDest){
        List<String> sourceRoutes=new ArrayList<>();
        sourceRoutes.addAll(sipSource.getRoot().getStations().getStation().getNorthRoutes().getRoute());
        sourceRoutes.addAll(sipSource.getRoot().getStations().getStation().getSouthRoutes().getRoute());

        Set<String> sourceRoutesSet= new HashSet<>(sourceRoutes);

        List<String> destRoutes=new ArrayList<>();
        destRoutes.addAll(sipDest.getRoot().getStations().getStation().getNorthRoutes().getRoute());
        destRoutes.addAll(sipDest.getRoot().getStations().getStation().getSouthRoutes().getRoute());

        for(String route : destRoutes)
        {
            if(sourceRoutesSet.contains(route))
                return route;
        }
        return null;

    }
    @ResponseBody
    @GetMapping("/station/{source}")
    public StationInformationParent getStationInfo(@PathVariable String source) throws ParseException {
        RestTemplate restTemplate=new RestTemplate();
        if(abbr.size()==0)
            getAllStations();
        System.out.println("https://api.bart.gov/api/stn.aspx?cmd=stninfo&orig="+abbr.get(source)+"&key=MW9S-E7SL-26DU-VV8V&json=y");
        StationInformationParent s=restTemplate.getForObject("https://api.bart.gov/api/stn.aspx?cmd=stninfo&orig="+abbr.get(source)+"&key=MW9S-E7SL-26DU-VV8V&json=y",StationInformationParent.class);
        return s;
    }

    private String getAbbreviation(String station) throws ParseException{
        StationInformationParent stationInfo = getStationInfo(station);
        return stationInfo.getRoot().getStations().getStation().getAbbr();
    }

    private StationResponse getOnlyNames(List<Station> stations) {
        List<String> names=new ArrayList<>();
    for(Station station:stations){
           names.add(station.getName()) ;
        }
    return new StationResponse(names);
    }

    public List<Station> getAllStationDetail(StationsParent response)
    {
        return response.getRoot().getStations().getStation();
    }

}
