package Model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "uri",
        "stations",
        "message"
})
public class Root {

    @JsonProperty("uri")
    private Uri uri;
    @JsonProperty("stations")
    private Stations stations;
    @JsonProperty("message")
    private String message;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("uri")
    public Uri getUri() {
        return uri;
    }

    @JsonProperty("uri")
    public void setUri(Uri uri) {
        this.uri = uri;
    }

    @JsonProperty("stations")
    public Stations getStations() {
        return stations;
    }

    @JsonProperty("stations")
    public void setStations(Stations stations) {
        this.stations = stations;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
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
