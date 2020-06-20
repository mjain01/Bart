package Model.API3;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
 public class Stop {

    public Stop() {
    }

    @JsonProperty("@station")
    private String station;
    @JsonProperty("@load")
    private String load;
    @JsonProperty("@bikeflag")
    private String bikeflag;
    @JsonProperty("@origTime")
    private String origTime;
    @JsonProperty("@station")
    public String getStation() {
        return station;
    }

    @JsonProperty("@station")
    public void setStation(String station) {
        this.station = station;
    }

    @JsonProperty("@load")
    public String getLoad() {
        return load;
    }

    @JsonProperty("@load")
    public void setLoad(String load) {
        this.load = load;
    }

    @JsonProperty("@bikeflag")
    public String getBikeflag() {
        return bikeflag;
    }

    @JsonProperty("@bikeflag")
    public void setBikeflag(String bikeflag) {
        this.bikeflag = bikeflag;
    }

    @JsonProperty("@origTime")
    public String getOrigTime() {
        return origTime;
    }

    @JsonProperty("@origTime")
    public void setOrigTime(String origTime) {
        this.origTime = origTime;
    }


}
