package com.bart.Bart.Response;

import java.util.List;

public class StationResponse {
    public List<String> name;

    public StationResponse() {
    }

    public StationResponse(List<String> name) {
        this.name = name;
    }

    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }
}
