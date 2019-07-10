
package au.com.venilia.emailais.signalk.model.groups;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import au.com.venilia.emailais.signalk.model.Temperature;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * steering
 * <p>
 * Schema describing the steering child-object of a vessel.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "rudderAngle",
    "rudderAngleTarget",
    "autopilot"
})
public class Steering {

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("rudderAngle")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature rudderAngle;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("rudderAngleTarget")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature rudderAngleTarget;
    /**
     * autopilot
     * <p>
     * Autopilot data
     * 
     */
    @JsonProperty("autopilot")
    @JsonPropertyDescription("Autopilot data")
    private Autopilot autopilot;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("rudderAngle")
    public Temperature getRudderAngle() {
        return rudderAngle;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("rudderAngle")
    public void setRudderAngle(Temperature rudderAngle) {
        this.rudderAngle = rudderAngle;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("rudderAngleTarget")
    public Temperature getRudderAngleTarget() {
        return rudderAngleTarget;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("rudderAngleTarget")
    public void setRudderAngleTarget(Temperature rudderAngleTarget) {
        this.rudderAngleTarget = rudderAngleTarget;
    }

    /**
     * autopilot
     * <p>
     * Autopilot data
     * 
     */
    @JsonProperty("autopilot")
    public Autopilot getAutopilot() {
        return autopilot;
    }

    /**
     * autopilot
     * <p>
     * Autopilot data
     * 
     */
    @JsonProperty("autopilot")
    public void setAutopilot(Autopilot autopilot) {
        this.autopilot = autopilot;
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
        return new ToStringBuilder(this).append("rudderAngle", rudderAngle).append("rudderAngleTarget", rudderAngleTarget).append("autopilot", autopilot).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(rudderAngleTarget).append(additionalProperties).append(rudderAngle).append(autopilot).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Steering) == false) {
            return false;
        }
        Steering rhs = ((Steering) other);
        return new EqualsBuilder().append(rudderAngleTarget, rhs.rudderAngleTarget).append(additionalProperties, rhs.additionalProperties).append(rudderAngle, rhs.rudderAngle).append(autopilot, rhs.autopilot).isEquals();
    }

}
