
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
 * Navigation lights
 * <p>
 * Current state of the vessels navigation lights
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "value",
    "source",
    "timestamp"
})
public class Lights {

    @JsonProperty("value")
    private Lights.Value value;
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("value")
    public Lights.Value getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(Lights.Value value) {
        this.value = value;
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
        return new ToStringBuilder(this).append("value", value).append("source", source).append("timestamp", timestamp).append("additionalProperties", additionalProperties).toString();
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
        if ((other instanceof Lights) == false) {
            return false;
        }
        Lights rhs = ((Lights) other);
        return new EqualsBuilder().append(source, rhs.source).append(additionalProperties, rhs.additionalProperties).append(value, rhs.value).append(timestamp, rhs.timestamp).isEquals();
    }

    public enum Value {

        OFF("off"),
        FAULT("fault"),
        ANCHORED("anchored"),
        SAILING("sailing"),
        MOTORING("motoring"),
        TOWING_200_M("towing < 200m"),
        TOWING_200_M_("towing > 200m"),
        PUSHING("pushing"),
        FISHING("fishing"),
        FISHING_HAMPERED("fishing-hampered"),
        TRAWLING("trawling"),
        TRAWLING_SHOOTING("trawling-shooting"),
        TRAWLING_HAULING("trawling-hauling"),
        PILOTAGE("pilotage"),
        NOT_UNDER_WAY("not-under-way"),
        AGROUND("aground"),
        RESTRICTED_MANOUVERABILITY("restricted manouverability"),
        RESTRICTED_MANOUVERABILITY_TOWING_200_M("restricted manouverability towing < 200m"),
        RESTRICTED_MANOUVERABILITY_TOWING_200_M_("restricted manouverability towing > 200m"),
        RESTRICTED_MANOUVERABILITY_UNDERWATER_OPERATIONS("restricted manouverability underwater operations"),
        CONSTRAINED_BY_DRAFT("constrained by draft"),
        MINE_CLEARANCE("mine clearance");
        private final String value;
        private final static Map<String, Lights.Value> CONSTANTS = new HashMap<String, Lights.Value>();

        static {
            for (Lights.Value c: values()) {
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
        public static Lights.Value fromValue(String value) {
            Lights.Value constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
