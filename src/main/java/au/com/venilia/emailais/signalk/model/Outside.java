
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
 * Environmental conditions outside of the vessel's hull
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "temperature",
    "dewPointTemperature",
    "apparentWindChillTemperature",
    "theoreticalWindChillTemperature",
    "heatIndexTemperature",
    "pressure",
    "humidity",
    "airDensity",
    "illuminance"
})
public class Outside {

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
    @JsonProperty("dewPointTemperature")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature dewPointTemperature;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("apparentWindChillTemperature")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature apparentWindChillTemperature;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("theoreticalWindChillTemperature")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature theoreticalWindChillTemperature;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("heatIndexTemperature")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature heatIndexTemperature;
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
    @JsonProperty("humidity")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature humidity;
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
    @JsonProperty("dewPointTemperature")
    public Temperature getDewPointTemperature() {
        return dewPointTemperature;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("dewPointTemperature")
    public void setDewPointTemperature(Temperature dewPointTemperature) {
        this.dewPointTemperature = dewPointTemperature;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("apparentWindChillTemperature")
    public Temperature getApparentWindChillTemperature() {
        return apparentWindChillTemperature;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("apparentWindChillTemperature")
    public void setApparentWindChillTemperature(Temperature apparentWindChillTemperature) {
        this.apparentWindChillTemperature = apparentWindChillTemperature;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("theoreticalWindChillTemperature")
    public Temperature getTheoreticalWindChillTemperature() {
        return theoreticalWindChillTemperature;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("theoreticalWindChillTemperature")
    public void setTheoreticalWindChillTemperature(Temperature theoreticalWindChillTemperature) {
        this.theoreticalWindChillTemperature = theoreticalWindChillTemperature;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("heatIndexTemperature")
    public Temperature getHeatIndexTemperature() {
        return heatIndexTemperature;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("heatIndexTemperature")
    public void setHeatIndexTemperature(Temperature heatIndexTemperature) {
        this.heatIndexTemperature = heatIndexTemperature;
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
        return new ToStringBuilder(this).append("temperature", temperature).append("dewPointTemperature", dewPointTemperature).append("apparentWindChillTemperature", apparentWindChillTemperature).append("theoreticalWindChillTemperature", theoreticalWindChillTemperature).append("heatIndexTemperature", heatIndexTemperature).append("pressure", pressure).append("humidity", humidity).append("airDensity", airDensity).append("illuminance", illuminance).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(illuminance).append(heatIndexTemperature).append(apparentWindChillTemperature).append(temperature).append(theoreticalWindChillTemperature).append(humidity).append(pressure).append(additionalProperties).append(dewPointTemperature).append(airDensity).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Outside) == false) {
            return false;
        }
        Outside rhs = ((Outside) other);
        return new EqualsBuilder().append(illuminance, rhs.illuminance).append(heatIndexTemperature, rhs.heatIndexTemperature).append(apparentWindChillTemperature, rhs.apparentWindChillTemperature).append(temperature, rhs.temperature).append(theoreticalWindChillTemperature, rhs.theoreticalWindChillTemperature).append(humidity, rhs.humidity).append(pressure, rhs.pressure).append(additionalProperties, rhs.additionalProperties).append(dewPointTemperature, rhs.dewPointTemperature).append(airDensity, rhs.airDensity).isEquals();
    }

}
