
package au.com.venilia.emailais.signalk.model.groups;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * A tank, named by a unique identifier
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "freshWater",
    "wasteWater",
    "blackWater",
    "fuel",
    "lubrication",
    "liveWell",
    "gas",
    "ballast"
})
public class Tanks {

    @JsonProperty("freshWater")
    private Object freshWater;
    @JsonProperty("wasteWater")
    private Object wasteWater;
    @JsonProperty("blackWater")
    private Object blackWater;
    @JsonProperty("fuel")
    private Object fuel;
    @JsonProperty("lubrication")
    private Object lubrication;
    @JsonProperty("liveWell")
    private Object liveWell;
    @JsonProperty("gas")
    private Object gas;
    @JsonProperty("ballast")
    private Object ballast;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("freshWater")
    public Object getFreshWater() {
        return freshWater;
    }

    @JsonProperty("freshWater")
    public void setFreshWater(Object freshWater) {
        this.freshWater = freshWater;
    }

    @JsonProperty("wasteWater")
    public Object getWasteWater() {
        return wasteWater;
    }

    @JsonProperty("wasteWater")
    public void setWasteWater(Object wasteWater) {
        this.wasteWater = wasteWater;
    }

    @JsonProperty("blackWater")
    public Object getBlackWater() {
        return blackWater;
    }

    @JsonProperty("blackWater")
    public void setBlackWater(Object blackWater) {
        this.blackWater = blackWater;
    }

    @JsonProperty("fuel")
    public Object getFuel() {
        return fuel;
    }

    @JsonProperty("fuel")
    public void setFuel(Object fuel) {
        this.fuel = fuel;
    }

    @JsonProperty("lubrication")
    public Object getLubrication() {
        return lubrication;
    }

    @JsonProperty("lubrication")
    public void setLubrication(Object lubrication) {
        this.lubrication = lubrication;
    }

    @JsonProperty("liveWell")
    public Object getLiveWell() {
        return liveWell;
    }

    @JsonProperty("liveWell")
    public void setLiveWell(Object liveWell) {
        this.liveWell = liveWell;
    }

    @JsonProperty("gas")
    public Object getGas() {
        return gas;
    }

    @JsonProperty("gas")
    public void setGas(Object gas) {
        this.gas = gas;
    }

    @JsonProperty("ballast")
    public Object getBallast() {
        return ballast;
    }

    @JsonProperty("ballast")
    public void setBallast(Object ballast) {
        this.ballast = ballast;
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
        return new ToStringBuilder(this).append("freshWater", freshWater).append("wasteWater", wasteWater).append("blackWater", blackWater).append("fuel", fuel).append("lubrication", lubrication).append("liveWell", liveWell).append("gas", gas).append("ballast", ballast).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(wasteWater).append(freshWater).append(fuel).append(gas).append(liveWell).append(additionalProperties).append(blackWater).append(lubrication).append(ballast).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tanks) == false) {
            return false;
        }
        Tanks rhs = ((Tanks) other);
        return new EqualsBuilder().append(wasteWater, rhs.wasteWater).append(freshWater, rhs.freshWater).append(fuel, rhs.fuel).append(gas, rhs.gas).append(liveWell, rhs.liveWell).append(additionalProperties, rhs.additionalProperties).append(blackWater, rhs.blackWater).append(lubrication, rhs.lubrication).append(ballast, rhs.ballast).isEquals();
    }

}
