
package au.com.venilia.emailais.signalk.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
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
 * Meta schema.
 * <p>
 * Provides meta data to enable alarm and display configuration.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "displayName",
    "longName",
    "shortName",
    "description",
    "gaugeType",
    "units",
    "timeout",
    "alertMethod",
    "warnMethod",
    "alarmMethod",
    "emergencyMethod",
    "zones"
})
public class Meta {

    /**
     * DisplayName schema.
     * <p>
     * A display name for this value.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("A display name for this value.")
    private String displayName;
    /**
     * LongName schema.
     * <p>
     * A long name for this value.
     * 
     */
    @JsonProperty("longName")
    @JsonPropertyDescription("A long name for this value.")
    private String longName;
    /**
     * ShortName schema.
     * <p>
     * A short name for this value.
     * 
     */
    @JsonProperty("shortName")
    @JsonPropertyDescription("A short name for this value.")
    private String shortName;
    /**
     * Description schema.
     * <p>
     * Description of the SK path.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Description of the SK path.")
    private String description;
    /**
     * gaugeType schema.
     * <p>
     * The type of gauge necessary to display this value.
     * 
     */
    @JsonProperty("gaugeType")
    @JsonPropertyDescription("The type of gauge necessary to display this value.")
    private String gaugeType;
    /**
     * units schema.
     * <p>
     * The (derived) SI unit of this value.
     * 
     */
    @JsonProperty("units")
    @JsonPropertyDescription("The (derived) SI unit of this value.")
    private String units;
    /**
     * Timeout
     * <p>
     * The timeout in (fractional) seconds after which this data is invalid.
     * 
     */
    @JsonProperty("timeout")
    @JsonPropertyDescription("The timeout in (fractional) seconds after which this data is invalid.")
    private Double timeout;
    /**
     * Alert Method
     * <p>
     * The method to use to raise the alert. An alert is an event that should be known
     * 
     */
    @JsonProperty("alertMethod")
    @JsonPropertyDescription("The method to use to raise the alert. An alert is an event that should be known")
    private List<AlertMethod> alertMethod = new ArrayList<AlertMethod>(Arrays.asList(AlertMethod.fromValue("visual")));
    /**
     * Warn Method
     * <p>
     * The method to use to raise the warning. A warning is an unexpected event that may require attention
     * 
     */
    @JsonProperty("warnMethod")
    @JsonPropertyDescription("The method to use to raise the warning. A warning is an unexpected event that may require attention")
    private List<AlertMethod> warnMethod = new ArrayList<AlertMethod>(Arrays.asList(AlertMethod.fromValue("visual")));
    /**
     * Alarm Method
     * <p>
     * The method to use to raise the alarm. An alarm requires immediate attention, eg no oil pressure
     * 
     */
    @JsonProperty("alarmMethod")
    @JsonPropertyDescription("The method to use to raise the alarm. An alarm requires immediate attention, eg no oil pressure")
    private List<AlertMethod> alarmMethod = new ArrayList<AlertMethod>(Arrays.asList(AlertMethod.fromValue("visual"), AlertMethod.fromValue("sound")));
    /**
     * Emergency Method
     * <p>
     * The method to use to raise an emergency. An emergency is an immediate danger to life or vessel
     * 
     */
    @JsonProperty("emergencyMethod")
    @JsonPropertyDescription("The method to use to raise an emergency. An emergency is an immediate danger to life or vessel")
    private List<AlertMethod> emergencyMethod = new ArrayList<AlertMethod>(Arrays.asList(AlertMethod.fromValue("visual"), AlertMethod.fromValue("sound")));
    /**
     * Zones schema.
     * <p>
     * The zones defining the range of values for this signalk value.
     * 
     */
    @JsonProperty("zones")
    @JsonPropertyDescription("The zones defining the range of values for this signalk value.")
    private List<Zone> zones = new ArrayList<Zone>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * DisplayName schema.
     * <p>
     * A display name for this value.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * DisplayName schema.
     * <p>
     * A display name for this value.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * LongName schema.
     * <p>
     * A long name for this value.
     * 
     */
    @JsonProperty("longName")
    public String getLongName() {
        return longName;
    }

    /**
     * LongName schema.
     * <p>
     * A long name for this value.
     * 
     */
    @JsonProperty("longName")
    public void setLongName(String longName) {
        this.longName = longName;
    }

    /**
     * ShortName schema.
     * <p>
     * A short name for this value.
     * 
     */
    @JsonProperty("shortName")
    public String getShortName() {
        return shortName;
    }

    /**
     * ShortName schema.
     * <p>
     * A short name for this value.
     * 
     */
    @JsonProperty("shortName")
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    /**
     * Description schema.
     * <p>
     * Description of the SK path.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description schema.
     * <p>
     * Description of the SK path.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * gaugeType schema.
     * <p>
     * The type of gauge necessary to display this value.
     * 
     */
    @JsonProperty("gaugeType")
    public String getGaugeType() {
        return gaugeType;
    }

    /**
     * gaugeType schema.
     * <p>
     * The type of gauge necessary to display this value.
     * 
     */
    @JsonProperty("gaugeType")
    public void setGaugeType(String gaugeType) {
        this.gaugeType = gaugeType;
    }

    /**
     * units schema.
     * <p>
     * The (derived) SI unit of this value.
     * 
     */
    @JsonProperty("units")
    public String getUnits() {
        return units;
    }

    /**
     * units schema.
     * <p>
     * The (derived) SI unit of this value.
     * 
     */
    @JsonProperty("units")
    public void setUnits(String units) {
        this.units = units;
    }

    /**
     * Timeout
     * <p>
     * The timeout in (fractional) seconds after which this data is invalid.
     * 
     */
    @JsonProperty("timeout")
    public Double getTimeout() {
        return timeout;
    }

    /**
     * Timeout
     * <p>
     * The timeout in (fractional) seconds after which this data is invalid.
     * 
     */
    @JsonProperty("timeout")
    public void setTimeout(Double timeout) {
        this.timeout = timeout;
    }

    /**
     * Alert Method
     * <p>
     * The method to use to raise the alert. An alert is an event that should be known
     * 
     */
    @JsonProperty("alertMethod")
    public List<AlertMethod> getAlertMethod() {
        return alertMethod;
    }

    /**
     * Alert Method
     * <p>
     * The method to use to raise the alert. An alert is an event that should be known
     * 
     */
    @JsonProperty("alertMethod")
    public void setAlertMethod(List<AlertMethod> alertMethod) {
        this.alertMethod = alertMethod;
    }

    /**
     * Warn Method
     * <p>
     * The method to use to raise the warning. A warning is an unexpected event that may require attention
     * 
     */
    @JsonProperty("warnMethod")
    public List<AlertMethod> getWarnMethod() {
        return warnMethod;
    }

    /**
     * Warn Method
     * <p>
     * The method to use to raise the warning. A warning is an unexpected event that may require attention
     * 
     */
    @JsonProperty("warnMethod")
    public void setWarnMethod(List<AlertMethod> warnMethod) {
        this.warnMethod = warnMethod;
    }

    /**
     * Alarm Method
     * <p>
     * The method to use to raise the alarm. An alarm requires immediate attention, eg no oil pressure
     * 
     */
    @JsonProperty("alarmMethod")
    public List<AlertMethod> getAlarmMethod() {
        return alarmMethod;
    }

    /**
     * Alarm Method
     * <p>
     * The method to use to raise the alarm. An alarm requires immediate attention, eg no oil pressure
     * 
     */
    @JsonProperty("alarmMethod")
    public void setAlarmMethod(List<AlertMethod> alarmMethod) {
        this.alarmMethod = alarmMethod;
    }

    /**
     * Emergency Method
     * <p>
     * The method to use to raise an emergency. An emergency is an immediate danger to life or vessel
     * 
     */
    @JsonProperty("emergencyMethod")
    public List<AlertMethod> getEmergencyMethod() {
        return emergencyMethod;
    }

    /**
     * Emergency Method
     * <p>
     * The method to use to raise an emergency. An emergency is an immediate danger to life or vessel
     * 
     */
    @JsonProperty("emergencyMethod")
    public void setEmergencyMethod(List<AlertMethod> emergencyMethod) {
        this.emergencyMethod = emergencyMethod;
    }

    /**
     * Zones schema.
     * <p>
     * The zones defining the range of values for this signalk value.
     * 
     */
    @JsonProperty("zones")
    public List<Zone> getZones() {
        return zones;
    }

    /**
     * Zones schema.
     * <p>
     * The zones defining the range of values for this signalk value.
     * 
     */
    @JsonProperty("zones")
    public void setZones(List<Zone> zones) {
        this.zones = zones;
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
        return new ToStringBuilder(this).append("displayName", displayName).append("longName", longName).append("shortName", shortName).append("description", description).append("gaugeType", gaugeType).append("units", units).append("timeout", timeout).append("alertMethod", alertMethod).append("warnMethod", warnMethod).append("alarmMethod", alarmMethod).append("emergencyMethod", emergencyMethod).append("zones", zones).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(displayName).append(warnMethod).append(description).append(units).append(zones).append(timeout).append(emergencyMethod).append(alertMethod).append(alarmMethod).append(additionalProperties).append(shortName).append(gaugeType).append(longName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Meta) == false) {
            return false;
        }
        Meta rhs = ((Meta) other);
        return new EqualsBuilder().append(displayName, rhs.displayName).append(warnMethod, rhs.warnMethod).append(description, rhs.description).append(units, rhs.units).append(zones, rhs.zones).append(timeout, rhs.timeout).append(emergencyMethod, rhs.emergencyMethod).append(alertMethod, rhs.alertMethod).append(alarmMethod, rhs.alarmMethod).append(additionalProperties, rhs.additionalProperties).append(shortName, rhs.shortName).append(gaugeType, rhs.gaugeType).append(longName, rhs.longName).isEquals();
    }

}
