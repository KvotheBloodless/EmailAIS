
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
 * Data should be of type NULL.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "value",
    "timestamp",
    "source",
    "_attr",
    "meta"
})
public class NullValue {

    @JsonProperty("value")
    private Object value;
    /**
     * RFC 3339 (UTC only without local offset) string representing date and time.
     * 
     */
    @JsonProperty("timestamp")
    @JsonPropertyDescription("RFC 3339 (UTC only without local offset) string representing date and time.")
    private Date timestamp;
    /**
     * Source of data in delta format, a record of where the data was received from. An object containing at least the properties defined in 'properties', but can contain anything beyond that.
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("Source of data in delta format, a record of where the data was received from. An object containing at least the properties defined in 'properties', but can contain anything beyond that.")
    private Source source;
    /**
     * _attr schema.
     * <p>
     * Filesystem specific data, e.g. security, possibly more later.
     * 
     */
    @JsonProperty("_attr")
    @JsonPropertyDescription("Filesystem specific data, e.g. security, possibly more later.")
    private Attr attr;
    /**
     * Meta schema.
     * <p>
     * Provides meta data to enable alarm and display configuration.
     * 
     */
    @JsonProperty("meta")
    @JsonPropertyDescription("Provides meta data to enable alarm and display configuration.")
    private Meta meta;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("value")
    public Object getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(Object value) {
        this.value = value;
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
     * _attr schema.
     * <p>
     * Filesystem specific data, e.g. security, possibly more later.
     * 
     */
    @JsonProperty("_attr")
    public Attr getAttr() {
        return attr;
    }

    /**
     * _attr schema.
     * <p>
     * Filesystem specific data, e.g. security, possibly more later.
     * 
     */
    @JsonProperty("_attr")
    public void setAttr(Attr attr) {
        this.attr = attr;
    }

    /**
     * Meta schema.
     * <p>
     * Provides meta data to enable alarm and display configuration.
     * 
     */
    @JsonProperty("meta")
    public Meta getMeta() {
        return meta;
    }

    /**
     * Meta schema.
     * <p>
     * Provides meta data to enable alarm and display configuration.
     * 
     */
    @JsonProperty("meta")
    public void setMeta(Meta meta) {
        this.meta = meta;
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
        return new ToStringBuilder(this).append("value", value).append("timestamp", timestamp).append("source", source).append("attr", attr).append("meta", meta).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(meta).append(source).append(additionalProperties).append(attr).append(value).append(timestamp).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NullValue) == false) {
            return false;
        }
        NullValue rhs = ((NullValue) other);
        return new EqualsBuilder().append(meta, rhs.meta).append(source, rhs.source).append(additionalProperties, rhs.additionalProperties).append(attr, rhs.attr).append(value, rhs.value).append(timestamp, rhs.timestamp).isEquals();
    }

}
