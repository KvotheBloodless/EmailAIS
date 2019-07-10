
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
 * destination
 * <p>
 * The intended destination of this trip
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "commonName",
    "eta",
    "waypoint"
})
public class Destination {

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("commonName")
    @JsonPropertyDescription("Data should be of type number.")
    private CommonName commonName;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("eta")
    @JsonPropertyDescription("Data should be of type number.")
    private EstimatedTimeOfArrival eta;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("waypoint")
    @JsonPropertyDescription("Data should be of type number.")
    private CommonName waypoint;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("commonName")
    public CommonName getCommonName() {
        return commonName;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("commonName")
    public void setCommonName(CommonName commonName) {
        this.commonName = commonName;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("eta")
    public EstimatedTimeOfArrival getEta() {
        return eta;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("eta")
    public void setEta(EstimatedTimeOfArrival eta) {
        this.eta = eta;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("waypoint")
    public CommonName getWaypoint() {
        return waypoint;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("waypoint")
    public void setWaypoint(CommonName waypoint) {
        this.waypoint = waypoint;
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
        return new ToStringBuilder(this).append("commonName", commonName).append("eta", eta).append("waypoint", waypoint).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(waypoint).append(commonName).append(eta).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Destination) == false) {
            return false;
        }
        Destination rhs = ((Destination) other);
        return new EqualsBuilder().append(waypoint, rhs.waypoint).append(commonName, rhs.commonName).append(eta, rhs.eta).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
