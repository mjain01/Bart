package Model.API2;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@JsonInclude(JsonInclude.Include.NON_NULL)

@JsonPropertyOrder({
        "route"
})
public class NorthRoutes {
    public NorthRoutes(List<String> route) {
        this.route = route;
    }

    public NorthRoutes() {
    }
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("route")
    private List<String> route = null;


    @JsonProperty("route")
    public List<String> getRoute() {
        return route;
    }

    @JsonProperty("route")
    public void setRoute(List<String> route) {
        this.route = route;
    }


}
