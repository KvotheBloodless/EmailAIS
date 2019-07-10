
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
 * environment
 * <p>
 * Schema describing the environmental child-object of a Vessel.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "outside",
    "inside",
    "water",
    "depth",
    "current",
    "tide",
    "heave",
    "wind",
    "time",
    "mode"
})
public class Environment {

    /**
     * Environmental conditions outside of the vessel's hull
     * 
     */
    @JsonProperty("outside")
    @JsonPropertyDescription("Environmental conditions outside of the vessel's hull")
    private Outside outside;
    /**
     * Environmental conditions inside the vessel's hull
     * 
     */
    @JsonProperty("inside")
    @JsonPropertyDescription("Environmental conditions inside the vessel's hull")
    private Inside inside;
    /**
     * Environmental conditions of the water that the vessel is sailing in
     * 
     */
    @JsonProperty("water")
    @JsonPropertyDescription("Environmental conditions of the water that the vessel is sailing in")
    private Water water;
    /**
     * depth
     * <p>
     * Depth related data
     * 
     */
    @JsonProperty("depth")
    @JsonPropertyDescription("Depth related data")
    private Depth depth;
    /**
     * current
     * <p>
     * Direction and strength of current affecting the vessel
     * 
     */
    @JsonProperty("current")
    @JsonPropertyDescription("Direction and strength of current affecting the vessel")
    private Current current;
    /**
     * tide
     * <p>
     * Tide data
     * 
     */
    @JsonProperty("tide")
    @JsonPropertyDescription("Tide data")
    private Tide tide;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("heave")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature heave;
    /**
     * wind
     * <p>
     * Wind data.
     * 
     */
    @JsonProperty("wind")
    @JsonPropertyDescription("Wind data.")
    private Wind wind;
    /**
     * A time reference for the vessel. All clocks on the vessel dispaying local time should use the timezone offset here. If a timezoneRegion is supplied the timezone must also be supplied. If timezoneRegion is supplied that should be displayed by UIs in preference to simply timezone. ie 12:05 (Europe/London) should be displayed in preference to 12:05 (UTC+01:00)
     * 
     */
    @JsonProperty("time")
    @JsonPropertyDescription("A time reference for the vessel. All clocks on the vessel dispaying local time should use the timezone offset here. If a timezoneRegion is supplied the timezone must also be supplied. If timezoneRegion is supplied that should be displayed by UIs in preference to simply timezone. ie 12:05 (Europe/London) should be displayed in preference to 12:05 (UTC+01:00)")
    private Time time;
    /**
     * Mode of the vessel based on the current conditions. Can be combined with navigation.state to control vessel signals eg switch to night mode for instrumentation and lights, or make sound signals for fog.
     * 
     */
    @JsonProperty("mode")
    @JsonPropertyDescription("Mode of the vessel based on the current conditions. Can be combined with navigation.state to control vessel signals eg switch to night mode for instrumentation and lights, or make sound signals for fog.")
    private Mode mode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Environmental conditions outside of the vessel's hull
     * 
     */
    @JsonProperty("outside")
    public Outside getOutside() {
        return outside;
    }

    /**
     * Environmental conditions outside of the vessel's hull
     * 
     */
    @JsonProperty("outside")
    public void setOutside(Outside outside) {
        this.outside = outside;
    }

    /**
     * Environmental conditions inside the vessel's hull
     * 
     */
    @JsonProperty("inside")
    public Inside getInside() {
        return inside;
    }

    /**
     * Environmental conditions inside the vessel's hull
     * 
     */
    @JsonProperty("inside")
    public void setInside(Inside inside) {
        this.inside = inside;
    }

    /**
     * Environmental conditions of the water that the vessel is sailing in
     * 
     */
    @JsonProperty("water")
    public Water getWater() {
        return water;
    }

    /**
     * Environmental conditions of the water that the vessel is sailing in
     * 
     */
    @JsonProperty("water")
    public void setWater(Water water) {
        this.water = water;
    }

    /**
     * depth
     * <p>
     * Depth related data
     * 
     */
    @JsonProperty("depth")
    public Depth getDepth() {
        return depth;
    }

    /**
     * depth
     * <p>
     * Depth related data
     * 
     */
    @JsonProperty("depth")
    public void setDepth(Depth depth) {
        this.depth = depth;
    }

    /**
     * current
     * <p>
     * Direction and strength of current affecting the vessel
     * 
     */
    @JsonProperty("current")
    public Current getCurrent() {
        return current;
    }

    /**
     * current
     * <p>
     * Direction and strength of current affecting the vessel
     * 
     */
    @JsonProperty("current")
    public void setCurrent(Current current) {
        this.current = current;
    }

    /**
     * tide
     * <p>
     * Tide data
     * 
     */
    @JsonProperty("tide")
    public Tide getTide() {
        return tide;
    }

    /**
     * tide
     * <p>
     * Tide data
     * 
     */
    @JsonProperty("tide")
    public void setTide(Tide tide) {
        this.tide = tide;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("heave")
    public Temperature getHeave() {
        return heave;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("heave")
    public void setHeave(Temperature heave) {
        this.heave = heave;
    }

    /**
     * wind
     * <p>
     * Wind data.
     * 
     */
    @JsonProperty("wind")
    public Wind getWind() {
        return wind;
    }

    /**
     * wind
     * <p>
     * Wind data.
     * 
     */
    @JsonProperty("wind")
    public void setWind(Wind wind) {
        this.wind = wind;
    }

    /**
     * A time reference for the vessel. All clocks on the vessel dispaying local time should use the timezone offset here. If a timezoneRegion is supplied the timezone must also be supplied. If timezoneRegion is supplied that should be displayed by UIs in preference to simply timezone. ie 12:05 (Europe/London) should be displayed in preference to 12:05 (UTC+01:00)
     * 
     */
    @JsonProperty("time")
    public Time getTime() {
        return time;
    }

    /**
     * A time reference for the vessel. All clocks on the vessel dispaying local time should use the timezone offset here. If a timezoneRegion is supplied the timezone must also be supplied. If timezoneRegion is supplied that should be displayed by UIs in preference to simply timezone. ie 12:05 (Europe/London) should be displayed in preference to 12:05 (UTC+01:00)
     * 
     */
    @JsonProperty("time")
    public void setTime(Time time) {
        this.time = time;
    }

    /**
     * Mode of the vessel based on the current conditions. Can be combined with navigation.state to control vessel signals eg switch to night mode for instrumentation and lights, or make sound signals for fog.
     * 
     */
    @JsonProperty("mode")
    public Mode getMode() {
        return mode;
    }

    /**
     * Mode of the vessel based on the current conditions. Can be combined with navigation.state to control vessel signals eg switch to night mode for instrumentation and lights, or make sound signals for fog.
     * 
     */
    @JsonProperty("mode")
    public void setMode(Mode mode) {
        this.mode = mode;
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
        return new ToStringBuilder(this).append("outside", outside).append("inside", inside).append("water", water).append("depth", depth).append("current", current).append("tide", tide).append("heave", heave).append("wind", wind).append("time", time).append("mode", mode).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tide).append(mode).append(current).append(depth).append(outside).append(heave).append(time).append(additionalProperties).append(inside).append(water).append(wind).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Environment) == false) {
            return false;
        }
        Environment rhs = ((Environment) other);
        return new EqualsBuilder().append(tide, rhs.tide).append(mode, rhs.mode).append(current, rhs.current).append(depth, rhs.depth).append(outside, rhs.outside).append(heave, rhs.heave).append(time, rhs.time).append(additionalProperties, rhs.additionalProperties).append(inside, rhs.inside).append(water, rhs.water).append(wind, rhs.wind).isEquals();
    }

}
