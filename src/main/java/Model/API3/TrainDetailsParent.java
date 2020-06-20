package Model.API3;

import Model.API3.Root;
import Model.API3.Train;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TrainDetailsParent {

    public TrainDetailsParent() {
    }

    @JsonProperty("root")
    private Root root;
    @JsonProperty("root")
    public Root getRoot() {
        return root;
    }

    @JsonProperty("root")
    public void setRoot(Root root) {
        this.root = root;
    }


}
