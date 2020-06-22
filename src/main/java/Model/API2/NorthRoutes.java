package Model.API2;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonPropertyOrder({
        "route"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
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
        System.out.println("Im in route");
        return route;
    }

    @JsonProperty("route")
    public void setRoute(List<String> route) {
        this.route = route;
    }


}
