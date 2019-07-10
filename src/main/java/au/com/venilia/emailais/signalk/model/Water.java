
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
 * Environmental conditions of the water that the vessel is sailing in
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "temperature",
    "salinity"
})
public class Water {

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
    @JsonProperty("salinity")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature salinity;
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
    @JsonProperty("salinity")
    public Temperature getSalinity() {
        return salinity;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("salinity")
    public void setSalinity(Temperature salinity) {
        this.salinity = salinity;
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
        return new ToStringBuilder(this).append("temperature", temperature).append("salinity", salinity).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(temperature).append(salinity).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Water) == false) {
            return false;
        }
        Water rhs = ((Water) other);
        return new EqualsBuilder().append(temperature, rhs.temperature).append(salinity, rhs.salinity).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
