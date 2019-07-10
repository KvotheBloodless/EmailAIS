
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
 * depth
 * <p>
 * Depth related data
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "belowKeel",
    "belowTransducer",
    "belowSurface",
    "transducerToKeel",
    "surfaceToTransducer"
})
public class Depth {

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("belowKeel")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature belowKeel;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("belowTransducer")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature belowTransducer;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("belowSurface")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature belowSurface;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("transducerToKeel")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature transducerToKeel;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("surfaceToTransducer")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature surfaceToTransducer;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("belowKeel")
    public Temperature getBelowKeel() {
        return belowKeel;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("belowKeel")
    public void setBelowKeel(Temperature belowKeel) {
        this.belowKeel = belowKeel;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("belowTransducer")
    public Temperature getBelowTransducer() {
        return belowTransducer;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("belowTransducer")
    public void setBelowTransducer(Temperature belowTransducer) {
        this.belowTransducer = belowTransducer;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("belowSurface")
    public Temperature getBelowSurface() {
        return belowSurface;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("belowSurface")
    public void setBelowSurface(Temperature belowSurface) {
        this.belowSurface = belowSurface;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("transducerToKeel")
    public Temperature getTransducerToKeel() {
        return transducerToKeel;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("transducerToKeel")
    public void setTransducerToKeel(Temperature transducerToKeel) {
        this.transducerToKeel = transducerToKeel;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("surfaceToTransducer")
    public Temperature getSurfaceToTransducer() {
        return surfaceToTransducer;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("surfaceToTransducer")
    public void setSurfaceToTransducer(Temperature surfaceToTransducer) {
        this.surfaceToTransducer = surfaceToTransducer;
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
        return new ToStringBuilder(this).append("belowKeel", belowKeel).append("belowTransducer", belowTransducer).append("belowSurface", belowSurface).append("transducerToKeel", transducerToKeel).append("surfaceToTransducer", surfaceToTransducer).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(transducerToKeel).append(surfaceToTransducer).append(belowKeel).append(belowTransducer).append(additionalProperties).append(belowSurface).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Depth) == false) {
            return false;
        }
        Depth rhs = ((Depth) other);
        return new EqualsBuilder().append(transducerToKeel, rhs.transducerToKeel).append(surfaceToTransducer, rhs.surfaceToTransducer).append(belowKeel, rhs.belowKeel).append(belowTransducer, rhs.belowTransducer).append(additionalProperties, rhs.additionalProperties).append(belowSurface, rhs.belowSurface).isEquals();
    }

}
