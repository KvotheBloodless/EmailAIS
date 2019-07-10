
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

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "temperature",
    "pressure",
    "relativeHumidity",
    "dewPoint",
    "airDensity",
    "illuminance"
})
public class EngineRoom {

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
    @JsonProperty("pressure")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature pressure;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("relativeHumidity")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature relativeHumidity;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("dewPoint")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature dewPoint;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("airDensity")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature airDensity;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("illuminance")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature illuminance;
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
    @JsonProperty("pressure")
    public Temperature getPressure() {
        return pressure;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("pressure")
    public void setPressure(Temperature pressure) {
        this.pressure = pressure;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("relativeHumidity")
    public Temperature getRelativeHumidity() {
        return relativeHumidity;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("relativeHumidity")
    public void setRelativeHumidity(Temperature relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("dewPoint")
    public Temperature getDewPoint() {
        return dewPoint;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("dewPoint")
    public void setDewPoint(Temperature dewPoint) {
        this.dewPoint = dewPoint;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("airDensity")
    public Temperature getAirDensity() {
        return airDensity;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("airDensity")
    public void setAirDensity(Temperature airDensity) {
        this.airDensity = airDensity;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("illuminance")
    public Temperature getIlluminance() {
        return illuminance;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("illuminance")
    public void setIlluminance(Temperature illuminance) {
        this.illuminance = illuminance;
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
        return new ToStringBuilder(this).append("temperature", temperature).append("pressure", pressure).append("relativeHumidity", relativeHumidity).append("dewPoint", dewPoint).append("airDensity", airDensity).append("illuminance", illuminance).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(illuminance).append(temperature).append(relativeHumidity).append(pressure).append(additionalProperties).append(dewPoint).append(airDensity).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EngineRoom) == false) {
            return false;
        }
        EngineRoom rhs = ((EngineRoom) other);
        return new EqualsBuilder().append(illuminance, rhs.illuminance).append(temperature, rhs.temperature).append(relativeHumidity, rhs.relativeHumidity).append(pressure, rhs.pressure).append(additionalProperties, rhs.additionalProperties).append(dewPoint, rhs.dewPoint).append(airDensity, rhs.airDensity).isEquals();
    }

}
