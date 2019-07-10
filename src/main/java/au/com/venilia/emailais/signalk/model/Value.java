
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

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "minimum",
    "maximum",
    "current",
    "canoe"
})
public class Value {

    /**
     * The minimum draft of the vessel
     * 
     */
    @JsonProperty("minimum")
    @JsonPropertyDescription("The minimum draft of the vessel")
    private Double minimum;
    /**
     * The maximum draft of the vessel
     * 
     */
    @JsonProperty("maximum")
    @JsonPropertyDescription("The maximum draft of the vessel")
    private Double maximum;
    /**
     * The current draft of the vessel
     * 
     */
    @JsonProperty("current")
    @JsonPropertyDescription("The current draft of the vessel")
    private Double current;
    /**
     * The draft of the vessel without protrusions such as keel, centerboard, rudder
     * 
     */
    @JsonProperty("canoe")
    @JsonPropertyDescription("The draft of the vessel without protrusions such as keel, centerboard, rudder")
    private Double canoe;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The minimum draft of the vessel
     * 
     */
    @JsonProperty("minimum")
    public Double getMinimum() {
        return minimum;
    }

    /**
     * The minimum draft of the vessel
     * 
     */
    @JsonProperty("minimum")
    public void setMinimum(Double minimum) {
        this.minimum = minimum;
    }

    /**
     * The maximum draft of the vessel
     * 
     */
    @JsonProperty("maximum")
    public Double getMaximum() {
        return maximum;
    }

    /**
     * The maximum draft of the vessel
     * 
     */
    @JsonProperty("maximum")
    public void setMaximum(Double maximum) {
        this.maximum = maximum;
    }

    /**
     * The current draft of the vessel
     * 
     */
    @JsonProperty("current")
    public Double getCurrent() {
        return current;
    }

    /**
     * The current draft of the vessel
     * 
     */
    @JsonProperty("current")
    public void setCurrent(Double current) {
        this.current = current;
    }

    /**
     * The draft of the vessel without protrusions such as keel, centerboard, rudder
     * 
     */
    @JsonProperty("canoe")
    public Double getCanoe() {
        return canoe;
    }

    /**
     * The draft of the vessel without protrusions such as keel, centerboard, rudder
     * 
     */
    @JsonProperty("canoe")
    public void setCanoe(Double canoe) {
        this.canoe = canoe;
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
        return new ToStringBuilder(this).append("minimum", minimum).append("maximum", maximum).append("current", current).append("canoe", canoe).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(maximum).append(current).append(additionalProperties).append(minimum).append(canoe).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Value) == false) {
            return false;
        }
        Value rhs = ((Value) other);
        return new EqualsBuilder().append(maximum, rhs.maximum).append(current, rhs.current).append(additionalProperties, rhs.additionalProperties).append(minimum, rhs.minimum).append(canoe, rhs.canoe).isEquals();
    }

}
