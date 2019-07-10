
package au.com.venilia.emailais.signalk.model.external.geojson;

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
 * Geo JSON object
 * <p>
 * Schema for a Geo JSON object
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "crs",
    "bbox"
})
public class Geojson {

    /**
     * crs
     * <p>
     * a Coordinate Reference System object
     * 
     */
    @JsonProperty("crs")
    @JsonPropertyDescription("a Coordinate Reference System object")
    private Crs crs;
    /**
     * A bounding box as defined by GeoJSON
     * 
     */
    @JsonProperty("bbox")
    @JsonPropertyDescription("A bounding box as defined by GeoJSON")
    private List<Double> bbox = new ArrayList<Double>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * crs
     * <p>
     * a Coordinate Reference System object
     * 
     */
    @JsonProperty("crs")
    public Crs getCrs() {
        return crs;
    }

    /**
     * crs
     * <p>
     * a Coordinate Reference System object
     * 
     */
    @JsonProperty("crs")
    public void setCrs(Crs crs) {
        this.crs = crs;
    }

    /**
     * A bounding box as defined by GeoJSON
     * 
     */
    @JsonProperty("bbox")
    public List<Double> getBbox() {
        return bbox;
    }

    /**
     * A bounding box as defined by GeoJSON
     * 
     */
    @JsonProperty("bbox")
    public void setBbox(List<Double> bbox) {
        this.bbox = bbox;
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
        return new ToStringBuilder(this).append("crs", crs).append("bbox", bbox).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(crs).append(bbox).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Geojson) == false) {
            return false;
        }
        Geojson rhs = ((Geojson) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(crs, rhs.crs).append(bbox, rhs.bbox).isEquals();
    }

}
