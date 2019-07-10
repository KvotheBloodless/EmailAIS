
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

import au.com.venilia.emailais.signalk.model.groups.Resources;
import au.com.venilia.emailais.signalk.model.groups.Sources;

/**
 * SignalK
 * <p>
 * Root schema of Signal K. Contains the list of vessels plus a reference to the local boat (also contained in the vessels list).
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
        "self",
        "vessels",
        "aircraft",
        "aton",
        "sar",
        "sources",
        "resources",
        "version"
})
public class Signalk {

    /**
     * This holds the context (prefix + UUID, MMSI or URL in dot notation) of the server's self object.
     * (Required)
     * 
     */
    @JsonProperty("self")
    @JsonPropertyDescription("This holds the context (prefix + UUID, MMSI or URL in dot notation) of the server's self object.")
    private String self;
    /**
     * A wrapper object for vessel objects, each describing vessels in range, including this vessel.
     * 
     */
    @JsonProperty("vessels")
    @JsonPropertyDescription("A wrapper object for vessel objects, each describing vessels in range, including this vessel.")
    private Vessels vessels;
    /**
     * A wrapper object for aircraft, primarily intended for SAR aircraft in relation to marine search and rescue. For clarity about
     * seaplanes etc, if it CAN fly, its an aircraft.
     * 
     */
    @JsonProperty("aircraft")
    @JsonPropertyDescription("A wrapper object for aircraft, primarily intended for SAR aircraft in relation to marine search and rescue. For clarity about seaplanes etc, if it CAN fly, its an aircraft.")
    private Aircraft_ aircraft;
    /**
     * A wrapper object for Aids to Navigation (aton's)
     * 
     */
    @JsonProperty("aton")
    @JsonPropertyDescription("A wrapper object for Aids to Navigation (aton's)")
    private Aton_ aton;
    /**
     * A wrapper object for Search And Rescue (SAR) MMSI's usied in transponders. MOB, EPIRBS etc
     * 
     */
    @JsonProperty("sar")
    @JsonPropertyDescription("A wrapper object for Search And Rescue (SAR) MMSI's usied in transponders. MOB, EPIRBS etc")
    private Sar_ sar;
    /**
     * sources
     * <p>
     * Metadata about the sources, eg. buses and connected sensors
     * 
     */
    @JsonProperty("sources")
    @JsonPropertyDescription("Metadata about the sources, eg. buses and connected sensors")
    private Sources sources;
    /**
     * resources
     * <p>
     * Resources to aid in navigation and operation of the vessel
     * 
     */
    @JsonProperty("resources")
    @JsonPropertyDescription("Resources to aid in navigation and operation of the vessel")
    private Resources resources;
    /**
     * Version of the Signal K schema/APIs used by the root object.
     * (Required)
     * 
     */
    @JsonProperty("version")
    @JsonPropertyDescription("Version of the Signal K schema/APIs used by the root object.")
    private String version;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * This holds the context (prefix + UUID, MMSI or URL in dot notation) of the server's self object.
     * (Required)
     * 
     */
    @JsonProperty("self")
    public String getSelf() {

        return self;
    }

    /**
     * This holds the context (prefix + UUID, MMSI or URL in dot notation) of the server's self object.
     * (Required)
     * 
     */
    @JsonProperty("self")
    public void setSelf(String self) {

        this.self = self;
    }

    /**
     * A wrapper object for vessel objects, each describing vessels in range, including this vessel.
     * 
     */
    @JsonProperty("vessels")
    public Vessels getVessels() {

        return vessels;
    }

    /**
     * A wrapper object for vessel objects, each describing vessels in range, including this vessel.
     * 
     */
    @JsonProperty("vessels")
    public void setVessels(Vessels vessels) {

        this.vessels = vessels;
    }

    /**
     * A wrapper object for aircraft, primarily intended for SAR aircraft in relation to marine search and rescue. For clarity about
     * seaplanes etc, if it CAN fly, its an aircraft.
     * 
     */
    @JsonProperty("aircraft")
    public Aircraft_ getAircraft() {

        return aircraft;
    }

    /**
     * A wrapper object for aircraft, primarily intended for SAR aircraft in relation to marine search and rescue. For clarity about
     * seaplanes etc, if it CAN fly, its an aircraft.
     * 
     */
    @JsonProperty("aircraft")
    public void setAircraft(Aircraft_ aircraft) {

        this.aircraft = aircraft;
    }

    /**
     * A wrapper object for Aids to Navigation (aton's)
     * 
     */
    @JsonProperty("aton")
    public Aton_ getAton() {

        return aton;
    }

    /**
     * A wrapper object for Aids to Navigation (aton's)
     * 
     */
    @JsonProperty("aton")
    public void setAton(Aton_ aton) {

        this.aton = aton;
    }

    /**
     * A wrapper object for Search And Rescue (SAR) MMSI's usied in transponders. MOB, EPIRBS etc
     * 
     */
    @JsonProperty("sar")
    public Sar_ getSar() {

        return sar;
    }

    /**
     * A wrapper object for Search And Rescue (SAR) MMSI's usied in transponders. MOB, EPIRBS etc
     * 
     */
    @JsonProperty("sar")
    public void setSar(Sar_ sar) {

        this.sar = sar;
    }

    /**
     * sources
     * <p>
     * Metadata about the sources, eg. buses and connected sensors
     * 
     */
    @JsonProperty("sources")
    public Sources getSources() {

        return sources;
    }

    /**
     * sources
     * <p>
     * Metadata about the sources, eg. buses and connected sensors
     * 
     */
    @JsonProperty("sources")
    public void setSources(Sources sources) {

        this.sources = sources;
    }

    /**
     * resources
     * <p>
     * Resources to aid in navigation and operation of the vessel
     * 
     */
    @JsonProperty("resources")
    public Resources getResources() {

        return resources;
    }

    /**
     * resources
     * <p>
     * Resources to aid in navigation and operation of the vessel
     * 
     */
    @JsonProperty("resources")
    public void setResources(Resources resources) {

        this.resources = resources;
    }

    /**
     * Version of the Signal K schema/APIs used by the root object.
     * (Required)
     * 
     */
    @JsonProperty("version")
    public String getVersion() {

        return version;
    }

    /**
     * Version of the Signal K schema/APIs used by the root object.
     * (Required)
     * 
     */
    @JsonProperty("version")
    public void setVersion(String version) {

        this.version = version;
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

        return new ToStringBuilder(this).append("self", self)
                .append("vessels", vessels)
                .append("aircraft", aircraft)
                .append("aton", aton)
                .append("sar", sar)
                .append("sources", sources)
                .append("resources", resources)
                .append("version", version)
                .append("additionalProperties", additionalProperties)
                .toString();
    }

    @Override
    public int hashCode() {

        return new HashCodeBuilder().append(sources)
                .append(sar)
                .append(aircraft)
                .append(self)
                .append(resources)
                .append(additionalProperties)
                .append(version)
                .append(vessels)
                .append(aton)
                .toHashCode();
    }

    @Override
    public boolean equals(Object other) {

        if (other == this) {
            return true;
        }
        if ((other instanceof Signalk) == false) {
            return false;
        }
        Signalk rhs = ((Signalk) other);
        return new EqualsBuilder().append(sources, rhs.sources)
                .append(sar, rhs.sar)
                .append(aircraft, rhs.aircraft)
                .append(self, rhs.self)
                .append(resources, rhs.resources)
                .append(additionalProperties, rhs.additionalProperties)
                .append(version, rhs.version)
                .append(vessels, rhs.vessels)
                .append(aton, rhs.aton)
                .isEquals();
    }

}
