
package au.com.venilia.emailais.signalk.model;

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
 * zone
 * <p>
 * A zone used to define the display and alarm state when the value is in between bottom and top.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "lower",
    "upper",
    "state",
    "message"
})
public class Zone {

    /**
     * Lower
     * <p>
     * The lowest number in this zone
     * 
     */
    @JsonProperty("lower")
    @JsonPropertyDescription("The lowest number in this zone")
    private Double lower;
    /**
     * Upper
     * <p>
     * The highest value in this zone
     * 
     */
    @JsonProperty("upper")
    @JsonPropertyDescription("The highest value in this zone")
    private Double upper;
    /**
     * alarmState
     * <p>
     * The alarm state when the value is in this zone.
     * (Required)
     * 
     */
    @JsonProperty("state")
    @JsonPropertyDescription("The alarm state when the value is in this zone.")
    private Zone.State state = Zone.State.fromValue("normal");
    /**
     * message
     * <p>
     * The message to display for the alarm.
     * 
     */
    @JsonProperty("message")
    @JsonPropertyDescription("The message to display for the alarm.")
    private String message = "Warning";
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lower
     * <p>
     * The lowest number in this zone
     * 
     */
    @JsonProperty("lower")
    public Double getLower() {
        return lower;
    }

    /**
     * Lower
     * <p>
     * The lowest number in this zone
     * 
     */
    @JsonProperty("lower")
    public void setLower(Double lower) {
        this.lower = lower;
    }

    /**
     * Upper
     * <p>
     * The highest value in this zone
     * 
     */
    @JsonProperty("upper")
    public Double getUpper() {
        return upper;
    }

    /**
     * Upper
     * <p>
     * The highest value in this zone
     * 
     */
    @JsonProperty("upper")
    public void setUpper(Double upper) {
        this.upper = upper;
    }

    /**
     * alarmState
     * <p>
     * The alarm state when the value is in this zone.
     * (Required)
     * 
     */
    @JsonProperty("state")
    public Zone.State getState() {
        return state;
    }

    /**
     * alarmState
     * <p>
     * The alarm state when the value is in this zone.
     * (Required)
     * 
     */
    @JsonProperty("state")
    public void setState(Zone.State state) {
        this.state = state;
    }

    /**
     * message
     * <p>
     * The message to display for the alarm.
     * 
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * message
     * <p>
     * The message to display for the alarm.
     * 
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
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
        return new ToStringBuilder(this).append("lower", lower).append("upper", upper).append("state", state).append("message", message).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(state).append(additionalProperties).append(message).append(lower).append(upper).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Zone) == false) {
            return false;
        }
        Zone rhs = ((Zone) other);
        return new EqualsBuilder().append(state, rhs.state).append(additionalProperties, rhs.additionalProperties).append(message, rhs.message).append(lower, rhs.lower).append(upper, rhs.upper).isEquals();
    }

    public enum State {

        NORMAL("normal"),
        ALERT("alert"),
        WARN("warn"),
        ALARM("alarm"),
        EMERGENCY("emergency");
        private final String value;
        private final static Map<String, Zone.State> CONSTANTS = new HashMap<String, Zone.State>();

        static {
            for (Zone.State c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private State(String value) {
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
        public static Zone.State fromValue(String value) {
            Zone.State constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
