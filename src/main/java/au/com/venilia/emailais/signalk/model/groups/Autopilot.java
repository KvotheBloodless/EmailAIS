
package au.com.venilia.emailais.signalk.model.groups;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import au.com.venilia.emailais.signalk.model.Temperature;

/**
 * autopilot
 * <p>
 * Autopilot data
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
        "state",
        "mode",
        "target",
        "deadZone",
        "backlash",
        "gain",
        "maxDriveCurrent",
        "maxDriveRate",
        "portLock",
        "starboardLock"
})
public class Autopilot {

    /**
     * Autopilot state
     * 
     */
    @JsonProperty("state")
    @JsonPropertyDescription("Autopilot state")
    private State state;
    /**
     * Operational mode
     * 
     */
    @JsonProperty("mode")
    @JsonPropertyDescription("Operational mode")
    private Mode mode;
    /**
     * target
     * <p>
     * Autopilot target
     * 
     */
    @JsonProperty("target")
    @JsonPropertyDescription("Autopilot target")
    private Target target;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("deadZone")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature deadZone;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("backlash")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature backlash;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("gain")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature gain;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("maxDriveCurrent")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature maxDriveCurrent;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("maxDriveRate")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature maxDriveRate;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("portLock")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature portLock;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("starboardLock")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature starboardLock;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Autopilot state
     * 
     */
    @JsonProperty("state")
    public State getState() {

        return state;
    }

    /**
     * Autopilot state
     * 
     */
    @JsonProperty("state")
    public void setState(State state) {

        this.state = state;
    }

    /**
     * Operational mode
     * 
     */
    @JsonProperty("mode")
    public Mode getMode() {

        return mode;
    }

    /**
     * Operational mode
     * 
     */
    @JsonProperty("mode")
    public void setMode(Mode mode) {

        this.mode = mode;
    }

    /**
     * target
     * <p>
     * Autopilot target
     * 
     */
    @JsonProperty("target")
    public Target getTarget() {

        return target;
    }

    /**
     * target
     * <p>
     * Autopilot target
     * 
     */
    @JsonProperty("target")
    public void setTarget(Target target) {

        this.target = target;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("deadZone")
    public Temperature getDeadZone() {

        return deadZone;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("deadZone")
    public void setDeadZone(Temperature deadZone) {

        this.deadZone = deadZone;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("backlash")
    public Temperature getBacklash() {

        return backlash;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("backlash")
    public void setBacklash(Temperature backlash) {

        this.backlash = backlash;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("gain")
    public Temperature getGain() {

        return gain;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("gain")
    public void setGain(Temperature gain) {

        this.gain = gain;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("maxDriveCurrent")
    public Temperature getMaxDriveCurrent() {

        return maxDriveCurrent;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("maxDriveCurrent")
    public void setMaxDriveCurrent(Temperature maxDriveCurrent) {

        this.maxDriveCurrent = maxDriveCurrent;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("maxDriveRate")
    public Temperature getMaxDriveRate() {

        return maxDriveRate;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("maxDriveRate")
    public void setMaxDriveRate(Temperature maxDriveRate) {

        this.maxDriveRate = maxDriveRate;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("portLock")
    public Temperature getPortLock() {

        return portLock;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("portLock")
    public void setPortLock(Temperature portLock) {

        this.portLock = portLock;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("starboardLock")
    public Temperature getStarboardLock() {

        return starboardLock;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("starboardLock")
    public void setStarboardLock(Temperature starboardLock) {

        this.starboardLock = starboardLock;
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

        return new ToStringBuilder(this).append("state", state)
                .append("mode", mode)
                .append("target", target)
                .append("deadZone", deadZone)
                .append("backlash", backlash)
                .append("gain", gain)
                .append("maxDriveCurrent", maxDriveCurrent)
                .append("maxDriveRate", maxDriveRate)
                .append("portLock", portLock)
                .append("starboardLock", starboardLock)
                .append("additionalProperties", additionalProperties)
                .toString();
    }

    @Override
    public int hashCode() {

        return new HashCodeBuilder().append(mode)
                .append(backlash)
                .append(starboardLock)
                .append(portLock)
                .append(state)
                .append(additionalProperties)
                .append(deadZone)
                .append(maxDriveRate)
                .append(maxDriveCurrent)
                .append(target)
                .append(gain)
                .toHashCode();
    }

    @Override
    public boolean equals(Object other) {

        if (other == this) {
            return true;
        }
        if ((other instanceof Autopilot) == false) {
            return false;
        }
        Autopilot rhs = ((Autopilot) other);
        return new EqualsBuilder().append(mode, rhs.mode)
                .append(backlash, rhs.backlash)
                .append(starboardLock, rhs.starboardLock)
                .append(portLock, rhs.portLock)
                .append(state, rhs.state)
                .append(additionalProperties, rhs.additionalProperties)
                .append(deadZone, rhs.deadZone)
                .append(maxDriveRate, rhs.maxDriveRate)
                .append(maxDriveCurrent, rhs.maxDriveCurrent)
                .append(target, rhs.target)
                .append(gain, rhs.gain)
                .isEquals();
    }

}
