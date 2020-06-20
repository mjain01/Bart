package Model.API1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StationsParent {

    @JsonProperty("root")
    private Model.API1.Root root;

    @JsonProperty("root")
    public Model.API1.Root getRoot() {
        return root;
    }

    @JsonProperty("root")
    public void setRoot(Root root) {
        this.root = root;
    }

}


