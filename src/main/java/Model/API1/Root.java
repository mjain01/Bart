package Model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Root {

    @JsonProperty("stations")
    private Stations stations;


    @JsonProperty("stations")
    public Stations getStations() {
        return stations;
    }

    @JsonProperty("stations")
    public void setStations(Stations stations) {
        this.stations = stations;
    }



}
