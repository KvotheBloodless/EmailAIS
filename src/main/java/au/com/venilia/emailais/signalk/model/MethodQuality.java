
package au.com.venilia.emailais.signalk.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Quality of the satellite fix
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "value"
})
public class MethodQuality {

    @JsonProperty("value")
    private MethodQuality.Value value;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("value")
    public MethodQuality.Value getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(MethodQuality.Value value) {
        this.value = value;
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
        return new ToStringBuilder(this).append("value", value).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(value).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MethodQuality) == false) {
            return false;
        }
        MethodQuality rhs = ((MethodQuality) other);
        return new EqualsBuilder().append(value, rhs.value).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    public enum Value {

        NO_GPS("no GPS"),
        GNSS_FIX("GNSS Fix"),
        DGNSS_FIX("DGNSS fix"),
        PRECISE_GNSS("Precise GNSS"),
        RTK_FIXED_INTEGER("RTK fixed integer"),
        RTK_FLOAT("RTK float"),
        ESTIMATED_DR_MODE("Estimated (DR) mode"),
        MANUAL_INPUT("Manual input"),
        SIMULATOR_MODE("Simulator mode"),
        ERROR("Error");
        private final String value;
        private final static Map<String, MethodQuality.Value> CONSTANTS = new HashMap<String, MethodQuality.Value>();

        static {
            for (MethodQuality.Value c: values()) {
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
        public static MethodQuality.Value fromValue(String value) {
            MethodQuality.Value constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
