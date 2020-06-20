package Model.API2;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "station"
    })
    public class Stations {

        @JsonProperty("station")
        private Model.API2.Station station;
        @JsonIgnore

        @JsonProperty("station")
        public Model.API2.Station getStation() {
            return station;
        }

        @JsonProperty("station")
        public void setStation(Model.API2.Station station) {
            this.station = station;
        }

    }
