package com.bart.Bart.Logic;

import Model.Response;
import Model.Station;

import java.util.List;

public class Temp {
    public List<Station> getAllStationDetail(Response response)
    {
        return response.getRoot().getStations().getStation();
    }
}
