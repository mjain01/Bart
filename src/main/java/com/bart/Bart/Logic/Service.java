package com.bart.Bart.Logic;

import Model.API1.Station;
import Model.API1.StationsParent;
import Model.API2.StationInformationParent;
import Model.API3.Stop;
import Model.API3.Train;
import Model.API3.TrainDetailsParent;
import com.bart.Bart.Response.SourceAndDestination;
import com.bart.Bart.Response.StationResponse;
import com.bart.Bart.Response.TrainDetailResponse;
import com.bart.Bart.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    RestController restController;

    Map<String,String> abbr = new HashMap();

    public void putInMap(List<Station> stations) {
        if(abbr.size()==0)
        {
            for(Station station : stations)
            {
                abbr.put(station.getName(),station.getAbbr());
            }
        }
    }


    public TrainDetailResponse makeTrainDetailResponse(TrainDetailsParent trainDetailsParent, String source, String dest){
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
    public String getRouteNo(String source, String destination) throws Exception{
        StationInformationParent sipSource = restController.getStationInfo(source);
        StationInformationParent sipDest = restController.getStationInfo(destination);
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

    public String getAbbreviation(String station) throws Exception{
        StationInformationParent stationInfo = restController.getStationInfo(station);
        return stationInfo.getRoot().getStations().getStation().getAbbr();
    }

    public StationResponse getOnlyNames(List<Station> stations) {
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
    public int getAbbrSize(){
        return abbr.size();
    }

    public String getAbbr(String source) {
        return abbr.get(source);
    }

    public String cleaningJSON(String json) {
        return json.replaceAll("\"\"","null");

    }

    public void fillAbbrIfEmpty() throws Exception {
        if(getAbbrSize()==0)
            restController.getAllStations();
    }
}
