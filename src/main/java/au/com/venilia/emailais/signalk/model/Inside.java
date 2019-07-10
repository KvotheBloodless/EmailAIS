
package au.com.venilia.emailais.signalk.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Environmental conditions inside the vessel's hull
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "temperature",
    "humidity",
    "engineRoom",
    "mainCabin",
    "refrigerator",
    "freezer",
    "heating"
})
public class Inside {

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("temperature")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature temperature;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("humidity")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature humidity;
    @JsonProperty("engineRoom")
    private EngineRoom engineRoom;
    @JsonProperty("mainCabin")
    private EngineRoom mainCabin;
    @JsonProperty("refrigerator")
    private EngineRoom refrigerator;
    @JsonProperty("freezer")
    private EngineRoom freezer;
    @JsonProperty("heating")
    private EngineRoom heating;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("temperature")
    public Temperature getTemperature() {
        return temperature;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("temperature")
    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("humidity")
    public Temperature getHumidity() {
        return humidity;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("humidity")
    public void setHumidity(Temperature humidity) {
        this.humidity = humidity;
    }

    @JsonProperty("engineRoom")
    public EngineRoom getEngineRoom() {
        return engineRoom;
    }

    @JsonProperty("engineRoom")
    public void setEngineRoom(EngineRoom engineRoom) {
        this.engineRoom = engineRoom;
    }

    @JsonProperty("mainCabin")
    public EngineRoom getMainCabin() {
        return mainCabin;
    }

    @JsonProperty("mainCabin")
    public void setMainCabin(EngineRoom mainCabin) {
        this.mainCabin = mainCabin;
    }

    @JsonProperty("refrigerator")
    public EngineRoom getRefrigerator() {
        return refrigerator;
    }

    @JsonProperty("refrigerator")
    public void setRefrigerator(EngineRoom refrigerator) {
        this.refrigerator = refrigerator;
    }

    @JsonProperty("freezer")
    public EngineRoom getFreezer() {
        return freezer;
    }

    @JsonProperty("freezer")
    public void setFreezer(EngineRoom freezer) {
        this.freezer = freezer;
    }

    @JsonProperty("heating")
    public EngineRoom getHeating() {
        return heating;
    }

    @JsonProperty("heating")
    public void setHeating(EngineRoom heating) {
        this.heating = heating;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("temperature", temperature).append("humidity", humidity).append("engineRoom", engineRoom).append("mainCabin", mainCabin).append("refrigerator", refrigerator).append("freezer", freezer).append("heating", heating).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(mainCabin).append(temperature).append(freezer).append(humidity).append(additionalProperties).append(heating).append(refrigerator).append(engineRoom).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Inside) == false) {
            return false;
        }
        Inside rhs = ((Inside) other);
        return new EqualsBuilder().append(mainCabin, rhs.mainCabin).append(temperature, rhs.temperature).append(freezer, rhs.freezer).append(humidity, rhs.humidity).append(additionalProperties, rhs.additionalProperties).append(heating, rhs.heating).append(refrigerator, rhs.refrigerator).append(engineRoom, rhs.engineRoom).isEquals();
    }

}
