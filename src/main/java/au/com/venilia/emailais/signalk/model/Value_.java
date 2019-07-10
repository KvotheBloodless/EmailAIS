
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

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "overall",
    "hull",
    "waterline"
})
public class Value_ {

    /**
     * Length overall
     * 
     */
    @JsonProperty("overall")
    @JsonPropertyDescription("Length overall")
    private Double overall;
    /**
     * Length of hull
     * 
     */
    @JsonProperty("hull")
    @JsonPropertyDescription("Length of hull")
    private Double hull;
    /**
     * Length at waterline
     * 
     */
    @JsonProperty("waterline")
    @JsonPropertyDescription("Length at waterline")
    private Double waterline;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Length overall
     * 
     */
    @JsonProperty("overall")
    public Double getOverall() {
        return overall;
    }

    /**
     * Length overall
     * 
     */
    @JsonProperty("overall")
    public void setOverall(Double overall) {
        this.overall = overall;
    }

    /**
     * Length of hull
     * 
     */
    @JsonProperty("hull")
    public Double getHull() {
        return hull;
    }

    /**
     * Length of hull
     * 
     */
    @JsonProperty("hull")
    public void setHull(Double hull) {
        this.hull = hull;
    }

    /**
     * Length at waterline
     * 
     */
    @JsonProperty("waterline")
    public Double getWaterline() {
        return waterline;
    }

    /**
     * Length at waterline
     * 
     */
    @JsonProperty("waterline")
    public void setWaterline(Double waterline) {
        this.waterline = waterline;
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
        return new ToStringBuilder(this).append("overall", overall).append("hull", hull).append("waterline", waterline).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(overall).append(additionalProperties).append(hull).append(waterline).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Value_) == false) {
            return false;
        }
        Value_ rhs = ((Value_) other);
        return new EqualsBuilder().append(overall, rhs.overall).append(additionalProperties, rhs.additionalProperties).append(hull, rhs.hull).append(waterline, rhs.waterline).isEquals();
    }

}
