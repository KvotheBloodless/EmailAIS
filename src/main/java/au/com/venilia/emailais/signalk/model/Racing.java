
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
 * Specific navigational data related to yacht racing.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "startLineStb",
    "startLinePort",
    "distanceStartline",
    "timeToStart",
    "timePortDown",
    "timePortUp",
    "timeStbdDown",
    "timeStbdUp",
    "distanceLayline"
})
public class Racing {

    /**
     * position
     * <p>
     * The position in 3 dimensions
     * 
     */
    @JsonProperty("startLineStb")
    @JsonPropertyDescription("The position in 3 dimensions")
    private StartLineStb startLineStb;
    /**
     * position
     * <p>
     * The position in 3 dimensions
     * 
     */
    @JsonProperty("startLinePort")
    @JsonPropertyDescription("The position in 3 dimensions")
    private StartLineStb startLinePort;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("distanceStartline")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature distanceStartline;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("timeToStart")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature timeToStart;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("timePortDown")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature timePortDown;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("timePortUp")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature timePortUp;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("timeStbdDown")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature timeStbdDown;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("timeStbdUp")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature timeStbdUp;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("distanceLayline")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature distanceLayline;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * position
     * <p>
     * The position in 3 dimensions
     * 
     */
    @JsonProperty("startLineStb")
    public StartLineStb getStartLineStb() {
        return startLineStb;
    }

    /**
     * position
     * <p>
     * The position in 3 dimensions
     * 
     */
    @JsonProperty("startLineStb")
    public void setStartLineStb(StartLineStb startLineStb) {
        this.startLineStb = startLineStb;
    }

    /**
     * position
     * <p>
     * The position in 3 dimensions
     * 
     */
    @JsonProperty("startLinePort")
    public StartLineStb getStartLinePort() {
        return startLinePort;
    }

    /**
     * position
     * <p>
     * The position in 3 dimensions
     * 
     */
    @JsonProperty("startLinePort")
    public void setStartLinePort(StartLineStb startLinePort) {
        this.startLinePort = startLinePort;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("distanceStartline")
    public Temperature getDistanceStartline() {
        return distanceStartline;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("distanceStartline")
    public void setDistanceStartline(Temperature distanceStartline) {
        this.distanceStartline = distanceStartline;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("timeToStart")
    public Temperature getTimeToStart() {
        return timeToStart;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("timeToStart")
    public void setTimeToStart(Temperature timeToStart) {
        this.timeToStart = timeToStart;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("timePortDown")
    public Temperature getTimePortDown() {
        return timePortDown;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("timePortDown")
    public void setTimePortDown(Temperature timePortDown) {
        this.timePortDown = timePortDown;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("timePortUp")
    public Temperature getTimePortUp() {
        return timePortUp;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("timePortUp")
    public void setTimePortUp(Temperature timePortUp) {
        this.timePortUp = timePortUp;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("timeStbdDown")
    public Temperature getTimeStbdDown() {
        return timeStbdDown;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("timeStbdDown")
    public void setTimeStbdDown(Temperature timeStbdDown) {
        this.timeStbdDown = timeStbdDown;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("timeStbdUp")
    public Temperature getTimeStbdUp() {
        return timeStbdUp;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("timeStbdUp")
    public void setTimeStbdUp(Temperature timeStbdUp) {
        this.timeStbdUp = timeStbdUp;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("distanceLayline")
    public Temperature getDistanceLayline() {
        return distanceLayline;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("distanceLayline")
    public void setDistanceLayline(Temperature distanceLayline) {
        this.distanceLayline = distanceLayline;
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
        return new ToStringBuilder(this).append("startLineStb", startLineStb).append("startLinePort", startLinePort).append("distanceStartline", distanceStartline).append("timeToStart", timeToStart).append("timePortDown", timePortDown).append("timePortUp", timePortUp).append("timeStbdDown", timeStbdDown).append("timeStbdUp", timeStbdUp).append("distanceLayline", distanceLayline).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(timeStbdDown).append(distanceLayline).append(distanceStartline).append(timePortUp).append(timeStbdUp).append(additionalProperties).append(startLineStb).append(startLinePort).append(timeToStart).append(timePortDown).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Racing) == false) {
            return false;
        }
        Racing rhs = ((Racing) other);
        return new EqualsBuilder().append(timeStbdDown, rhs.timeStbdDown).append(distanceLayline, rhs.distanceLayline).append(distanceStartline, rhs.distanceStartline).append(timePortUp, rhs.timePortUp).append(timeStbdUp, rhs.timeStbdUp).append(additionalProperties, rhs.additionalProperties).append(startLineStb, rhs.startLineStb).append(startLinePort, rhs.startLinePort).append(timeToStart, rhs.timeToStart).append(timePortDown, rhs.timePortDown).isEquals();
    }

}
