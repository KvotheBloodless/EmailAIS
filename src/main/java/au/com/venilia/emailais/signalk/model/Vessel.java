
package au.com.venilia.emailais.signalk.model;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import au.com.venilia.emailais.signalk.model.groups.Electrical;
import au.com.venilia.emailais.signalk.model.groups.Performance;
import au.com.venilia.emailais.signalk.model.groups.Propulsion;
import au.com.venilia.emailais.signalk.model.groups.Sails;
import au.com.venilia.emailais.signalk.model.groups.Steering;
import au.com.venilia.emailais.signalk.model.groups.Tanks;


/**
 * vessel
 * <p>
 * An object describing an individual vessel. It should be an object in vessels, named using MMSI or a UUID
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "url",
    "mmsi",
    "mothershipMmsi",
    "uuid",
    "name",
    "flag",
    "port",
    "registrations",
    "communication",
    "environment",
    "navigation",
    "propulsion",
    "electrical",
    "notifications",
    "steering",
    "tanks",
    "design",
    "sails",
    "sensors",
    "performance"
})
public class Vessel {

    /**
     * A location of a resource, potentially relative. For hierarchical schemes (like http), applications must resolve relative URIs (e.g. './v1/api/'). Implementations should support the following schemes: http:, https:, mailto:, tel:, and ws:.
     * 
     */
    @JsonProperty("url")
    @JsonPropertyDescription("A location of a resource, potentially relative. For hierarchical schemes (like http), applications must resolve relative URIs (e.g. './v1/api/'). Implementations should support the following schemes: http:, https:, mailto:, tel:, and ws:.")
    private String url;
    /**
     * Maritime Mobile Service Identity (MMSI). Has to be 9 digits. See http://en.wikipedia.org/wiki/Maritime_Mobile_Service_Identity for information.
     * 
     */
    @JsonProperty("mmsi")
    @JsonPropertyDescription("Maritime Mobile Service Identity (MMSI). Has to be 9 digits. See http://en.wikipedia.org/wiki/Maritime_Mobile_Service_Identity for information.")
    private String mmsi;
    /**
     * Maritime Mobile Service Identity (MMSI). Has to be 9 digits. See http://en.wikipedia.org/wiki/Maritime_Mobile_Service_Identity for information.
     * 
     */
    @JsonProperty("mothershipMmsi")
    @JsonPropertyDescription("Maritime Mobile Service Identity (MMSI). Has to be 9 digits. See http://en.wikipedia.org/wiki/Maritime_Mobile_Service_Identity for information.")
    private String mothershipMmsi;
    /**
     * A unique Signal K flavoured maritime resource identifier (MRN). A MRN is a form of URN, following a specific format: urn:mrn:<issueing authority>:<id type>:<id>. In case of a Signal K uuid, that looks like this: urn:mrn:signalk:uuid:<uuid>, where Signal K is the issuing authority and UUID (v4) the ID type.
     * 
     */
    @JsonProperty("uuid")
    @JsonPropertyDescription("A unique Signal K flavoured maritime resource identifier (MRN). A MRN is a form of URN, following a specific format: urn:mrn:<issueing authority>:<id type>:<id>. In case of a Signal K uuid, that looks like this: urn:mrn:signalk:uuid:<uuid>, where Signal K is the issuing authority and UUID (v4) the ID type.")
    private String uuid;
    /**
     * The common name of the vessel
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The common name of the vessel")
    private String name;
    /**
     * The country of ship registration, or flag state of the vessel
     * 
     */
    @JsonProperty("flag")
    @JsonPropertyDescription("The country of ship registration, or flag state of the vessel")
    private String flag;
    /**
     * The home port of the vessel
     * 
     */
    @JsonProperty("port")
    @JsonPropertyDescription("The home port of the vessel")
    private String port;
    /**
     * The various registrations of the vessel.
     * 
     */
    @JsonProperty("registrations")
    @JsonPropertyDescription("The various registrations of the vessel.")
    private Registrations_ registrations;
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
     * propulsion
     * <p>
     * An engine, named by a unique name within this vessel
     * 
     */
    @JsonProperty("propulsion")
    @JsonPropertyDescription("An engine, named by a unique name within this vessel")
    private Propulsion propulsion;
    /**
     * Electrical Properties
     * <p>
     * Schema describing the electrical child-object of a Vessel.
     * 
     */
    @JsonProperty("electrical")
    @JsonPropertyDescription("Schema describing the electrical child-object of a Vessel.")
    private Electrical electrical;
    /**
     * notifications
     * <p>
     * Notifications currently raised. Major categories have well-defined names, but the tree can be extended by any hierarchical structure
     * 
     */
    @JsonProperty("notifications")
    @JsonPropertyDescription("Notifications currently raised. Major categories have well-defined names, but the tree can be extended by any hierarchical structure")
    private Notifications___ notifications;
    /**
     * steering
     * <p>
     * Schema describing the steering child-object of a vessel.
     * 
     */
    @JsonProperty("steering")
    @JsonPropertyDescription("Schema describing the steering child-object of a vessel.")
    private Steering steering;
    /**
     * A tank, named by a unique identifier
     * 
     */
    @JsonProperty("tanks")
    @JsonPropertyDescription("A tank, named by a unique identifier")
    private Tanks tanks;
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
     * sails
     * <p>
     * An object describing the vessels sails if the vessel is a sailboat.
     * 
     */
    @JsonProperty("sails")
    @JsonPropertyDescription("An object describing the vessels sails if the vessel is a sailboat.")
    private Sails sails;
    /**
     * sensors
     * <p>
     * Sensors, their state, and data.
     * 
     */
    @JsonProperty("sensors")
    @JsonPropertyDescription("Sensors, their state, and data.")
    private Sensors__ sensors;
    /**
     * performance
     * <p>
     * Schema describing the performance child-object of a Vessel.
     * 
     */
    @JsonProperty("performance")
    @JsonPropertyDescription("Schema describing the performance child-object of a Vessel.")
    private Performance performance;
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
     * Maritime Mobile Service Identity (MMSI). Has to be 9 digits. See http://en.wikipedia.org/wiki/Maritime_Mobile_Service_Identity for information.
     * 
     */
    @JsonProperty("mmsi")
    public String getMmsi() {
        return mmsi;
    }

    /**
     * Maritime Mobile Service Identity (MMSI). Has to be 9 digits. See http://en.wikipedia.org/wiki/Maritime_Mobile_Service_Identity for information.
     * 
     */
    @JsonProperty("mmsi")
    public void setMmsi(String mmsi) {
        this.mmsi = mmsi;
    }

    /**
     * Maritime Mobile Service Identity (MMSI). Has to be 9 digits. See http://en.wikipedia.org/wiki/Maritime_Mobile_Service_Identity for information.
     * 
     */
    @JsonProperty("mothershipMmsi")
    public String getMothershipMmsi() {
        return mothershipMmsi;
    }

    /**
     * Maritime Mobile Service Identity (MMSI). Has to be 9 digits. See http://en.wikipedia.org/wiki/Maritime_Mobile_Service_Identity for information.
     * 
     */
    @JsonProperty("mothershipMmsi")
    public void setMothershipMmsi(String mothershipMmsi) {
        this.mothershipMmsi = mothershipMmsi;
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
     * The common name of the vessel
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The common name of the vessel
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The country of ship registration, or flag state of the vessel
     * 
     */
    @JsonProperty("flag")
    public String getFlag() {
        return flag;
    }

    /**
     * The country of ship registration, or flag state of the vessel
     * 
     */
    @JsonProperty("flag")
    public void setFlag(String flag) {
        this.flag = flag;
    }

    /**
     * The home port of the vessel
     * 
     */
    @JsonProperty("port")
    public String getPort() {
        return port;
    }

    /**
     * The home port of the vessel
     * 
     */
    @JsonProperty("port")
    public void setPort(String port) {
        this.port = port;
    }

    /**
     * The various registrations of the vessel.
     * 
     */
    @JsonProperty("registrations")
    public Registrations_ getRegistrations() {
        return registrations;
    }

    /**
     * The various registrations of the vessel.
     * 
     */
    @JsonProperty("registrations")
    public void setRegistrations(Registrations_ registrations) {
        this.registrations = registrations;
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
     * propulsion
     * <p>
     * An engine, named by a unique name within this vessel
     * 
     */
    @JsonProperty("propulsion")
    public Propulsion getPropulsion() {
        return propulsion;
    }

    /**
     * propulsion
     * <p>
     * An engine, named by a unique name within this vessel
     * 
     */
    @JsonProperty("propulsion")
    public void setPropulsion(Propulsion propulsion) {
        this.propulsion = propulsion;
    }

    /**
     * Electrical Properties
     * <p>
     * Schema describing the electrical child-object of a Vessel.
     * 
     */
    @JsonProperty("electrical")
    public Electrical getElectrical() {
        return electrical;
    }

    /**
     * Electrical Properties
     * <p>
     * Schema describing the electrical child-object of a Vessel.
     * 
     */
    @JsonProperty("electrical")
    public void setElectrical(Electrical electrical) {
        this.electrical = electrical;
    }

    /**
     * notifications
     * <p>
     * Notifications currently raised. Major categories have well-defined names, but the tree can be extended by any hierarchical structure
     * 
     */
    @JsonProperty("notifications")
    public Notifications___ getNotifications() {
        return notifications;
    }

    /**
     * notifications
     * <p>
     * Notifications currently raised. Major categories have well-defined names, but the tree can be extended by any hierarchical structure
     * 
     */
    @JsonProperty("notifications")
    public void setNotifications(Notifications___ notifications) {
        this.notifications = notifications;
    }

    /**
     * steering
     * <p>
     * Schema describing the steering child-object of a vessel.
     * 
     */
    @JsonProperty("steering")
    public Steering getSteering() {
        return steering;
    }

    /**
     * steering
     * <p>
     * Schema describing the steering child-object of a vessel.
     * 
     */
    @JsonProperty("steering")
    public void setSteering(Steering steering) {
        this.steering = steering;
    }

    /**
     * A tank, named by a unique identifier
     * 
     */
    @JsonProperty("tanks")
    public Tanks getTanks() {
        return tanks;
    }

    /**
     * A tank, named by a unique identifier
     * 
     */
    @JsonProperty("tanks")
    public void setTanks(Tanks tanks) {
        this.tanks = tanks;
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
     * sails
     * <p>
     * An object describing the vessels sails if the vessel is a sailboat.
     * 
     */
    @JsonProperty("sails")
    public Sails getSails() {
        return sails;
    }

    /**
     * sails
     * <p>
     * An object describing the vessels sails if the vessel is a sailboat.
     * 
     */
    @JsonProperty("sails")
    public void setSails(Sails sails) {
        this.sails = sails;
    }

    /**
     * sensors
     * <p>
     * Sensors, their state, and data.
     * 
     */
    @JsonProperty("sensors")
    public Sensors__ getSensors() {
        return sensors;
    }

    /**
     * sensors
     * <p>
     * Sensors, their state, and data.
     * 
     */
    @JsonProperty("sensors")
    public void setSensors(Sensors__ sensors) {
        this.sensors = sensors;
    }

    /**
     * performance
     * <p>
     * Schema describing the performance child-object of a Vessel.
     * 
     */
    @JsonProperty("performance")
    public Performance getPerformance() {
        return performance;
    }

    /**
     * performance
     * <p>
     * Schema describing the performance child-object of a Vessel.
     * 
     */
    @JsonProperty("performance")
    public void setPerformance(Performance performance) {
        this.performance = performance;
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
        return new ToStringBuilder(this).append("url", url).append("mmsi", mmsi).append("mothershipMmsi", mothershipMmsi).append("uuid", uuid).append("name", name).append("flag", flag).append("port", port).append("registrations", registrations).append("communication", communication).append("environment", environment).append("navigation", navigation).append("propulsion", propulsion).append("electrical", electrical).append("notifications", notifications).append("steering", steering).append("tanks", tanks).append("design", design).append("sails", sails).append("sensors", sensors).append("performance", performance).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sails).append(flag).append(registrations).append(mmsi).append(propulsion).append(electrical).append(steering).append(uuid).append(url).append(mothershipMmsi).append(environment).append(navigation).append(sensors).append(performance).append(port).append(design).append(name).append(tanks).append(additionalProperties).append(communication).append(notifications).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Vessel) == false) {
            return false;
        }
        Vessel rhs = ((Vessel) other);
        return new EqualsBuilder().append(sails, rhs.sails).append(flag, rhs.flag).append(registrations, rhs.registrations).append(mmsi, rhs.mmsi).append(propulsion, rhs.propulsion).append(electrical, rhs.electrical).append(steering, rhs.steering).append(uuid, rhs.uuid).append(url, rhs.url).append(mothershipMmsi, rhs.mothershipMmsi).append(environment, rhs.environment).append(navigation, rhs.navigation).append(sensors, rhs.sensors).append(performance, rhs.performance).append(port, rhs.port).append(design, rhs.design).append(name, rhs.name).append(tanks, rhs.tanks).append(additionalProperties, rhs.additionalProperties).append(communication, rhs.communication).append(notifications, rhs.notifications).isEquals();
    }

}
