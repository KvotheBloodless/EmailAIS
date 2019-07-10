
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
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Electrical Properties
 * <p>
 * Schema describing the electrical child-object of a Vessel.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "batteries",
    "inverters",
    "chargers",
    "alternators",
    "solar",
    "ac"
})
public class Electrical {

    /**
     * Data about the vessel's batteries
     * 
     */
    @JsonProperty("batteries")
    @JsonPropertyDescription("Data about the vessel's batteries")
    private Object batteries;
    /**
     * Data about the Inverter that has both DC and AC qualities
     * 
     */
    @JsonProperty("inverters")
    @JsonPropertyDescription("Data about the Inverter that has both DC and AC qualities")
    private Object inverters;
    /**
     * Data about AC sourced battery charger
     * 
     */
    @JsonProperty("chargers")
    @JsonPropertyDescription("Data about AC sourced battery charger")
    private Object chargers;
    /**
     * Data about an Alternator charging device
     * 
     */
    @JsonProperty("alternators")
    @JsonPropertyDescription("Data about an Alternator charging device")
    private Object alternators;
    /**
     * Data about Solar charging device(s)
     * 
     */
    @JsonProperty("solar")
    @JsonPropertyDescription("Data about Solar charging device(s)")
    private Object solar;
    /**
     * AC buses
     * 
     */
    @JsonProperty("ac")
    @JsonPropertyDescription("AC buses")
    private Object ac;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Data about the vessel's batteries
     * 
     */
    @JsonProperty("batteries")
    public Object getBatteries() {
        return batteries;
    }

    /**
     * Data about the vessel's batteries
     * 
     */
    @JsonProperty("batteries")
    public void setBatteries(Object batteries) {
        this.batteries = batteries;
    }

    /**
     * Data about the Inverter that has both DC and AC qualities
     * 
     */
    @JsonProperty("inverters")
    public Object getInverters() {
        return inverters;
    }

    /**
     * Data about the Inverter that has both DC and AC qualities
     * 
     */
    @JsonProperty("inverters")
    public void setInverters(Object inverters) {
        this.inverters = inverters;
    }

    /**
     * Data about AC sourced battery charger
     * 
     */
    @JsonProperty("chargers")
    public Object getChargers() {
        return chargers;
    }

    /**
     * Data about AC sourced battery charger
     * 
     */
    @JsonProperty("chargers")
    public void setChargers(Object chargers) {
        this.chargers = chargers;
    }

    /**
     * Data about an Alternator charging device
     * 
     */
    @JsonProperty("alternators")
    public Object getAlternators() {
        return alternators;
    }

    /**
     * Data about an Alternator charging device
     * 
     */
    @JsonProperty("alternators")
    public void setAlternators(Object alternators) {
        this.alternators = alternators;
    }

    /**
     * Data about Solar charging device(s)
     * 
     */
    @JsonProperty("solar")
    public Object getSolar() {
        return solar;
    }

    /**
     * Data about Solar charging device(s)
     * 
     */
    @JsonProperty("solar")
    public void setSolar(Object solar) {
        this.solar = solar;
    }

    /**
     * AC buses
     * 
     */
    @JsonProperty("ac")
    public Object getAc() {
        return ac;
    }

    /**
     * AC buses
     * 
     */
    @JsonProperty("ac")
    public void setAc(Object ac) {
        this.ac = ac;
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
        return new ToStringBuilder(this).append("batteries", batteries).append("inverters", inverters).append("chargers", chargers).append("alternators", alternators).append("solar", solar).append("ac", ac).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(alternators).append(ac).append(batteries).append(inverters).append(solar).append(additionalProperties).append(chargers).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Electrical) == false) {
            return false;
        }
        Electrical rhs = ((Electrical) other);
        return new EqualsBuilder().append(alternators, rhs.alternators).append(ac, rhs.ac).append(batteries, rhs.batteries).append(inverters, rhs.inverters).append(solar, rhs.solar).append(additionalProperties, rhs.additionalProperties).append(chargers, rhs.chargers).isEquals();
    }

}
