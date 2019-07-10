
package au.com.venilia.emailais.signalk.model.groups;

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
 * resources
 * <p>
 * Resources to aid in navigation and operation of the vessel
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "charts",
    "routes",
    "notes",
    "regions",
    "waypoints"
})
public class Resources {

    /**
     * chart
     * <p>
     * A holder for charts, each named with their chart code
     * 
     */
    @JsonProperty("charts")
    @JsonPropertyDescription("A holder for charts, each named with their chart code")
    private Charts charts;
    /**
     * route
     * <p>
     * A holder for routes, each named with a UUID
     * 
     */
    @JsonProperty("routes")
    @JsonPropertyDescription("A holder for routes, each named with a UUID")
    private Routes routes;
    /**
     * notes
     * <p>
     * A holder for notes about regions, each named with a UUID. Notes might include navigation or cruising info, images, or anything
     * 
     */
    @JsonProperty("notes")
    @JsonPropertyDescription("A holder for notes about regions, each named with a UUID. Notes might include navigation or cruising info, images, or anything")
    private Notes notes;
    /**
     * region
     * <p>
     * A holder for regions, each named with UUID
     * 
     */
    @JsonProperty("regions")
    @JsonPropertyDescription("A holder for regions, each named with UUID")
    private Regions regions;
    /**
     * waypoints
     * <p>
     * A holder for waypoints, each named with a UUID
     * 
     */
    @JsonProperty("waypoints")
    @JsonPropertyDescription("A holder for waypoints, each named with a UUID")
    private Waypoints waypoints;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * chart
     * <p>
     * A holder for charts, each named with their chart code
     * 
     */
    @JsonProperty("charts")
    public Charts getCharts() {
        return charts;
    }

    /**
     * chart
     * <p>
     * A holder for charts, each named with their chart code
     * 
     */
    @JsonProperty("charts")
    public void setCharts(Charts charts) {
        this.charts = charts;
    }

    /**
     * route
     * <p>
     * A holder for routes, each named with a UUID
     * 
     */
    @JsonProperty("routes")
    public Routes getRoutes() {
        return routes;
    }

    /**
     * route
     * <p>
     * A holder for routes, each named with a UUID
     * 
     */
    @JsonProperty("routes")
    public void setRoutes(Routes routes) {
        this.routes = routes;
    }

    /**
     * notes
     * <p>
     * A holder for notes about regions, each named with a UUID. Notes might include navigation or cruising info, images, or anything
     * 
     */
    @JsonProperty("notes")
    public Notes getNotes() {
        return notes;
    }

    /**
     * notes
     * <p>
     * A holder for notes about regions, each named with a UUID. Notes might include navigation or cruising info, images, or anything
     * 
     */
    @JsonProperty("notes")
    public void setNotes(Notes notes) {
        this.notes = notes;
    }

    /**
     * region
     * <p>
     * A holder for regions, each named with UUID
     * 
     */
    @JsonProperty("regions")
    public Regions getRegions() {
        return regions;
    }

    /**
     * region
     * <p>
     * A holder for regions, each named with UUID
     * 
     */
    @JsonProperty("regions")
    public void setRegions(Regions regions) {
        this.regions = regions;
    }

    /**
     * waypoints
     * <p>
     * A holder for waypoints, each named with a UUID
     * 
     */
    @JsonProperty("waypoints")
    public Waypoints getWaypoints() {
        return waypoints;
    }

    /**
     * waypoints
     * <p>
     * A holder for waypoints, each named with a UUID
     * 
     */
    @JsonProperty("waypoints")
    public void setWaypoints(Waypoints waypoints) {
        this.waypoints = waypoints;
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
        return new ToStringBuilder(this).append("charts", charts).append("routes", routes).append("notes", notes).append("regions", regions).append("waypoints", waypoints).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(routes).append(charts).append(notes).append(regions).append(additionalProperties).append(waypoints).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Resources) == false) {
            return false;
        }
        Resources rhs = ((Resources) other);
        return new EqualsBuilder().append(routes, rhs.routes).append(charts, rhs.charts).append(notes, rhs.notes).append(regions, rhs.regions).append(additionalProperties, rhs.additionalProperties).append(waypoints, rhs.waypoints).isEquals();
    }

}
