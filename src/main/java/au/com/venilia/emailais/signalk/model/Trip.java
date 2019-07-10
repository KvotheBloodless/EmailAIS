
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
 * Trip data
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "log",
    "lastReset"
})
public class Trip {

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("log")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature log;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("lastReset")
    @JsonPropertyDescription("Data should be of type number.")
    private EstimatedTimeOfArrival lastReset;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("log")
    public Temperature getLog() {
        return log;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("log")
    public void setLog(Temperature log) {
        this.log = log;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("lastReset")
    public EstimatedTimeOfArrival getLastReset() {
        return lastReset;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("lastReset")
    public void setLastReset(EstimatedTimeOfArrival lastReset) {
        this.lastReset = lastReset;
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
        return new ToStringBuilder(this).append("log", log).append("lastReset", lastReset).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(lastReset).append(additionalProperties).append(log).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Trip) == false) {
            return false;
        }
        Trip rhs = ((Trip) other);
        return new EqualsBuilder().append(lastReset, rhs.lastReset).append(additionalProperties, rhs.additionalProperties).append(log, rhs.log).isEquals();
    }

}
