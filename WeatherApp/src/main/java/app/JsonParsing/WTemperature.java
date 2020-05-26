package app.JsonParsing;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

//@JsonIgnoreProperties({"latitude", "longtitude"})
@JsonIgnoreProperties(ignoreUnknown = true)
public class WTemperature {
    public TempOneDay getHourly() {
        return hourly;
    }

    public void setHourly(TempOneDay hourly) {
        this.hourly = hourly;
    }

    //@JsonProperty("temperature")
    //public Double temperature;
    private TempOneDay hourly;
}
