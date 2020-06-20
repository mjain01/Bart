package Model.API1;

import com.fasterxml.jackson.annotation.*;

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
