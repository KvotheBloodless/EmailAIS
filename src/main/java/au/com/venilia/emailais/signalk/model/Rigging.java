
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
 * rigging
 * <p>
 * Information about the vessel's rigging
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "configuration",
    "masts"
})
public class Rigging {

    /**
     * The configuration of the rigging
     * 
     */
    @JsonProperty("configuration")
    @JsonPropertyDescription("The configuration of the rigging")
    private String configuration;
    /**
     * The number of masts on the vessel.
     * 
     */
    @JsonProperty("masts")
    @JsonPropertyDescription("The number of masts on the vessel.")
    private Double masts;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The configuration of the rigging
     * 
     */
    @JsonProperty("configuration")
    public String getConfiguration() {
        return configuration;
    }

    /**
     * The configuration of the rigging
     * 
     */
    @JsonProperty("configuration")
    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    /**
     * The number of masts on the vessel.
     * 
     */
    @JsonProperty("masts")
    public Double getMasts() {
        return masts;
    }

    /**
     * The number of masts on the vessel.
     * 
     */
    @JsonProperty("masts")
    public void setMasts(Double masts) {
        this.masts = masts;
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
        return new ToStringBuilder(this).append("configuration", configuration).append("masts", masts).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(masts).append(additionalProperties).append(configuration).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Rigging) == false) {
            return false;
        }
        Rigging rhs = ((Rigging) other);
        return new EqualsBuilder().append(masts, rhs.masts).append(additionalProperties, rhs.additionalProperties).append(configuration, rhs.configuration).isEquals();
    }

}
