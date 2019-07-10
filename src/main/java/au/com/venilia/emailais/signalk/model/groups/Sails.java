
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
 * sails
 * <p>
 * An object describing the vessels sails if the vessel is a sailboat.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "inventory",
    "area"
})
public class Sails {

    /**
     * An object containing a description of each sail available to the vessel crew
     * 
     */
    @JsonProperty("inventory")
    @JsonPropertyDescription("An object containing a description of each sail available to the vessel crew")
    private Inventory inventory;
    /**
     * An object containing information about the vessels' sails.
     * 
     */
    @JsonProperty("area")
    @JsonPropertyDescription("An object containing information about the vessels' sails.")
    private Area area;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * An object containing a description of each sail available to the vessel crew
     * 
     */
    @JsonProperty("inventory")
    public Inventory getInventory() {
        return inventory;
    }

    /**
     * An object containing a description of each sail available to the vessel crew
     * 
     */
    @JsonProperty("inventory")
    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    /**
     * An object containing information about the vessels' sails.
     * 
     */
    @JsonProperty("area")
    public Area getArea() {
        return area;
    }

    /**
     * An object containing information about the vessels' sails.
     * 
     */
    @JsonProperty("area")
    public void setArea(Area area) {
        this.area = area;
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
        return new ToStringBuilder(this).append("inventory", inventory).append("area", area).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(area).append(additionalProperties).append(inventory).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sails) == false) {
            return false;
        }
        Sails rhs = ((Sails) other);
        return new EqualsBuilder().append(area, rhs.area).append(additionalProperties, rhs.additionalProperties).append(inventory, rhs.inventory).isEquals();
    }

}
