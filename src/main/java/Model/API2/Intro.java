package Model.API2;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "#cdata-section"
})
public class Intro {

    @JsonProperty("#cdata-section")
    private String cdataSection;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("#cdata-section")
    public String getCdataSection() {
        return cdataSection;
    }

    @JsonProperty("#cdata-section")
    public void setCdataSection(String cdataSection) {
        this.cdataSection = cdataSection;
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
