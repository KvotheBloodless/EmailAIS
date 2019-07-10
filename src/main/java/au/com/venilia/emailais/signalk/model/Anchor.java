
package au.com.venilia.emailais.signalk.model;

import java.util.Date;
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
 * anchor
 * <p>
 * The anchor data, for anchor watch etc
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "source",
    "timestamp",
    "maxRadius",
    "currentRadius",
    "position"
})
public class Anchor {

    /**
     * Source of data in delta format, a record of where the data was received from. An object containing at least the properties defined in 'properties', but can contain anything beyond that.
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("Source of data in delta format, a record of where the data was received from. An object containing at least the properties defined in 'properties', but can contain anything beyond that.")
    private Source source;
    /**
     * RFC 3339 (UTC only without local offset) string representing date and time.
     * 
     */
    @JsonProperty("timestamp")
    @JsonPropertyDescription("RFC 3339 (UTC only without local offset) string representing date and time.")
    private Date timestamp;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("maxRadius")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature maxRadius;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("currentRadius")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature currentRadius;
    /**
     * position
     * <p>
     * The position in 3 dimensions
     * 
     */
    @JsonProperty("position")
    @JsonPropertyDescription("The position in 3 dimensions")
    private StartLineStb position;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Source of data in delta format, a record of where the data was received from. An object containing at least the properties defined in 'properties', but can contain anything beyond that.
     * 
     */
    @JsonProperty("source")
    public Source getSource() {
        return source;
    }

    /**
     * Source of data in delta format, a record of where the data was received from. An object containing at least the properties defined in 'properties', but can contain anything beyond that.
     * 
     */
    @JsonProperty("source")
    public void setSource(Source source) {
        this.source = source;
    }

    /**
     * RFC 3339 (UTC only without local offset) string representing date and time.
     * 
     */
    @JsonProperty("timestamp")
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * RFC 3339 (UTC only without local offset) string representing date and time.
     * 
     */
    @JsonProperty("timestamp")
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("maxRadius")
    public Temperature getMaxRadius() {
        return maxRadius;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("maxRadius")
    public void setMaxRadius(Temperature maxRadius) {
        this.maxRadius = maxRadius;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("currentRadius")
    public Temperature getCurrentRadius() {
        return currentRadius;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("currentRadius")
    public void setCurrentRadius(Temperature currentRadius) {
        this.currentRadius = currentRadius;
    }

    /**
     * position
     * <p>
     * The position in 3 dimensions
     * 
     */
    @JsonProperty("position")
    public StartLineStb getPosition() {
        return position;
    }

    /**
     * position
     * <p>
     * The position in 3 dimensions
     * 
     */
    @JsonProperty("position")
    public void setPosition(StartLineStb position) {
        this.position = position;
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
        return new ToStringBuilder(this).append("source", source).append("timestamp", timestamp).append("maxRadius", maxRadius).append("currentRadius", currentRadius).append("position", position).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(maxRadius).append(currentRadius).append(source).append(position).append(additionalProperties).append(timestamp).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Anchor) == false) {
            return false;
        }
        Anchor rhs = ((Anchor) other);
        return new EqualsBuilder().append(maxRadius, rhs.maxRadius).append(currentRadius, rhs.currentRadius).append(source, rhs.source).append(position, rhs.position).append(additionalProperties, rhs.additionalProperties).append(timestamp, rhs.timestamp).isEquals();
    }

}
