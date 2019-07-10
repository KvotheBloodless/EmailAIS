
package au.com.venilia.emailais.signalk.model;

import java.util.ArrayList;
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


/**
 * SignalK Delta message schema
 * <p>
 * Schema for defining updates and subscriptions to parts of a SignalK data model, for example for communicating updates of data
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "context",
    "updates",
    "subscribe",
    "unsubscribe",
    "get",
    "list",
    "put"
})
public class Delta {

    /**
     * The context path of the updates, eg. the top level path plus object identifier.
     * 
     */
    @JsonProperty("context")
    @JsonPropertyDescription("The context path of the updates, eg. the top level path plus object identifier.")
    private String context;
    /**
     * The updates
     * (Required)
     * 
     */
    @JsonProperty("updates")
    @JsonPropertyDescription("The updates")
    private java.util.List<Update> updates = new ArrayList<Update>();
    /**
     * A subscription request
     * 
     */
    @JsonProperty("subscribe")
    @JsonPropertyDescription("A subscription request")
    private java.util.List<Subscribe> subscribe = new ArrayList<Subscribe>();
    /**
     * An unsubscribe request.
     * 
     */
    @JsonProperty("unsubscribe")
    @JsonPropertyDescription("An unsubscribe request.")
    private java.util.List<Unsubscribe> unsubscribe = new ArrayList<Unsubscribe>();
    /**
     * A websockets equivalent to a REST GET request.This is for one-off requests, use the subscribe message for regular changes.
     * 
     */
    @JsonProperty("get")
    @JsonPropertyDescription("A websockets equivalent to a REST GET request.This is for one-off requests, use the subscribe message for regular changes.")
    private java.util.List<Get> get = new ArrayList<Get>();
    /**
     * Gets a list of known keys for this path
     * 
     */
    @JsonProperty("list")
    @JsonPropertyDescription("Gets a list of known keys for this path")
    private java.util.List<List> list = new ArrayList<List>();
    /**
     * A websockets equivalent to a REST PUT request. This is for one-off changes, use the updates message for regular changes.
     * 
     */
    @JsonProperty("put")
    @JsonPropertyDescription("A websockets equivalent to a REST PUT request. This is for one-off changes, use the updates message for regular changes.")
    private java.util.List<Put> put = new ArrayList<Put>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The context path of the updates, eg. the top level path plus object identifier.
     * 
     */
    @JsonProperty("context")
    public String getContext() {
        return context;
    }

    /**
     * The context path of the updates, eg. the top level path plus object identifier.
     * 
     */
    @JsonProperty("context")
    public void setContext(String context) {
        this.context = context;
    }

    /**
     * The updates
     * (Required)
     * 
     */
    @JsonProperty("updates")
    public java.util.List<Update> getUpdates() {
        return updates;
    }

    /**
     * The updates
     * (Required)
     * 
     */
    @JsonProperty("updates")
    public void setUpdates(java.util.List<Update> updates) {
        this.updates = updates;
    }

    /**
     * A subscription request
     * 
     */
    @JsonProperty("subscribe")
    public java.util.List<Subscribe> getSubscribe() {
        return subscribe;
    }

    /**
     * A subscription request
     * 
     */
    @JsonProperty("subscribe")
    public void setSubscribe(java.util.List<Subscribe> subscribe) {
        this.subscribe = subscribe;
    }

    /**
     * An unsubscribe request.
     * 
     */
    @JsonProperty("unsubscribe")
    public java.util.List<Unsubscribe> getUnsubscribe() {
        return unsubscribe;
    }

    /**
     * An unsubscribe request.
     * 
     */
    @JsonProperty("unsubscribe")
    public void setUnsubscribe(java.util.List<Unsubscribe> unsubscribe) {
        this.unsubscribe = unsubscribe;
    }

    /**
     * A websockets equivalent to a REST GET request.This is for one-off requests, use the subscribe message for regular changes.
     * 
     */
    @JsonProperty("get")
    public java.util.List<Get> getGet() {
        return get;
    }

    /**
     * A websockets equivalent to a REST GET request.This is for one-off requests, use the subscribe message for regular changes.
     * 
     */
    @JsonProperty("get")
    public void setGet(java.util.List<Get> get) {
        this.get = get;
    }

    /**
     * Gets a list of known keys for this path
     * 
     */
    @JsonProperty("list")
    public java.util.List<List> getList() {
        return list;
    }

    /**
     * Gets a list of known keys for this path
     * 
     */
    @JsonProperty("list")
    public void setList(java.util.List<List> list) {
        this.list = list;
    }

    /**
     * A websockets equivalent to a REST PUT request. This is for one-off changes, use the updates message for regular changes.
     * 
     */
    @JsonProperty("put")
    public java.util.List<Put> getPut() {
        return put;
    }

    /**
     * A websockets equivalent to a REST PUT request. This is for one-off changes, use the updates message for regular changes.
     * 
     */
    @JsonProperty("put")
    public void setPut(java.util.List<Put> put) {
        this.put = put;
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
        return new ToStringBuilder(this).append("context", context).append("updates", updates).append("subscribe", subscribe).append("unsubscribe", unsubscribe).append("get", get).append("list", list).append("put", put).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(subscribe).append(unsubscribe).append(get).append(context).append(additionalProperties).append(updates).append(list).append(put).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Delta) == false) {
            return false;
        }
        Delta rhs = ((Delta) other);
        return new EqualsBuilder().append(subscribe, rhs.subscribe).append(unsubscribe, rhs.unsubscribe).append(get, rhs.get).append(context, rhs.context).append(additionalProperties, rhs.additionalProperties).append(updates, rhs.updates).append(list, rhs.list).append(put, rhs.put).isEquals();
    }

}
