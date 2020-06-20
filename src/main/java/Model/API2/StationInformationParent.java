package Model.API2;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
    public class StationInformationParent {

        @JsonProperty("root")
        private Model.API2.Root root;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        @JsonProperty("root")
        public Model.API2.Root getRoot() {
            return root;
        }

        @JsonProperty("root")
        public void setRoot(Model.API2.Root root) {
            this.root = root;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    }





