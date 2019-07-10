
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
 * SignalK Discovery
 * <p>
 * Schema for SignalK discovery resources used to locate server endpoints.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "endpoints",
    "server"
})
public class Discovery {

    /**
     * The set of endpoints known to this server
     * 
     */
    @JsonProperty("endpoints")
    @JsonPropertyDescription("The set of endpoints known to this server")
    private Endpoints endpoints;
    /**
     * Information about this server
     * 
     */
    @JsonProperty("server")
    @JsonPropertyDescription("Information about this server")
    private Server server;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The set of endpoints known to this server
     * 
     */
    @JsonProperty("endpoints")
    public Endpoints getEndpoints() {
        return endpoints;
    }

    /**
     * The set of endpoints known to this server
     * 
     */
    @JsonProperty("endpoints")
    public void setEndpoints(Endpoints endpoints) {
        this.endpoints = endpoints;
    }

    /**
     * Information about this server
     * 
     */
    @JsonProperty("server")
    public Server getServer() {
        return server;
    }

    /**
     * Information about this server
     * 
     */
    @JsonProperty("server")
    public void setServer(Server server) {
        this.server = server;
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
        return new ToStringBuilder(this).append("endpoints", endpoints).append("server", server).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(server).append(endpoints).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Discovery) == false) {
            return false;
        }
        Discovery rhs = ((Discovery) other);
        return new EqualsBuilder().append(server, rhs.server).append(endpoints, rhs.endpoints).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
