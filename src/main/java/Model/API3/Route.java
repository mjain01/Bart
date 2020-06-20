package Model.API3;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class Route {

    public Route() {
    }

    @JsonProperty("train")
    private List<Train> train;

    @JsonProperty("train")
    public List<Train> getTrain() {
        return train;
    }

    @JsonProperty("train")
    public void setTrain(List<Train> train) {
        this.train = train;
    }


}
