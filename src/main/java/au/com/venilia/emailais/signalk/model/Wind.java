
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
 * wind
 * <p>
 * Wind data.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "angleApparent",
    "angleTrueGround",
    "angleTrueWater",
    "directionChangeAlarm",
    "directionTrue",
    "directionMagnetic",
    "speedTrue",
    "speedOverGround",
    "speedApparent"
})
public class Wind {

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("angleApparent")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature angleApparent;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("angleTrueGround")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature angleTrueGround;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("angleTrueWater")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature angleTrueWater;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("directionChangeAlarm")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature directionChangeAlarm;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("directionTrue")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature directionTrue;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("directionMagnetic")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature directionMagnetic;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("speedTrue")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature speedTrue;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("speedOverGround")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature speedOverGround;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("speedApparent")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature speedApparent;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("angleApparent")
    public Temperature getAngleApparent() {
        return angleApparent;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("angleApparent")
    public void setAngleApparent(Temperature angleApparent) {
        this.angleApparent = angleApparent;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("angleTrueGround")
    public Temperature getAngleTrueGround() {
        return angleTrueGround;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("angleTrueGround")
    public void setAngleTrueGround(Temperature angleTrueGround) {
        this.angleTrueGround = angleTrueGround;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("angleTrueWater")
    public Temperature getAngleTrueWater() {
        return angleTrueWater;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("angleTrueWater")
    public void setAngleTrueWater(Temperature angleTrueWater) {
        this.angleTrueWater = angleTrueWater;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("directionChangeAlarm")
    public Temperature getDirectionChangeAlarm() {
        return directionChangeAlarm;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("directionChangeAlarm")
    public void setDirectionChangeAlarm(Temperature directionChangeAlarm) {
        this.directionChangeAlarm = directionChangeAlarm;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("directionTrue")
    public Temperature getDirectionTrue() {
        return directionTrue;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("directionTrue")
    public void setDirectionTrue(Temperature directionTrue) {
        this.directionTrue = directionTrue;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("directionMagnetic")
    public Temperature getDirectionMagnetic() {
        return directionMagnetic;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("directionMagnetic")
    public void setDirectionMagnetic(Temperature directionMagnetic) {
        this.directionMagnetic = directionMagnetic;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("speedTrue")
    public Temperature getSpeedTrue() {
        return speedTrue;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("speedTrue")
    public void setSpeedTrue(Temperature speedTrue) {
        this.speedTrue = speedTrue;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("speedOverGround")
    public Temperature getSpeedOverGround() {
        return speedOverGround;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("speedOverGround")
    public void setSpeedOverGround(Temperature speedOverGround) {
        this.speedOverGround = speedOverGround;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("speedApparent")
    public Temperature getSpeedApparent() {
        return speedApparent;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("speedApparent")
    public void setSpeedApparent(Temperature speedApparent) {
        this.speedApparent = speedApparent;
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
        return new ToStringBuilder(this).append("angleApparent", angleApparent).append("angleTrueGround", angleTrueGround).append("angleTrueWater", angleTrueWater).append("directionChangeAlarm", directionChangeAlarm).append("directionTrue", directionTrue).append("directionMagnetic", directionMagnetic).append("speedTrue", speedTrue).append("speedOverGround", speedOverGround).append("speedApparent", speedApparent).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(angleTrueGround).append(directionMagnetic).append(speedApparent).append(angleApparent).append(directionTrue).append(speedOverGround).append(directionChangeAlarm).append(additionalProperties).append(speedTrue).append(angleTrueWater).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Wind) == false) {
            return false;
        }
        Wind rhs = ((Wind) other);
        return new EqualsBuilder().append(angleTrueGround, rhs.angleTrueGround).append(directionMagnetic, rhs.directionMagnetic).append(speedApparent, rhs.speedApparent).append(angleApparent, rhs.angleApparent).append(directionTrue, rhs.directionTrue).append(speedOverGround, rhs.speedOverGround).append(directionChangeAlarm, rhs.directionChangeAlarm).append(additionalProperties, rhs.additionalProperties).append(speedTrue, rhs.speedTrue).append(angleTrueWater, rhs.angleTrueWater).isEquals();
    }

}
