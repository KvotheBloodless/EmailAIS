
package au.com.venilia.emailais.signalk.model;

import java.util.Date;
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
 * tide
 * <p>
 * Tide data
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "heightHigh",
    "heightNow",
    "heightLow",
    "timeLow",
    "timeHigh"
})
public class Tide {

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("heightHigh")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature heightHigh;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("heightNow")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature heightNow;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("heightLow")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature heightLow;
    /**
     * RFC 3339 (UTC only without local offset) string representing date and time.
     * 
     */
    @JsonProperty("timeLow")
    @JsonPropertyDescription("RFC 3339 (UTC only without local offset) string representing date and time.")
    private Date timeLow;
    /**
     * RFC 3339 (UTC only without local offset) string representing date and time.
     * 
     */
    @JsonProperty("timeHigh")
    @JsonPropertyDescription("RFC 3339 (UTC only without local offset) string representing date and time.")
    private Date timeHigh;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("heightHigh")
    public Temperature getHeightHigh() {
        return heightHigh;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("heightHigh")
    public void setHeightHigh(Temperature heightHigh) {
        this.heightHigh = heightHigh;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("heightNow")
    public Temperature getHeightNow() {
        return heightNow;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("heightNow")
    public void setHeightNow(Temperature heightNow) {
        this.heightNow = heightNow;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("heightLow")
    public Temperature getHeightLow() {
        return heightLow;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("heightLow")
    public void setHeightLow(Temperature heightLow) {
        this.heightLow = heightLow;
    }

    /**
     * RFC 3339 (UTC only without local offset) string representing date and time.
     * 
     */
    @JsonProperty("timeLow")
    public Date getTimeLow() {
        return timeLow;
    }

    /**
     * RFC 3339 (UTC only without local offset) string representing date and time.
     * 
     */
    @JsonProperty("timeLow")
    public void setTimeLow(Date timeLow) {
        this.timeLow = timeLow;
    }

    /**
     * RFC 3339 (UTC only without local offset) string representing date and time.
     * 
     */
    @JsonProperty("timeHigh")
    public Date getTimeHigh() {
        return timeHigh;
    }

    /**
     * RFC 3339 (UTC only without local offset) string representing date and time.
     * 
     */
    @JsonProperty("timeHigh")
    public void setTimeHigh(Date timeHigh) {
        this.timeHigh = timeHigh;
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
        return new ToStringBuilder(this).append("heightHigh", heightHigh).append("heightNow", heightNow).append("heightLow", heightLow).append("timeLow", timeLow).append("timeHigh", timeHigh).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(heightHigh).append(timeHigh).append(heightLow).append(timeLow).append(heightNow).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tide) == false) {
            return false;
        }
        Tide rhs = ((Tide) other);
        return new EqualsBuilder().append(heightHigh, rhs.heightHigh).append(timeHigh, rhs.timeHigh).append(heightLow, rhs.heightLow).append(timeLow, rhs.timeLow).append(heightNow, rhs.heightNow).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
