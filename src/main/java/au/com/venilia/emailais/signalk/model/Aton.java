
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
 * aid to navigation
 * <p>
 * An object describing an individual aid to navigation. It should be an object in aton, named using MMSI or a UUID
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "url",
    "mmsi",
    "uuid",
    "atonType",
    "name",
    "communication",
    "environment",
    "navigation",
    "notifications",
    "design",
    "sensors"
})
public class Aton {

    /**
     * A location of a resource, potentially relative. For hierarchical schemes (like http), applications must resolve relative URIs (e.g. './v1/api/'). Implementations should support the following schemes: http:, https:, mailto:, tel:, and ws:.
     * 
     */
    @JsonProperty("url")
    @JsonPropertyDescription("A location of a resource, potentially relative. For hierarchical schemes (like http), applications must resolve relative URIs (e.g. './v1/api/'). Implementations should support the following schemes: http:, https:, mailto:, tel:, and ws:.")
    private String url;
    /**
     * Maritime Mobile Service Identity (MMSI) for . Has to be 9 digits. See http://en.wikipedia.org/wiki/Maritime_Mobile_Service_Identity for information.
     * 
     */
    @JsonProperty("mmsi")
    @JsonPropertyDescription("Maritime Mobile Service Identity (MMSI) for . Has to be 9 digits. See http://en.wikipedia.org/wiki/Maritime_Mobile_Service_Identity for information.")
    private String mmsi;
    /**
     * A unique Signal K flavoured maritime resource identifier (MRN). A MRN is a form of URN, following a specific format: urn:mrn:<issueing authority>:<id type>:<id>. In case of a Signal K uuid, that looks like this: urn:mrn:signalk:uuid:<uuid>, where Signal K is the issuing authority and UUID (v4) the ID type.
     * 
     */
    @JsonProperty("uuid")
    @JsonPropertyDescription("A unique Signal K flavoured maritime resource identifier (MRN). A MRN is a form of URN, following a specific format: urn:mrn:<issueing authority>:<id type>:<id>. In case of a Signal K uuid, that looks like this: urn:mrn:signalk:uuid:<uuid>, where Signal K is the issuing authority and UUID (v4) the ID type.")
    private String uuid;
    /**
     * The aton type
     * 
     */
    @JsonProperty("atonType")
    @JsonPropertyDescription("The aton type")
    private AtonType atonType;
    /**
     * The aton name
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The aton name")
    private String name;
    /**
     * communication
     * <p>
     * Schema describing the communication child-object of a Vessel.
     * 
     */
    @JsonProperty("communication")
    @JsonPropertyDescription("Schema describing the communication child-object of a Vessel.")
    private Communication communication;
    /**
     * environment
     * <p>
     * Schema describing the environmental child-object of a Vessel.
     * 
     */
    @JsonProperty("environment")
    @JsonPropertyDescription("Schema describing the environmental child-object of a Vessel.")
    private Environment environment;
    /**
     * navigation
     * <p>
     * Schema describing the navigation child-object of a Vessel.
     * 
     */
    @JsonProperty("navigation")
    @JsonPropertyDescription("Schema describing the navigation child-object of a Vessel.")
    private Navigation navigation;
    /**
     * notifications
     * <p>
     * Notifications currently raised. Major categories have well-defined names, but the tree can be extended by any hierarchical structure
     * 
     */
    @JsonProperty("notifications")
    @JsonPropertyDescription("Notifications currently raised. Major categories have well-defined names, but the tree can be extended by any hierarchical structure")
    private Notifications_ notifications;
    /**
     * design
     * <p>
     * An object describing the vessels primary dimensions and statistics.
     * 
     */
    @JsonProperty("design")
    @JsonPropertyDescription("An object describing the vessels primary dimensions and statistics.")
    private Design design;
    /**
     * sensors
     * <p>
     * Sensors, their state, and data.
     * 
     */
    @JsonProperty("sensors")
    @JsonPropertyDescription("Sensors, their state, and data.")
    private Sensors_ sensors;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * A location of a resource, potentially relative. For hierarchical schemes (like http), applications must resolve relative URIs (e.g. './v1/api/'). Implementations should support the following schemes: http:, https:, mailto:, tel:, and ws:.
     * 
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * A location of a resource, potentially relative. For hierarchical schemes (like http), applications must resolve relative URIs (e.g. './v1/api/'). Implementations should support the following schemes: http:, https:, mailto:, tel:, and ws:.
     * 
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Maritime Mobile Service Identity (MMSI) for . Has to be 9 digits. See http://en.wikipedia.org/wiki/Maritime_Mobile_Service_Identity for information.
     * 
     */
    @JsonProperty("mmsi")
    public String getMmsi() {
        return mmsi;
    }

    /**
     * Maritime Mobile Service Identity (MMSI) for . Has to be 9 digits. See http://en.wikipedia.org/wiki/Maritime_Mobile_Service_Identity for information.
     * 
     */
    @JsonProperty("mmsi")
    public void setMmsi(String mmsi) {
        this.mmsi = mmsi;
    }

    /**
     * A unique Signal K flavoured maritime resource identifier (MRN). A MRN is a form of URN, following a specific format: urn:mrn:<issueing authority>:<id type>:<id>. In case of a Signal K uuid, that looks like this: urn:mrn:signalk:uuid:<uuid>, where Signal K is the issuing authority and UUID (v4) the ID type.
     * 
     */
    @JsonProperty("uuid")
    public String getUuid() {
        return uuid;
    }

    /**
     * A unique Signal K flavoured maritime resource identifier (MRN). A MRN is a form of URN, following a specific format: urn:mrn:<issueing authority>:<id type>:<id>. In case of a Signal K uuid, that looks like this: urn:mrn:signalk:uuid:<uuid>, where Signal K is the issuing authority and UUID (v4) the ID type.
     * 
     */
    @JsonProperty("uuid")
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * The aton type
     * 
     */
    @JsonProperty("atonType")
    public AtonType getAtonType() {
        return atonType;
    }

    /**
     * The aton type
     * 
     */
    @JsonProperty("atonType")
    public void setAtonType(AtonType atonType) {
        this.atonType = atonType;
    }

    /**
     * The aton name
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The aton name
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * communication
     * <p>
     * Schema describing the communication child-object of a Vessel.
     * 
     */
    @JsonProperty("communication")
    public Communication getCommunication() {
        return communication;
    }

    /**
     * communication
     * <p>
     * Schema describing the communication child-object of a Vessel.
     * 
     */
    @JsonProperty("communication")
    public void setCommunication(Communication communication) {
        this.communication = communication;
    }

    /**
     * environment
     * <p>
     * Schema describing the environmental child-object of a Vessel.
     * 
     */
    @JsonProperty("environment")
    public Environment getEnvironment() {
        return environment;
    }

    /**
     * environment
     * <p>
     * Schema describing the environmental child-object of a Vessel.
     * 
     */
    @JsonProperty("environment")
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    /**
     * navigation
     * <p>
     * Schema describing the navigation child-object of a Vessel.
     * 
     */
    @JsonProperty("navigation")
    public Navigation getNavigation() {
        return navigation;
    }

    /**
     * navigation
     * <p>
     * Schema describing the navigation child-object of a Vessel.
     * 
     */
    @JsonProperty("navigation")
    public void setNavigation(Navigation navigation) {
        this.navigation = navigation;
    }

    /**
     * notifications
     * <p>
     * Notifications currently raised. Major categories have well-defined names, but the tree can be extended by any hierarchical structure
     * 
     */
    @JsonProperty("notifications")
    public Notifications_ getNotifications() {
        return notifications;
    }

    /**
     * notifications
     * <p>
     * Notifications currently raised. Major categories have well-defined names, but the tree can be extended by any hierarchical structure
     * 
     */
    @JsonProperty("notifications")
    public void setNotifications(Notifications_ notifications) {
        this.notifications = notifications;
    }

    /**
     * design
     * <p>
     * An object describing the vessels primary dimensions and statistics.
     * 
     */
    @JsonProperty("design")
    public Design getDesign() {
        return design;
    }

    /**
     * design
     * <p>
     * An object describing the vessels primary dimensions and statistics.
     * 
     */
    @JsonProperty("design")
    public void setDesign(Design design) {
        this.design = design;
    }

    /**
     * sensors
     * <p>
     * Sensors, their state, and data.
     * 
     */
    @JsonProperty("sensors")
    public Sensors_ getSensors() {
        return sensors;
    }

    /**
     * sensors
     * <p>
     * Sensors, their state, and data.
     * 
     */
    @JsonProperty("sensors")
    public void setSensors(Sensors_ sensors) {
        this.sensors = sensors;
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
        return new ToStringBuilder(this).append("url", url).append("mmsi", mmsi).append("uuid", uuid).append("atonType", atonType).append("name", name).append("communication", communication).append("environment", environment).append("navigation", navigation).append("notifications", notifications).append("design", design).append("sensors", sensors).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(mmsi).append(atonType).append(uuid).append(url).append(environment).append(navigation).append(sensors).append(design).append(name).append(additionalProperties).append(communication).append(notifications).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Aton) == false) {
            return false;
        }
        Aton rhs = ((Aton) other);
        return new EqualsBuilder().append(mmsi, rhs.mmsi).append(atonType, rhs.atonType).append(uuid, rhs.uuid).append(url, rhs.url).append(environment, rhs.environment).append(navigation, rhs.navigation).append(sensors, rhs.sensors).append(design, rhs.design).append(name, rhs.name).append(additionalProperties, rhs.additionalProperties).append(communication, rhs.communication).append(notifications, rhs.notifications).isEquals();
    }

}
