package Model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StationsParent {

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


