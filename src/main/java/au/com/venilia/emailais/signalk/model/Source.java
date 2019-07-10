
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
 * Source of data in delta format, a record of where the data was received from. An object containing at least the properties defined in 'properties', but can contain anything beyond that.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "label",
    "type",
    "src",
    "pgn",
    "instance",
    "sentence",
    "talker",
    "aisType"
})
public class Source {

    /**
     * A label to identify the source bus, eg serial-COM1, eth-local,etc . Can be anything but should follow a predicatable format
     * (Required)
     * 
     */
    @JsonProperty("label")
    @JsonPropertyDescription("A label to identify the source bus, eg serial-COM1, eth-local,etc . Can be anything but should follow a predicatable format")
    private String label;
    /**
     * A human name to identify the type. NMEA0183, NMEA2000, signalk
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A human name to identify the type. NMEA0183, NMEA2000, signalk")
    private String type = "NMEA2000";
    /**
     * NMEA2000 src value or any similar value for encapsulating the original source of the data
     * 
     */
    @JsonProperty("src")
    @JsonPropertyDescription("NMEA2000 src value or any similar value for encapsulating the original source of the data")
    private String src;
    /**
     * NMEA2000 pgn of the source message
     * 
     */
    @JsonProperty("pgn")
    @JsonPropertyDescription("NMEA2000 pgn of the source message")
    private Double pgn;
    /**
     * NMEA2000 instance value of the source message
     * 
     */
    @JsonProperty("instance")
    @JsonPropertyDescription("NMEA2000 instance value of the source message")
    private String instance;
    /**
     * Sentence type of the source NMEA0183 sentence, $GP[RMC],092750.000,A,5321.6802,N,00630.3372,W,0.02,31.66,280511,,,A*43
     * 
     */
    @JsonProperty("sentence")
    @JsonPropertyDescription("Sentence type of the source NMEA0183 sentence, $GP[RMC],092750.000,A,5321.6802,N,00630.3372,W,0.02,31.66,280511,,,A*43")
    private String sentence;
    /**
     * Talker id of the source NMEA0183 sentence, $[GP]RMC,092750.000,A,5321.6802,N,00630.3372,W,0.02,31.66,280511,,,A*43
     * 
     */
    @JsonProperty("talker")
    @JsonPropertyDescription("Talker id of the source NMEA0183 sentence, $[GP]RMC,092750.000,A,5321.6802,N,00630.3372,W,0.02,31.66,280511,,,A*43")
    private String talker;
    /**
     * AIS Message Type
     * 
     */
    @JsonProperty("aisType")
    @JsonPropertyDescription("AIS Message Type")
    private Double aisType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * A label to identify the source bus, eg serial-COM1, eth-local,etc . Can be anything but should follow a predicatable format
     * (Required)
     * 
     */
    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    /**
     * A label to identify the source bus, eg serial-COM1, eth-local,etc . Can be anything but should follow a predicatable format
     * (Required)
     * 
     */
    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * A human name to identify the type. NMEA0183, NMEA2000, signalk
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * A human name to identify the type. NMEA0183, NMEA2000, signalk
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * NMEA2000 src value or any similar value for encapsulating the original source of the data
     * 
     */
    @JsonProperty("src")
    public String getSrc() {
        return src;
    }

    /**
     * NMEA2000 src value or any similar value for encapsulating the original source of the data
     * 
     */
    @JsonProperty("src")
    public void setSrc(String src) {
        this.src = src;
    }

    /**
     * NMEA2000 pgn of the source message
     * 
     */
    @JsonProperty("pgn")
    public Double getPgn() {
        return pgn;
    }

    /**
     * NMEA2000 pgn of the source message
     * 
     */
    @JsonProperty("pgn")
    public void setPgn(Double pgn) {
        this.pgn = pgn;
    }

    /**
     * NMEA2000 instance value of the source message
     * 
     */
    @JsonProperty("instance")
    public String getInstance() {
        return instance;
    }

    /**
     * NMEA2000 instance value of the source message
     * 
     */
    @JsonProperty("instance")
    public void setInstance(String instance) {
        this.instance = instance;
    }

    /**
     * Sentence type of the source NMEA0183 sentence, $GP[RMC],092750.000,A,5321.6802,N,00630.3372,W,0.02,31.66,280511,,,A*43
     * 
     */
    @JsonProperty("sentence")
    public String getSentence() {
        return sentence;
    }

    /**
     * Sentence type of the source NMEA0183 sentence, $GP[RMC],092750.000,A,5321.6802,N,00630.3372,W,0.02,31.66,280511,,,A*43
     * 
     */
    @JsonProperty("sentence")
    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    /**
     * Talker id of the source NMEA0183 sentence, $[GP]RMC,092750.000,A,5321.6802,N,00630.3372,W,0.02,31.66,280511,,,A*43
     * 
     */
    @JsonProperty("talker")
    public String getTalker() {
        return talker;
    }

    /**
     * Talker id of the source NMEA0183 sentence, $[GP]RMC,092750.000,A,5321.6802,N,00630.3372,W,0.02,31.66,280511,,,A*43
     * 
     */
    @JsonProperty("talker")
    public void setTalker(String talker) {
        this.talker = talker;
    }

    /**
     * AIS Message Type
     * 
     */
    @JsonProperty("aisType")
    public Double getAisType() {
        return aisType;
    }

    /**
     * AIS Message Type
     * 
     */
    @JsonProperty("aisType")
    public void setAisType(Double aisType) {
        this.aisType = aisType;
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
        return new ToStringBuilder(this).append("label", label).append("type", type).append("src", src).append("pgn", pgn).append("instance", instance).append("sentence", sentence).append("talker", talker).append("aisType", aisType).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sentence).append(aisType).append(talker).append(instance).append(src).append(pgn).append(label).append(additionalProperties).append(type).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Source) == false) {
            return false;
        }
        Source rhs = ((Source) other);
        return new EqualsBuilder().append(sentence, rhs.sentence).append(aisType, rhs.aisType).append(talker, rhs.talker).append(instance, rhs.instance).append(src, rhs.src).append(pgn, rhs.pgn).append(label, rhs.label).append(additionalProperties, rhs.additionalProperties).append(type, rhs.type).isEquals();
    }

}
