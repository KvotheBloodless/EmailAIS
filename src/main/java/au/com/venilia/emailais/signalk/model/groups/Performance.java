
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
 * performance
 * <p>
 * Schema describing the performance child-object of a Vessel.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
        "polarSpeed",
        "polarSpeedRatio",
        "velocityMadeGood",
        "velocityMadeGoodToWaypoint",
        "beatAngle",
        "beatAngleVelocityMadeGood",
        "beatAngleTargetSpeed",
        "gybeAngle",
        "gybeAngleVelocityMadeGood",
        "gybeAngleTargetSpeed",
        "targetAngle",
        "targetSpeed",
        "leeway",
        "tackMagnetic",
        "tackTrue"
})
public class Performance {

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("polarSpeed")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature polarSpeed;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("polarSpeedRatio")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature polarSpeedRatio;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("velocityMadeGood")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature velocityMadeGood;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("velocityMadeGoodToWaypoint")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature velocityMadeGoodToWaypoint;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("beatAngle")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature beatAngle;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("beatAngleVelocityMadeGood")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature beatAngleVelocityMadeGood;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("beatAngleTargetSpeed")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature beatAngleTargetSpeed;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("gybeAngle")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature gybeAngle;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("gybeAngleVelocityMadeGood")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature gybeAngleVelocityMadeGood;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("gybeAngleTargetSpeed")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature gybeAngleTargetSpeed;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("targetAngle")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature targetAngle;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("targetSpeed")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature targetSpeed;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("leeway")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature leeway;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("tackMagnetic")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature tackMagnetic;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("tackTrue")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature tackTrue;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("polarSpeed")
    public Temperature getPolarSpeed() {

        return polarSpeed;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("polarSpeed")
    public void setPolarSpeed(Temperature polarSpeed) {

        this.polarSpeed = polarSpeed;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("polarSpeedRatio")
    public Temperature getPolarSpeedRatio() {

        return polarSpeedRatio;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("polarSpeedRatio")
    public void setPolarSpeedRatio(Temperature polarSpeedRatio) {

        this.polarSpeedRatio = polarSpeedRatio;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("velocityMadeGood")
    public Temperature getVelocityMadeGood() {

        return velocityMadeGood;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("velocityMadeGood")
    public void setVelocityMadeGood(Temperature velocityMadeGood) {

        this.velocityMadeGood = velocityMadeGood;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("velocityMadeGoodToWaypoint")
    public Temperature getVelocityMadeGoodToWaypoint() {

        return velocityMadeGoodToWaypoint;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("velocityMadeGoodToWaypoint")
    public void setVelocityMadeGoodToWaypoint(Temperature velocityMadeGoodToWaypoint) {

        this.velocityMadeGoodToWaypoint = velocityMadeGoodToWaypoint;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("beatAngle")
    public Temperature getBeatAngle() {

        return beatAngle;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("beatAngle")
    public void setBeatAngle(Temperature beatAngle) {

        this.beatAngle = beatAngle;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("beatAngleVelocityMadeGood")
    public Temperature getBeatAngleVelocityMadeGood() {

        return beatAngleVelocityMadeGood;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("beatAngleVelocityMadeGood")
    public void setBeatAngleVelocityMadeGood(Temperature beatAngleVelocityMadeGood) {

        this.beatAngleVelocityMadeGood = beatAngleVelocityMadeGood;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("beatAngleTargetSpeed")
    public Temperature getBeatAngleTargetSpeed() {

        return beatAngleTargetSpeed;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("beatAngleTargetSpeed")
    public void setBeatAngleTargetSpeed(Temperature beatAngleTargetSpeed) {

        this.beatAngleTargetSpeed = beatAngleTargetSpeed;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("gybeAngle")
    public Temperature getGybeAngle() {

        return gybeAngle;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("gybeAngle")
    public void setGybeAngle(Temperature gybeAngle) {

        this.gybeAngle = gybeAngle;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("gybeAngleVelocityMadeGood")
    public Temperature getGybeAngleVelocityMadeGood() {

        return gybeAngleVelocityMadeGood;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("gybeAngleVelocityMadeGood")
    public void setGybeAngleVelocityMadeGood(Temperature gybeAngleVelocityMadeGood) {

        this.gybeAngleVelocityMadeGood = gybeAngleVelocityMadeGood;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("gybeAngleTargetSpeed")
    public Temperature getGybeAngleTargetSpeed() {

        return gybeAngleTargetSpeed;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("gybeAngleTargetSpeed")
    public void setGybeAngleTargetSpeed(Temperature gybeAngleTargetSpeed) {

        this.gybeAngleTargetSpeed = gybeAngleTargetSpeed;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("targetAngle")
    public Temperature getTargetAngle() {

        return targetAngle;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("targetAngle")
    public void setTargetAngle(Temperature targetAngle) {

        this.targetAngle = targetAngle;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("targetSpeed")
    public Temperature getTargetSpeed() {

        return targetSpeed;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("targetSpeed")
    public void setTargetSpeed(Temperature targetSpeed) {

        this.targetSpeed = targetSpeed;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("leeway")
    public Temperature getLeeway() {

        return leeway;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("leeway")
    public void setLeeway(Temperature leeway) {

        this.leeway = leeway;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("tackMagnetic")
    public Temperature getTackMagnetic() {

        return tackMagnetic;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("tackMagnetic")
    public void setTackMagnetic(Temperature tackMagnetic) {

        this.tackMagnetic = tackMagnetic;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("tackTrue")
    public Temperature getTackTrue() {

        return tackTrue;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("tackTrue")
    public void setTackTrue(Temperature tackTrue) {

        this.tackTrue = tackTrue;
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

        return new ToStringBuilder(this).append("polarSpeed", polarSpeed)
                .append("polarSpeedRatio", polarSpeedRatio)
                .append("velocityMadeGood", velocityMadeGood)
                .append("velocityMadeGoodToWaypoint", velocityMadeGoodToWaypoint)
                .append("beatAngle", beatAngle)
                .append("beatAngleVelocityMadeGood", beatAngleVelocityMadeGood)
                .append("beatAngleTargetSpeed", beatAngleTargetSpeed)
                .append("gybeAngle", gybeAngle)
                .append("gybeAngleVelocityMadeGood", gybeAngleVelocityMadeGood)
                .append("gybeAngleTargetSpeed", gybeAngleTargetSpeed)
                .append("targetAngle", targetAngle)
                .append("targetSpeed", targetSpeed)
                .append("leeway", leeway)
                .append("tackMagnetic", tackMagnetic)
                .append("tackTrue", tackTrue)
                .append("additionalProperties", additionalProperties)
                .toString();
    }

    @Override
    public int hashCode() {

        return new HashCodeBuilder().append(beatAngle)
                .append(targetSpeed)
                .append(tackTrue)
                .append(velocityMadeGoodToWaypoint)
                .append(gybeAngle)
                .append(tackMagnetic)
                .append(leeway)
                .append(gybeAngleVelocityMadeGood)
                .append(beatAngleTargetSpeed)
                .append(gybeAngleTargetSpeed)
                .append(targetAngle)
                .append(velocityMadeGood)
                .append(beatAngleVelocityMadeGood)
                .append(polarSpeedRatio)
                .append(additionalProperties)
                .append(polarSpeed)
                .toHashCode();
    }

    @Override
    public boolean equals(Object other) {

        if (other == this) {
            return true;
        }
        if ((other instanceof Performance) == false) {
            return false;
        }
        Performance rhs = ((Performance) other);
        return new EqualsBuilder().append(beatAngle, rhs.beatAngle)
                .append(targetSpeed, rhs.targetSpeed)
                .append(tackTrue, rhs.tackTrue)
                .append(velocityMadeGoodToWaypoint, rhs.velocityMadeGoodToWaypoint)
                .append(gybeAngle, rhs.gybeAngle)
                .append(tackMagnetic, rhs.tackMagnetic)
                .append(leeway, rhs.leeway)
                .append(gybeAngleVelocityMadeGood, rhs.gybeAngleVelocityMadeGood)
                .append(beatAngleTargetSpeed, rhs.beatAngleTargetSpeed)
                .append(gybeAngleTargetSpeed, rhs.gybeAngleTargetSpeed)
                .append(targetAngle, rhs.targetAngle)
                .append(velocityMadeGood, rhs.velocityMadeGood)
                .append(beatAngleVelocityMadeGood, rhs.beatAngleVelocityMadeGood)
                .append(polarSpeedRatio, rhs.polarSpeedRatio)
                .append(additionalProperties, rhs.additionalProperties)
                .append(polarSpeed, rhs.polarSpeed)
                .isEquals();
    }

}
