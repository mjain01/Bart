package Model.API2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "@id",
        "uri",
        "stations",
        "message"
})
public class Root {

    @JsonProperty("@id")
    private String id;
    @JsonProperty("stations")
    private Model.API2.Stations stations;
    @JsonProperty("@id")
    public String getId() {
        return id;
    }

    @JsonProperty("@id")
    public void setId(String id) {
        this.id = id;
    }


    @JsonProperty("stations")
    public Model.API2.Stations getStations() {
        return stations;
    }

    @JsonProperty("stations")
    public void setStations(Model.API2.Stations stations) {
        this.stations = stations;
    }


}
