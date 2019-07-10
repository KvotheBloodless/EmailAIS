
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
 * target
 * <p>
 * Autopilot target
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "windAngleApparent",
    "headingTrue",
    "headingMagnetic"
})
public class Target {

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("windAngleApparent")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature windAngleApparent;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("headingTrue")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature headingTrue;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("headingMagnetic")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature headingMagnetic;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("windAngleApparent")
    public Temperature getWindAngleApparent() {
        return windAngleApparent;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("windAngleApparent")
    public void setWindAngleApparent(Temperature windAngleApparent) {
        this.windAngleApparent = windAngleApparent;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("headingTrue")
    public Temperature getHeadingTrue() {
        return headingTrue;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("headingTrue")
    public void setHeadingTrue(Temperature headingTrue) {
        this.headingTrue = headingTrue;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("headingMagnetic")
    public Temperature getHeadingMagnetic() {
        return headingMagnetic;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("headingMagnetic")
    public void setHeadingMagnetic(Temperature headingMagnetic) {
        this.headingMagnetic = headingMagnetic;
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
        return new ToStringBuilder(this).append("windAngleApparent", windAngleApparent).append("headingTrue", headingTrue).append("headingMagnetic", headingMagnetic).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(windAngleApparent).append(additionalProperties).append(headingTrue).append(headingMagnetic).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Target) == false) {
            return false;
        }
        Target rhs = ((Target) other);
        return new EqualsBuilder().append(windAngleApparent, rhs.windAngleApparent).append(additionalProperties, rhs.additionalProperties).append(headingTrue, rhs.headingTrue).append(headingMagnetic, rhs.headingMagnetic).isEquals();
    }

}
