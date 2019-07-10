
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
 * gnss
 * <p>
 * Global satellite navigation meta information
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "type",
    "methodQuality",
    "integrity",
    "satellites",
    "antennaAltitude",
    "horizontalDilution",
    "positionDilution",
    "geoidalSeparation",
    "differentialAge",
    "differentialReference"
})
public class Gnss {

    /**
     * Fix type
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Fix type")
    private Type type = null;
    /**
     * Quality of the satellite fix
     * 
     */
    @JsonProperty("methodQuality")
    @JsonPropertyDescription("Quality of the satellite fix")
    private MethodQuality methodQuality;
    /**
     * Integrity of the satellite fix
     * 
     */
    @JsonProperty("integrity")
    @JsonPropertyDescription("Integrity of the satellite fix")
    private Integrity integrity;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("satellites")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature satellites;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("antennaAltitude")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature antennaAltitude;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("horizontalDilution")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature horizontalDilution;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("positionDilution")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature positionDilution;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("geoidalSeparation")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature geoidalSeparation;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("differentialAge")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature differentialAge;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("differentialReference")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature differentialReference;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Fix type
     * 
     */
    @JsonProperty("type")
    public Type getType() {
        return type;
    }

    /**
     * Fix type
     * 
     */
    @JsonProperty("type")
    public void setType(Type type) {
        this.type = type;
    }

    /**
     * Quality of the satellite fix
     * 
     */
    @JsonProperty("methodQuality")
    public MethodQuality getMethodQuality() {
        return methodQuality;
    }

    /**
     * Quality of the satellite fix
     * 
     */
    @JsonProperty("methodQuality")
    public void setMethodQuality(MethodQuality methodQuality) {
        this.methodQuality = methodQuality;
    }

    /**
     * Integrity of the satellite fix
     * 
     */
    @JsonProperty("integrity")
    public Integrity getIntegrity() {
        return integrity;
    }

    /**
     * Integrity of the satellite fix
     * 
     */
    @JsonProperty("integrity")
    public void setIntegrity(Integrity integrity) {
        this.integrity = integrity;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("satellites")
    public Temperature getSatellites() {
        return satellites;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("satellites")
    public void setSatellites(Temperature satellites) {
        this.satellites = satellites;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("antennaAltitude")
    public Temperature getAntennaAltitude() {
        return antennaAltitude;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("antennaAltitude")
    public void setAntennaAltitude(Temperature antennaAltitude) {
        this.antennaAltitude = antennaAltitude;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("horizontalDilution")
    public Temperature getHorizontalDilution() {
        return horizontalDilution;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("horizontalDilution")
    public void setHorizontalDilution(Temperature horizontalDilution) {
        this.horizontalDilution = horizontalDilution;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("positionDilution")
    public Temperature getPositionDilution() {
        return positionDilution;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("positionDilution")
    public void setPositionDilution(Temperature positionDilution) {
        this.positionDilution = positionDilution;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("geoidalSeparation")
    public Temperature getGeoidalSeparation() {
        return geoidalSeparation;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("geoidalSeparation")
    public void setGeoidalSeparation(Temperature geoidalSeparation) {
        this.geoidalSeparation = geoidalSeparation;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("differentialAge")
    public Temperature getDifferentialAge() {
        return differentialAge;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("differentialAge")
    public void setDifferentialAge(Temperature differentialAge) {
        this.differentialAge = differentialAge;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("differentialReference")
    public Temperature getDifferentialReference() {
        return differentialReference;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("differentialReference")
    public void setDifferentialReference(Temperature differentialReference) {
        this.differentialReference = differentialReference;
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
        return new ToStringBuilder(this).append("type", type).append("methodQuality", methodQuality).append("integrity", integrity).append("satellites", satellites).append("antennaAltitude", antennaAltitude).append("horizontalDilution", horizontalDilution).append("positionDilution", positionDilution).append("geoidalSeparation", geoidalSeparation).append("differentialAge", differentialAge).append("differentialReference", differentialReference).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(satellites).append(antennaAltitude).append(integrity).append(geoidalSeparation).append(differentialAge).append(differentialReference).append(positionDilution).append(additionalProperties).append(type).append(methodQuality).append(horizontalDilution).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Gnss) == false) {
            return false;
        }
        Gnss rhs = ((Gnss) other);
        return new EqualsBuilder().append(satellites, rhs.satellites).append(antennaAltitude, rhs.antennaAltitude).append(integrity, rhs.integrity).append(geoidalSeparation, rhs.geoidalSeparation).append(differentialAge, rhs.differentialAge).append(differentialReference, rhs.differentialReference).append(positionDilution, rhs.positionDilution).append(additionalProperties, rhs.additionalProperties).append(type, rhs.type).append(methodQuality, rhs.methodQuality).append(horizontalDilution, rhs.horizontalDilution).isEquals();
    }

}
