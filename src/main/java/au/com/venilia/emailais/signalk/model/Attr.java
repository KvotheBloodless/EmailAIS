
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
 * _attr schema.
 * <p>
 * Filesystem specific data, e.g. security, possibly more later.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "_mode",
    "_owner",
    "_group"
})
public class Attr {

    /**
     * _mode schema.
     * <p>
     * Unix style permissions, often written in `owner:group:other` form, `-rw-r--r--`
     * 
     */
    @JsonProperty("_mode")
    @JsonPropertyDescription("Unix style permissions, often written in `owner:group:other` form, `-rw-r--r--`")
    private Integer mode = 644;
    /**
     * _owner schema.
     * <p>
     * The owner of this resource.
     * 
     */
    @JsonProperty("_owner")
    @JsonPropertyDescription("The owner of this resource.")
    private String owner = "self";
    /**
     * _group schema.
     * <p>
     * The group owning this resource.
     * 
     */
    @JsonProperty("_group")
    @JsonPropertyDescription("The group owning this resource.")
    private String group = "self";
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * _mode schema.
     * <p>
     * Unix style permissions, often written in `owner:group:other` form, `-rw-r--r--`
     * 
     */
    @JsonProperty("_mode")
    public Integer getMode() {
        return mode;
    }

    /**
     * _mode schema.
     * <p>
     * Unix style permissions, often written in `owner:group:other` form, `-rw-r--r--`
     * 
     */
    @JsonProperty("_mode")
    public void setMode(Integer mode) {
        this.mode = mode;
    }

    /**
     * _owner schema.
     * <p>
     * The owner of this resource.
     * 
     */
    @JsonProperty("_owner")
    public String getOwner() {
        return owner;
    }

    /**
     * _owner schema.
     * <p>
     * The owner of this resource.
     * 
     */
    @JsonProperty("_owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * _group schema.
     * <p>
     * The group owning this resource.
     * 
     */
    @JsonProperty("_group")
    public String getGroup() {
        return group;
    }

    /**
     * _group schema.
     * <p>
     * The group owning this resource.
     * 
     */
    @JsonProperty("_group")
    public void setGroup(String group) {
        this.group = group;
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
        return new ToStringBuilder(this).append("mode", mode).append("owner", owner).append("group", group).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(mode).append(owner).append(additionalProperties).append(group).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Attr) == false) {
            return false;
        }
        Attr rhs = ((Attr) other);
        return new EqualsBuilder().append(mode, rhs.mode).append(owner, rhs.owner).append(additionalProperties, rhs.additionalProperties).append(group, rhs.group).isEquals();
    }

}
