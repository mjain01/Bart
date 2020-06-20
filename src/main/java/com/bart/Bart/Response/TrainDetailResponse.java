package com.bart.Bart.Response;

import Model.API3.Stop;
import Model.API3.Train;

import java.util.List;

public class TrainDetailResponse {


    List<SourceAndDestination> sourceAndDestinationList;
    public TrainDetailResponse() {

    }

    public List<SourceAndDestination> getSourceAndDestinationList() {
        return sourceAndDestinationList;
    }

    public void setSourceAndDestinationList(List<SourceAndDestination> sourceAndDestinationList) {
        this.sourceAndDestinationList = sourceAndDestinationList;
    }
}
