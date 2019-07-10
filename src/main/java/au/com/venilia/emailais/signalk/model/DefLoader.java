
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
 * def_loader
 * <p>
 * Nasty hack to get the definitions loaded first, so they resolve nicely
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "stringValue",
    "numberValue",
    "nullValue"
})
public class DefLoader {

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("stringValue")
    @JsonPropertyDescription("Data should be of type number.")
    private CommonName stringValue;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("numberValue")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature numberValue;
    /**
     * Data should be of type NULL.
     * 
     */
    @JsonProperty("nullValue")
    @JsonPropertyDescription("Data should be of type NULL.")
    private NullValue nullValue;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("stringValue")
    public CommonName getStringValue() {
        return stringValue;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("stringValue")
    public void setStringValue(CommonName stringValue) {
        this.stringValue = stringValue;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("numberValue")
    public Temperature getNumberValue() {
        return numberValue;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("numberValue")
    public void setNumberValue(Temperature numberValue) {
        this.numberValue = numberValue;
    }

    /**
     * Data should be of type NULL.
     * 
     */
    @JsonProperty("nullValue")
    public NullValue getNullValue() {
        return nullValue;
    }

    /**
     * Data should be of type NULL.
     * 
     */
    @JsonProperty("nullValue")
    public void setNullValue(NullValue nullValue) {
        this.nullValue = nullValue;
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
        return new ToStringBuilder(this).append("stringValue", stringValue).append("numberValue", numberValue).append("nullValue", nullValue).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(stringValue).append(numberValue).append(additionalProperties).append(nullValue).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DefLoader) == false) {
            return false;
        }
        DefLoader rhs = ((DefLoader) other);
        return new EqualsBuilder().append(stringValue, rhs.stringValue).append(numberValue, rhs.numberValue).append(additionalProperties, rhs.additionalProperties).append(nullValue, rhs.nullValue).isEquals();
    }

}
