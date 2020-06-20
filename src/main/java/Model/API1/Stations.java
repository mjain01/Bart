package Model.API1;

import com.fasterxml.jackson.annotation.*;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "station"
})
public class Stations {

    @JsonProperty("station")
    private List<Model.API1.Station> station = null;

    @JsonProperty("station")
    public List<Model.API1.Station> getStation() {
        return station;
    }

    @JsonProperty("station")
    public void setStation(List<Station> station) {
        this.station = station;
    }


}
