
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
 * Data required if sailing to an active route, defined in resources.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "href",
    "estimatedTimeOfArrival",
    "startTime"
})
public class ActiveRoute {

    /**
     * A reference (URL) to the presently active route, in resources.
     * 
     */
    @JsonProperty("href")
    @JsonPropertyDescription("A reference (URL) to the presently active route, in resources.")
    private String href;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("estimatedTimeOfArrival")
    @JsonPropertyDescription("Data should be of type number.")
    private EstimatedTimeOfArrival estimatedTimeOfArrival;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("startTime")
    @JsonPropertyDescription("Data should be of type number.")
    private EstimatedTimeOfArrival startTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * A reference (URL) to the presently active route, in resources.
     * 
     */
    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    /**
     * A reference (URL) to the presently active route, in resources.
     * 
     */
    @JsonProperty("href")
    public void setHref(String href) {
        this.href = href;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("estimatedTimeOfArrival")
    public EstimatedTimeOfArrival getEstimatedTimeOfArrival() {
        return estimatedTimeOfArrival;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("estimatedTimeOfArrival")
    public void setEstimatedTimeOfArrival(EstimatedTimeOfArrival estimatedTimeOfArrival) {
        this.estimatedTimeOfArrival = estimatedTimeOfArrival;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("startTime")
    public EstimatedTimeOfArrival getStartTime() {
        return startTime;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("startTime")
    public void setStartTime(EstimatedTimeOfArrival startTime) {
        this.startTime = startTime;
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
        return new ToStringBuilder(this).append("href", href).append("estimatedTimeOfArrival", estimatedTimeOfArrival).append("startTime", startTime).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(startTime).append(href).append(additionalProperties).append(estimatedTimeOfArrival).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ActiveRoute) == false) {
            return false;
        }
        ActiveRoute rhs = ((ActiveRoute) other);
        return new EqualsBuilder().append(startTime, rhs.startTime).append(href, rhs.href).append(additionalProperties, rhs.additionalProperties).append(estimatedTimeOfArrival, rhs.estimatedTimeOfArrival).isEquals();
    }

}
