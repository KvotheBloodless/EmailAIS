
package au.com.venilia.emailais.signalk.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Mode of the vessel based on the current conditions. Can be combined with navigation.state to control vessel signals eg switch to night mode for instrumentation and lights, or make sound signals for fog.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "value",
    "timestamp",
    "source"
})
public class Mode {

    @JsonProperty("value")
    private Mode.Value value;
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("value")
    public Mode.Value getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(Mode.Value value) {
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
        return new ToStringBuilder(this).append("value", value).append("timestamp", timestamp).append("source", source).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(source).append(additionalProperties).append(value).append(timestamp).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Mode) == false) {
            return false;
        }
        Mode rhs = ((Mode) other);
        return new EqualsBuilder().append(source, rhs.source).append(additionalProperties, rhs.additionalProperties).append(value, rhs.value).append(timestamp, rhs.timestamp).isEquals();
    }

    public enum Value {

        DAY("day"),
        NIGHT("night"),
        RESTRICTED_VISIBILITY("restricted visibility");
        private final String value;
        private final static Map<String, Mode.Value> CONSTANTS = new HashMap<String, Mode.Value>();

        static {
            for (Mode.Value c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Value(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Mode.Value fromValue(String value) {
            Mode.Value constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
