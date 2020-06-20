package Model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "#cdata-section"
    })
    public class Attraction {

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "#cdata-section"
    })
    public class CrossStreet {

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "?xml",
            "root"
    })
    public class StationInformationParent {

        @JsonProperty("root")
        private Root root;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        @JsonProperty("root")
        public Root getRoot() {
            return root;
        }

        @JsonProperty("root")
        public void setRoot(Root root) {
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "#cdata-section"
    })
    public class Food {

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
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "#cdata-section"
    })
    public class Link {

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "platform"
    })
    public class NorthPlatforms {

        @JsonProperty("platform")
        private List<String> platform = null;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        @JsonProperty("platform")
        public List<String> getPlatform() {
            return platform;
        }

        @JsonProperty("platform")
        public void setPlatform(List<String> platform) {
            this.platform = platform;
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "route"
    })
    public class NorthRoutes {

        @JsonProperty("route")
        private List<String> route = null;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        @JsonProperty("route")
        public List<String> getRoute() {
            return route;
        }

        @JsonProperty("route")
        public void setRoute(List<String> route) {
            this.route = route;
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "@id",
            "uri",
            "stations",
            "message"
    })
    public class Root {

        @JsonProperty("@id")
        private String id;
        @JsonProperty("uri")
        private Uri uri;
        @JsonProperty("stations")
        private Stations stations;
        @JsonProperty("message")
        private String message;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        @JsonProperty("@id")
        public String getId() {
            return id;
        }

        @JsonProperty("@id")
        public void setId(String id) {
            this.id = id;
        }

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "#cdata-section"
    })
    public class Shopping {

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "platform"
    })
    public class SouthPlatforms {

        @JsonProperty("platform")
        private List<String> platform = null;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        @JsonProperty("platform")
        public List<String> getPlatform() {
            return platform;
        }

        @JsonProperty("platform")
        public void setPlatform(List<String> platform) {
            this.platform = platform;
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "route"
    })
    public class SouthRoutes {

        @JsonProperty("route")
        private List<String> route = null;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        @JsonProperty("route")
        public List<String> getRoute() {
            return route;
        }

        @JsonProperty("route")
        public void setRoute(List<String> route) {
            this.route = route;
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "station"
    })
    public class Stations {

        @JsonProperty("station")
        private Station station;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        @JsonProperty("station")
        public Station getStation() {
            return station;
        }

        @JsonProperty("station")
        public void setStation(Station station) {
            this.station = station;
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "#cdata-section"
    })
    public class Uri {

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

