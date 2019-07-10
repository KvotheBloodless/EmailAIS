
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
 * Course
 * <p>
 * The currently active course (can be a route, or just a point one is navigating towards)
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "crossTrackError",
    "bearingTrackTrue",
    "bearingTrackMagnetic",
    "activeRoute",
    "nextPoint",
    "previousPoint"
})
public class CourseRhumbline {

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("crossTrackError")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature crossTrackError;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("bearingTrackTrue")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature bearingTrackTrue;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("bearingTrackMagnetic")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature bearingTrackMagnetic;
    /**
     * Data required if sailing to an active route, defined in resources.
     * 
     */
    @JsonProperty("activeRoute")
    @JsonPropertyDescription("Data required if sailing to an active route, defined in resources.")
    private ActiveRoute activeRoute;
    /**
     * The point on earth the vessel's presently navigating towards
     * 
     */
    @JsonProperty("nextPoint")
    @JsonPropertyDescription("The point on earth the vessel's presently navigating towards")
    private NextPoint nextPoint;
    /**
     * The point on earth the vessel's presently navigating from
     * 
     */
    @JsonProperty("previousPoint")
    @JsonPropertyDescription("The point on earth the vessel's presently navigating from")
    private PreviousPoint previousPoint;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("crossTrackError")
    public Temperature getCrossTrackError() {
        return crossTrackError;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("crossTrackError")
    public void setCrossTrackError(Temperature crossTrackError) {
        this.crossTrackError = crossTrackError;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("bearingTrackTrue")
    public Temperature getBearingTrackTrue() {
        return bearingTrackTrue;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("bearingTrackTrue")
    public void setBearingTrackTrue(Temperature bearingTrackTrue) {
        this.bearingTrackTrue = bearingTrackTrue;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("bearingTrackMagnetic")
    public Temperature getBearingTrackMagnetic() {
        return bearingTrackMagnetic;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("bearingTrackMagnetic")
    public void setBearingTrackMagnetic(Temperature bearingTrackMagnetic) {
        this.bearingTrackMagnetic = bearingTrackMagnetic;
    }

    /**
     * Data required if sailing to an active route, defined in resources.
     * 
     */
    @JsonProperty("activeRoute")
    public ActiveRoute getActiveRoute() {
        return activeRoute;
    }

    /**
     * Data required if sailing to an active route, defined in resources.
     * 
     */
    @JsonProperty("activeRoute")
    public void setActiveRoute(ActiveRoute activeRoute) {
        this.activeRoute = activeRoute;
    }

    /**
     * The point on earth the vessel's presently navigating towards
     * 
     */
    @JsonProperty("nextPoint")
    public NextPoint getNextPoint() {
        return nextPoint;
    }

    /**
     * The point on earth the vessel's presently navigating towards
     * 
     */
    @JsonProperty("nextPoint")
    public void setNextPoint(NextPoint nextPoint) {
        this.nextPoint = nextPoint;
    }

    /**
     * The point on earth the vessel's presently navigating from
     * 
     */
    @JsonProperty("previousPoint")
    public PreviousPoint getPreviousPoint() {
        return previousPoint;
    }

    /**
     * The point on earth the vessel's presently navigating from
     * 
     */
    @JsonProperty("previousPoint")
    public void setPreviousPoint(PreviousPoint previousPoint) {
        this.previousPoint = previousPoint;
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
        return new ToStringBuilder(this).append("crossTrackError", crossTrackError).append("bearingTrackTrue", bearingTrackTrue).append("bearingTrackMagnetic", bearingTrackMagnetic).append("activeRoute", activeRoute).append("nextPoint", nextPoint).append("previousPoint", previousPoint).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(crossTrackError).append(bearingTrackTrue).append(previousPoint).append(nextPoint).append(bearingTrackMagnetic).append(additionalProperties).append(activeRoute).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseRhumbline) == false) {
            return false;
        }
        CourseRhumbline rhs = ((CourseRhumbline) other);
        return new EqualsBuilder().append(crossTrackError, rhs.crossTrackError).append(bearingTrackTrue, rhs.bearingTrackTrue).append(previousPoint, rhs.previousPoint).append(nextPoint, rhs.nextPoint).append(bearingTrackMagnetic, rhs.bearingTrackMagnetic).append(additionalProperties, rhs.additionalProperties).append(activeRoute, rhs.activeRoute).isEquals();
    }

}
