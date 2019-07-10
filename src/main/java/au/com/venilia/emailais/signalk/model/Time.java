
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
 * A time reference for the vessel. All clocks on the vessel dispaying local time should use the timezone offset here. If a timezoneRegion is supplied the timezone must also be supplied. If timezoneRegion is supplied that should be displayed by UIs in preference to simply timezone. ie 12:05 (Europe/London) should be displayed in preference to 12:05 (UTC+01:00)
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "millis",
    "timezoneOffset",
    "timezoneRegion",
    "timestamp",
    "source"
})
public class Time {

    /**
     * Epoch time
     * <p>
     * Milliseconds since the UNIX epoch (1970-01-01 00:00:00)
     * 
     */
    @JsonProperty("millis")
    @JsonPropertyDescription("Milliseconds since the UNIX epoch (1970-01-01 00:00:00)")
    private Double millis;
    /**
     * Timezone offset
     * <p>
     * Onboard timezone offset from UTC in hours and minutes (-)hhmm. +ve means east of Greenwich. For use by UIs
     * 
     */
    @JsonProperty("timezoneOffset")
    @JsonPropertyDescription("Onboard timezone offset from UTC in hours and minutes (-)hhmm. +ve means east of Greenwich. For use by UIs")
    private Double timezoneOffset = 0.0D;
    /**
     * IANA Timezone national region
     * <p>
     * Onboard timezone offset as listed in the IANA timezone database (tz database)
     * 
     */
    @JsonProperty("timezoneRegion")
    @JsonPropertyDescription("Onboard timezone offset as listed in the IANA timezone database (tz database)")
    private String timezoneRegion;
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

    /**
     * Epoch time
     * <p>
     * Milliseconds since the UNIX epoch (1970-01-01 00:00:00)
     * 
     */
    @JsonProperty("millis")
    public Double getMillis() {
        return millis;
    }

    /**
     * Epoch time
     * <p>
     * Milliseconds since the UNIX epoch (1970-01-01 00:00:00)
     * 
     */
    @JsonProperty("millis")
    public void setMillis(Double millis) {
        this.millis = millis;
    }

    /**
     * Timezone offset
     * <p>
     * Onboard timezone offset from UTC in hours and minutes (-)hhmm. +ve means east of Greenwich. For use by UIs
     * 
     */
    @JsonProperty("timezoneOffset")
    public Double getTimezoneOffset() {
        return timezoneOffset;
    }

    /**
     * Timezone offset
     * <p>
     * Onboard timezone offset from UTC in hours and minutes (-)hhmm. +ve means east of Greenwich. For use by UIs
     * 
     */
    @JsonProperty("timezoneOffset")
    public void setTimezoneOffset(Double timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
    }

    /**
     * IANA Timezone national region
     * <p>
     * Onboard timezone offset as listed in the IANA timezone database (tz database)
     * 
     */
    @JsonProperty("timezoneRegion")
    public String getTimezoneRegion() {
        return timezoneRegion;
    }

    /**
     * IANA Timezone national region
     * <p>
     * Onboard timezone offset as listed in the IANA timezone database (tz database)
     * 
     */
    @JsonProperty("timezoneRegion")
    public void setTimezoneRegion(String timezoneRegion) {
        this.timezoneRegion = timezoneRegion;
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
        return new ToStringBuilder(this).append("millis", millis).append("timezoneOffset", timezoneOffset).append("timezoneRegion", timezoneRegion).append("timestamp", timestamp).append("source", source).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(timezoneOffset).append(timezoneRegion).append(source).append(additionalProperties).append(millis).append(timestamp).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Time) == false) {
            return false;
        }
        Time rhs = ((Time) other);
        return new EqualsBuilder().append(timezoneOffset, rhs.timezoneOffset).append(timezoneRegion, rhs.timezoneRegion).append(source, rhs.source).append(additionalProperties, rhs.additionalProperties).append(millis, rhs.millis).append(timestamp, rhs.timestamp).isEquals();
    }

}
