package Model.API3;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Train {

    public Train() {
    }

    @JsonProperty("@index")
    private String index;
    @JsonProperty("stop")
    private List<Stop> stop;
    @JsonProperty("@index")
    public String getIndex() {
        return index;
    }

    @JsonProperty("@index")
    public void setIndex(String index) {
        this.index = index;
    }

    @JsonProperty("stop")
    public List<Stop> getStop() {
        return stop;
    }

    @JsonProperty("stop")
    public void setStop(List<Stop> stop) {
        this.stop = stop;
    }


}
