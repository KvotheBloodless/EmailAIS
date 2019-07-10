
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
 * keel
 * <p>
 * Information about the vessel's keel
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "type",
    "angle",
    "lift"
})
public class Keel {

    /**
     * The type of keel.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of keel.")
    private Keel.Type type;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("angle")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature angle;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("lift")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature lift;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The type of keel.
     * 
     */
    @JsonProperty("type")
    public Keel.Type getType() {
        return type;
    }

    /**
     * The type of keel.
     * 
     */
    @JsonProperty("type")
    public void setType(Keel.Type type) {
        this.type = type;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("angle")
    public Temperature getAngle() {
        return angle;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("angle")
    public void setAngle(Temperature angle) {
        this.angle = angle;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("lift")
    public Temperature getLift() {
        return lift;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("lift")
    public void setLift(Temperature lift) {
        this.lift = lift;
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
        return new ToStringBuilder(this).append("type", type).append("angle", angle).append("lift", lift).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(angle).append(lift).append(additionalProperties).append(type).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Keel) == false) {
            return false;
        }
        Keel rhs = ((Keel) other);
        return new EqualsBuilder().append(angle, rhs.angle).append(lift, rhs.lift).append(additionalProperties, rhs.additionalProperties).append(type, rhs.type).isEquals();
    }

    public enum Type {

        LONG("long"),
        FIN("fin"),
        FLARE("flare"),
        BULB("bulb"),
        WING("wing"),
        CENTERBOARD("centerboard"),
        KANTING("kanting"),
        LIFTING("lifting"),
        DAGGERBOARD("daggerboard");
        private final String value;
        private final static Map<String, Keel.Type> CONSTANTS = new HashMap<String, Keel.Type>();

        static {
            for (Keel.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Type(String value) {
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
        public static Keel.Type fromValue(String value) {
            Keel.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
