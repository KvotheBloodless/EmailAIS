
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
 * The various registrations of the aircraft.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "imo",
    "national",
    "other"
})
public class Registrations {

    /**
     * The IMO number of the aircraft.
     * 
     */
    @JsonProperty("imo")
    @JsonPropertyDescription("The IMO number of the aircraft.")
    private String imo;
    /**
     * The national registration number of the aircraft.
     * 
     */
    @JsonProperty("national")
    @JsonPropertyDescription("The national registration number of the aircraft.")
    private National national;
    /**
     * Other registration or permits for the aircraft.
     * 
     */
    @JsonProperty("other")
    @JsonPropertyDescription("Other registration or permits for the aircraft.")
    private Other other;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The IMO number of the aircraft.
     * 
     */
    @JsonProperty("imo")
    public String getImo() {
        return imo;
    }

    /**
     * The IMO number of the aircraft.
     * 
     */
    @JsonProperty("imo")
    public void setImo(String imo) {
        this.imo = imo;
    }

    /**
     * The national registration number of the aircraft.
     * 
     */
    @JsonProperty("national")
    public National getNational() {
        return national;
    }

    /**
     * The national registration number of the aircraft.
     * 
     */
    @JsonProperty("national")
    public void setNational(National national) {
        this.national = national;
    }

    /**
     * Other registration or permits for the aircraft.
     * 
     */
    @JsonProperty("other")
    public Other getOther() {
        return other;
    }

    /**
     * Other registration or permits for the aircraft.
     * 
     */
    @JsonProperty("other")
    public void setOther(Other other) {
        this.other = other;
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
        return new ToStringBuilder(this).append("imo", imo).append("national", national).append("other", other).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(national).append(imo).append(other).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Registrations) == false) {
            return false;
        }
        Registrations rhs = ((Registrations) other);
        return new EqualsBuilder().append(national, rhs.national).append(imo, rhs.imo).append(other, rhs.other).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
