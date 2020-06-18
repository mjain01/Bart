package Model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "@version",
        "@encoding"
})
public class Xml {

    @JsonProperty("@version")
    private String version;
    @JsonProperty("@encoding")
    private String encoding;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("@version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("@version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("@encoding")
    public String getEncoding() {
        return encoding;
    }

    @JsonProperty("@encoding")
    public void setEncoding(String encoding) {
        this.encoding = encoding;
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
