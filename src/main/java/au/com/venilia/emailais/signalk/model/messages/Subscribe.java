
package au.com.venilia.emailais.signalk.model.messages;

import java.util.ArrayList;
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
 * Subscribe schema.
 * <p>
 * A message to allow a client to subscribe for data updates from a signalk server
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "context",
    "websocket.connectionkey",
    "reply-to",
    "subscribe"
})
public class Subscribe {

    /**
     * Context Path.
     * <p>
     * The root path for all subsequent paths, usually a vessel's path.
     * (Required)
     * 
     */
    @JsonProperty("context")
    @JsonPropertyDescription("The root path for all subsequent paths, usually a vessel's path.")
    private String context;
    /**
     * Websocket.connectionkey.
     * <p>
     * An optional session key that is used in STOMP and MQTT messages where there are no session facilities
     * 
     */
    @JsonProperty("websocket.connectionkey")
    @JsonPropertyDescription("An optional session key that is used in STOMP and MQTT messages where there are no session facilities")
    private String websocketConnectionkey;
    /**
     * Reply-to.
     * <p>
     * A reply queue that is used in STOMP and MQTT messages where there are no session facilities.
     * 
     */
    @JsonProperty("reply-to")
    @JsonPropertyDescription("A reply queue that is used in STOMP and MQTT messages where there are no session facilities.")
    private String replyTo;
    /**
     * Subscribe.
     * <p>
     * An array of paths to subscribe to, with optional criteria
     * (Required)
     * 
     */
    @JsonProperty("subscribe")
    @JsonPropertyDescription("An array of paths to subscribe to, with optional criteria")
    private List<Object> subscribe = new ArrayList<Object>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Context Path.
     * <p>
     * The root path for all subsequent paths, usually a vessel's path.
     * (Required)
     * 
     */
    @JsonProperty("context")
    public String getContext() {
        return context;
    }

    /**
     * Context Path.
     * <p>
     * The root path for all subsequent paths, usually a vessel's path.
     * (Required)
     * 
     */
    @JsonProperty("context")
    public void setContext(String context) {
        this.context = context;
    }

    /**
     * Websocket.connectionkey.
     * <p>
     * An optional session key that is used in STOMP and MQTT messages where there are no session facilities
     * 
     */
    @JsonProperty("websocket.connectionkey")
    public String getWebsocketConnectionkey() {
        return websocketConnectionkey;
    }

    /**
     * Websocket.connectionkey.
     * <p>
     * An optional session key that is used in STOMP and MQTT messages where there are no session facilities
     * 
     */
    @JsonProperty("websocket.connectionkey")
    public void setWebsocketConnectionkey(String websocketConnectionkey) {
        this.websocketConnectionkey = websocketConnectionkey;
    }

    /**
     * Reply-to.
     * <p>
     * A reply queue that is used in STOMP and MQTT messages where there are no session facilities.
     * 
     */
    @JsonProperty("reply-to")
    public String getReplyTo() {
        return replyTo;
    }

    /**
     * Reply-to.
     * <p>
     * A reply queue that is used in STOMP and MQTT messages where there are no session facilities.
     * 
     */
    @JsonProperty("reply-to")
    public void setReplyTo(String replyTo) {
        this.replyTo = replyTo;
    }

    /**
     * Subscribe.
     * <p>
     * An array of paths to subscribe to, with optional criteria
     * (Required)
     * 
     */
    @JsonProperty("subscribe")
    public List<Object> getSubscribe() {
        return subscribe;
    }

    /**
     * Subscribe.
     * <p>
     * An array of paths to subscribe to, with optional criteria
     * (Required)
     * 
     */
    @JsonProperty("subscribe")
    public void setSubscribe(List<Object> subscribe) {
        this.subscribe = subscribe;
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
        return new ToStringBuilder(this).append("context", context).append("websocketConnectionkey", websocketConnectionkey).append("replyTo", replyTo).append("subscribe", subscribe).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(context).append(websocketConnectionkey).append(replyTo).append(additionalProperties).append(subscribe).toHashCode();
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
        return new EqualsBuilder().append(context, rhs.context).append(websocketConnectionkey, rhs.websocketConnectionkey).append(replyTo, rhs.replyTo).append(additionalProperties, rhs.additionalProperties).append(subscribe, rhs.subscribe).isEquals();
    }

}
