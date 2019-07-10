
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

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "path",
    "period",
    "format",
    "policy",
    "minPeriod"
})
public class Subscribe {

    /**
     * The relative path of the subscription,  supports jsonPath syntax for complex matches
     * (Required)
     * 
     */
    @JsonProperty("path")
    @JsonPropertyDescription("The relative path of the subscription,  supports jsonPath syntax for complex matches")
    private String path;
    /**
     * The period to repeat the message in millisecs
     * 
     */
    @JsonProperty("period")
    @JsonPropertyDescription("The period to repeat the message in millisecs")
    private Integer period = 1000;
    /**
     * The message format for periodic messages
     * 
     */
    @JsonProperty("format")
    @JsonPropertyDescription("The message format for periodic messages")
    private Subscribe.Format format = Subscribe.Format.fromValue("delta");
    /**
     * The policy rules for repetition. [instant]=send all changes as fast as they are received, but no faster than minPeriod. [ideal]=use instant policy, but send the value every `period` millisecs anyway, whether changed or not. [fixed]=send the last known values every period. 
     * 
     */
    @JsonProperty("policy")
    @JsonPropertyDescription("The policy rules for repetition. [instant]=send all changes as fast as they are received, but no faster than minPeriod. [ideal]=use instant policy, but send the value every `period` millisecs anyway, whether changed or not. [fixed]=send the last known values every period. ")
    private Subscribe.Policy policy = Subscribe.Policy.fromValue("ideal");
    /**
     * The the fastest message transmission rate allowed, e.g. every `minPeriod/1000` seconds.
     * 
     */
    @JsonProperty("minPeriod")
    @JsonPropertyDescription("The the fastest message transmission rate allowed, e.g. every `minPeriod/1000` seconds.")
    private Integer minPeriod;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The relative path of the subscription,  supports jsonPath syntax for complex matches
     * (Required)
     * 
     */
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    /**
     * The relative path of the subscription,  supports jsonPath syntax for complex matches
     * (Required)
     * 
     */
    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * The period to repeat the message in millisecs
     * 
     */
    @JsonProperty("period")
    public Integer getPeriod() {
        return period;
    }

    /**
     * The period to repeat the message in millisecs
     * 
     */
    @JsonProperty("period")
    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * The message format for periodic messages
     * 
     */
    @JsonProperty("format")
    public Subscribe.Format getFormat() {
        return format;
    }

    /**
     * The message format for periodic messages
     * 
     */
    @JsonProperty("format")
    public void setFormat(Subscribe.Format format) {
        this.format = format;
    }

    /**
     * The policy rules for repetition. [instant]=send all changes as fast as they are received, but no faster than minPeriod. [ideal]=use instant policy, but send the value every `period` millisecs anyway, whether changed or not. [fixed]=send the last known values every period. 
     * 
     */
    @JsonProperty("policy")
    public Subscribe.Policy getPolicy() {
        return policy;
    }

    /**
     * The policy rules for repetition. [instant]=send all changes as fast as they are received, but no faster than minPeriod. [ideal]=use instant policy, but send the value every `period` millisecs anyway, whether changed or not. [fixed]=send the last known values every period. 
     * 
     */
    @JsonProperty("policy")
    public void setPolicy(Subscribe.Policy policy) {
        this.policy = policy;
    }

    /**
     * The the fastest message transmission rate allowed, e.g. every `minPeriod/1000` seconds.
     * 
     */
    @JsonProperty("minPeriod")
    public Integer getMinPeriod() {
        return minPeriod;
    }

    /**
     * The the fastest message transmission rate allowed, e.g. every `minPeriod/1000` seconds.
     * 
     */
    @JsonProperty("minPeriod")
    public void setMinPeriod(Integer minPeriod) {
        this.minPeriod = minPeriod;
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
        return new ToStringBuilder(this).append("path", path).append("period", period).append("format", format).append("policy", policy).append("minPeriod", minPeriod).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(path).append(period).append(minPeriod).append(format).append(additionalProperties).append(policy).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Subscribe) == false) {
            return false;
        }
        Subscribe rhs = ((Subscribe) other);
        return new EqualsBuilder().append(path, rhs.path).append(period, rhs.period).append(minPeriod, rhs.minPeriod).append(format, rhs.format).append(additionalProperties, rhs.additionalProperties).append(policy, rhs.policy).isEquals();
    }

    public enum Format {

        FULL("full"),
        DELTA("delta");
        private final String value;
        private final static Map<String, Subscribe.Format> CONSTANTS = new HashMap<String, Subscribe.Format>();

        static {
            for (Subscribe.Format c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Format(String value) {
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
        public static Subscribe.Format fromValue(String value) {
            Subscribe.Format constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum Policy {

        INSTANT("instant"),
        IDEAL("ideal"),
        FIXED("fixed");
        private final String value;
        private final static Map<String, Subscribe.Policy> CONSTANTS = new HashMap<String, Subscribe.Policy>();

        static {
            for (Subscribe.Policy c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Policy(String value) {
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
        public static Subscribe.Policy fromValue(String value) {
            Subscribe.Policy constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
