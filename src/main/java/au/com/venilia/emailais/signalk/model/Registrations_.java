
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
 * The various registrations of the vessel.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "imo",
    "national",
    "local",
    "other"
})
public class Registrations_ {

    /**
     * The IMO number of the vessel.
     * 
     */
    @JsonProperty("imo")
    @JsonPropertyDescription("The IMO number of the vessel.")
    private String imo;
    /**
     * The national registration number of the vessel.
     * 
     */
    @JsonProperty("national")
    @JsonPropertyDescription("The national registration number of the vessel.")
    private National_ national;
    /**
     * A local or state registration number of the vessel.
     * 
     */
    @JsonProperty("local")
    @JsonPropertyDescription("A local or state registration number of the vessel.")
    private Local local;
    /**
     * Other registration or permits for the vessel.
     * 
     */
    @JsonProperty("other")
    @JsonPropertyDescription("Other registration or permits for the vessel.")
    private Other_ other;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The IMO number of the vessel.
     * 
     */
    @JsonProperty("imo")
    public String getImo() {
        return imo;
    }

    /**
     * The IMO number of the vessel.
     * 
     */
    @JsonProperty("imo")
    public void setImo(String imo) {
        this.imo = imo;
    }

    /**
     * The national registration number of the vessel.
     * 
     */
    @JsonProperty("national")
    public National_ getNational() {
        return national;
    }

    /**
     * The national registration number of the vessel.
     * 
     */
    @JsonProperty("national")
    public void setNational(National_ national) {
        this.national = national;
    }

    /**
     * A local or state registration number of the vessel.
     * 
     */
    @JsonProperty("local")
    public Local getLocal() {
        return local;
    }

    /**
     * A local or state registration number of the vessel.
     * 
     */
    @JsonProperty("local")
    public void setLocal(Local local) {
        this.local = local;
    }

    /**
     * Other registration or permits for the vessel.
     * 
     */
    @JsonProperty("other")
    public Other_ getOther() {
        return other;
    }

    /**
     * Other registration or permits for the vessel.
     * 
     */
    @JsonProperty("other")
    public void setOther(Other_ other) {
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
        return new ToStringBuilder(this).append("imo", imo).append("national", national).append("local", local).append("other", other).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(national).append(imo).append(other).append(additionalProperties).append(local).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Registrations_) == false) {
            return false;
        }
        Registrations_ rhs = ((Registrations_) other);
        return new EqualsBuilder().append(national, rhs.national).append(imo, rhs.imo).append(other, rhs.other).append(additionalProperties, rhs.additionalProperties).append(local, rhs.local).isEquals();
    }

}
