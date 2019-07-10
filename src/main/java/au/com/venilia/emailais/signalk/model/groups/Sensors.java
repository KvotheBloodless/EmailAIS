
package au.com.venilia.emailais.signalk.model.groups;

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

import au.com.venilia.emailais.signalk.model.Temperature;


/**
 * sensor
 * <p>
 * An object describing an individual sensor. It should be an object in vessel, named using a unique name or UUID
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "name",
    "sensorType",
    "sensorData",
    "fromBow",
    "fromCenter"
})
public class Sensors {

    /**
     * The common name of the sensor
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The common name of the sensor")
    private String name;
    /**
     * The datamodel definition of the sensor data. FIXME - need to create a definitions lib of sensor datamodel types
     * 
     */
    @JsonProperty("sensorType")
    @JsonPropertyDescription("The datamodel definition of the sensor data. FIXME - need to create a definitions lib of sensor datamodel types")
    private String sensorType;
    /**
     * The data of the sensor data. FIXME - need to ref the definitions of sensor types
     * 
     */
    @JsonProperty("sensorData")
    @JsonPropertyDescription("The data of the sensor data. FIXME - need to ref the definitions of sensor types")
    private String sensorData;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("fromBow")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature fromBow;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("fromCenter")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature fromCenter;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The common name of the sensor
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The common name of the sensor
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The datamodel definition of the sensor data. FIXME - need to create a definitions lib of sensor datamodel types
     * 
     */
    @JsonProperty("sensorType")
    public String getSensorType() {
        return sensorType;
    }

    /**
     * The datamodel definition of the sensor data. FIXME - need to create a definitions lib of sensor datamodel types
     * 
     */
    @JsonProperty("sensorType")
    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    /**
     * The data of the sensor data. FIXME - need to ref the definitions of sensor types
     * 
     */
    @JsonProperty("sensorData")
    public String getSensorData() {
        return sensorData;
    }

    /**
     * The data of the sensor data. FIXME - need to ref the definitions of sensor types
     * 
     */
    @JsonProperty("sensorData")
    public void setSensorData(String sensorData) {
        this.sensorData = sensorData;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("fromBow")
    public Temperature getFromBow() {
        return fromBow;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("fromBow")
    public void setFromBow(Temperature fromBow) {
        this.fromBow = fromBow;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("fromCenter")
    public Temperature getFromCenter() {
        return fromCenter;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("fromCenter")
    public void setFromCenter(Temperature fromCenter) {
        this.fromCenter = fromCenter;
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
        return new ToStringBuilder(this).append("name", name).append("sensorType", sensorType).append("sensorData", sensorData).append("fromBow", fromBow).append("fromCenter", fromCenter).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fromBow).append(fromCenter).append(sensorType).append(name).append(sensorData).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sensors) == false) {
            return false;
        }
        Sensors rhs = ((Sensors) other);
        return new EqualsBuilder().append(fromBow, rhs.fromBow).append(fromCenter, rhs.fromCenter).append(sensorType, rhs.sensorType).append(name, rhs.name).append(sensorData, rhs.sensorData).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
