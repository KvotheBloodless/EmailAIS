
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
 * An object containing information about the vessels' sails.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "total",
    "active"
})
public class Area {

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("total")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature total;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("active")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature active;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("total")
    public Temperature getTotal() {
        return total;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("total")
    public void setTotal(Temperature total) {
        this.total = total;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("active")
    public Temperature getActive() {
        return active;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("active")
    public void setActive(Temperature active) {
        this.active = active;
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
        return new ToStringBuilder(this).append("total", total).append("active", active).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(active).append(total).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Area) == false) {
            return false;
        }
        Area rhs = ((Area) other);
        return new EqualsBuilder().append(active, rhs.active).append(total, rhs.total).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
