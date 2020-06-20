package Model.API2;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "name",
            "abbr",
            "gtfs_latitude",
            "gtfs_longitude",
            "address",
            "city",
            "county",
            "state",
            "zipcode",
            "north_routes",
            "south_routes",
            "north_platforms",
            "south_platforms",
            "platform_info",
            "intro",
            "cross_street",
            "food",
            "shopping",
            "attraction",
            "link"
    })
    public class Station {

        @JsonProperty("name")
        private String name;
        @JsonProperty("abbr")
        private String abbr;
        @JsonProperty("gtfs_latitude")
        private String gtfsLatitude;
        @JsonProperty("gtfs_longitude")
        private String gtfsLongitude;
        @JsonProperty("address")
        private String address;
        @JsonProperty("city")
        private String city;
        @JsonProperty("county")
        private String county;
        @JsonProperty("state")
        private String state;
        @JsonProperty("zipcode")
        private String zipcode;
        @JsonProperty("north_routes")
        private NorthRoutes northRoutes;
        @JsonProperty("south_routes")
        private SouthRoutes southRoutes;
        @JsonProperty("north_platforms")
        private NorthPlatforms northPlatforms;
        @JsonProperty("south_platforms")
        private SouthPlatforms southPlatforms;
        @JsonProperty("platform_info")
        private String platformInfo;
        @JsonProperty("intro")
        private Intro intro;
        @JsonProperty("cross_street")
        private CrossStreet crossStreet;
        @JsonProperty("food")
        private Food food;
        @JsonProperty("shopping")
        private Shopping shopping;
        @JsonProperty("attraction")
        private Attraction attraction;
        @JsonProperty("link")
        private Link link;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        @JsonProperty("name")
        public String getName() {
            return name;
        }

        @JsonProperty("name")
        public void setName(String name) {
            this.name = name;
        }

        @JsonProperty("abbr")
        public String getAbbr() {
            return abbr;
        }

        @JsonProperty("abbr")
        public void setAbbr(String abbr) {
            this.abbr = abbr;
        }

        @JsonProperty("gtfs_latitude")
        public String getGtfsLatitude() {
            return gtfsLatitude;
        }

        @JsonProperty("gtfs_latitude")
        public void setGtfsLatitude(String gtfsLatitude) {
            this.gtfsLatitude = gtfsLatitude;
        }

        @JsonProperty("gtfs_longitude")
        public String getGtfsLongitude() {
            return gtfsLongitude;
        }

        @JsonProperty("gtfs_longitude")
        public void setGtfsLongitude(String gtfsLongitude) {
            this.gtfsLongitude = gtfsLongitude;
        }

        @JsonProperty("address")
        public String getAddress() {
            return address;
        }

        @JsonProperty("address")
        public void setAddress(String address) {
            this.address = address;
        }

        @JsonProperty("city")
        public String getCity() {
            return city;
        }

        @JsonProperty("city")
        public void setCity(String city) {
            this.city = city;
        }

        @JsonProperty("county")
        public String getCounty() {
            return county;
        }

        @JsonProperty("county")
        public void setCounty(String county) {
            this.county = county;
        }

        @JsonProperty("state")
        public String getState() {
            return state;
        }

        @JsonProperty("state")
        public void setState(String state) {
            this.state = state;
        }

        @JsonProperty("zipcode")
        public String getZipcode() {
            return zipcode;
        }

        @JsonProperty("zipcode")
        public void setZipcode(String zipcode) {
            this.zipcode = zipcode;
        }

        @JsonProperty("north_routes")
        public NorthRoutes getNorthRoutes() {
            return northRoutes;
        }

        @JsonProperty("north_routes")
        public void setNorthRoutes(NorthRoutes northRoutes) {
            this.northRoutes = northRoutes;
        }

        @JsonProperty("south_routes")
        public SouthRoutes getSouthRoutes() {
            return southRoutes;
        }

        @JsonProperty("south_routes")
        public void setSouthRoutes(SouthRoutes southRoutes) {
            this.southRoutes = southRoutes;
        }

        @JsonProperty("north_platforms")
        public NorthPlatforms getNorthPlatforms() {
            return northPlatforms;
        }

        @JsonProperty("north_platforms")
        public void setNorthPlatforms(NorthPlatforms northPlatforms) {
            this.northPlatforms = northPlatforms;
        }

        @JsonProperty("south_platforms")
        public SouthPlatforms getSouthPlatforms() {
            return southPlatforms;
        }

        @JsonProperty("south_platforms")
        public void setSouthPlatforms(SouthPlatforms southPlatforms) {
            this.southPlatforms = southPlatforms;
        }

        @JsonProperty("platform_info")
        public String getPlatformInfo() {
            return platformInfo;
        }

        @JsonProperty("platform_info")
        public void setPlatformInfo(String platformInfo) {
            this.platformInfo = platformInfo;
        }

        @JsonProperty("intro")
        public Intro getIntro() {
            return intro;
        }

        @JsonProperty("intro")
        public void setIntro(Intro intro) {
            this.intro = intro;
        }

        @JsonProperty("cross_street")
        public CrossStreet getCrossStreet() {
            return crossStreet;
        }

        @JsonProperty("cross_street")
        public void setCrossStreet(CrossStreet crossStreet) {
            this.crossStreet = crossStreet;
        }

        @JsonProperty("food")
        public Food getFood() {
            return food;
        }

        @JsonProperty("food")
        public void setFood(Food food) {
            this.food = food;
        }

        @JsonProperty("shopping")
        public Shopping getShopping() {
            return shopping;
        }

        @JsonProperty("shopping")
        public void setShopping(Shopping shopping) {
            this.shopping = shopping;
        }

        @JsonProperty("attraction")
        public Attraction getAttraction() {
            return attraction;
        }

        @JsonProperty("attraction")
        public void setAttraction(Attraction attraction) {
            this.attraction = attraction;
        }

        @JsonProperty("link")
        public Link getLink() {
            return link;
        }

        @JsonProperty("link")
        public void setLink(Link link) {
            this.link = link;
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
