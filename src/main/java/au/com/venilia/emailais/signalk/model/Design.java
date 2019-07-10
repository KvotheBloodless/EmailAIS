
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
 * design
 * <p>
 * An object describing the vessels primary dimensions and statistics.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "displacement",
    "aisShipType",
    "draft",
    "length",
    "keel",
    "beam",
    "airHeight",
    "rigging"
})
public class Design {

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("displacement")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature displacement;
    /**
     * The ais ship type see http://www.bosunsmate.org/ais/message5.php
     * 
     */
    @JsonProperty("aisShipType")
    @JsonPropertyDescription("The ais ship type see http://www.bosunsmate.org/ais/message5.php")
    private AisShipType aisShipType;
    /**
     * draft
     * <p>
     * The draft of the vessel
     * 
     */
    @JsonProperty("draft")
    @JsonPropertyDescription("The draft of the vessel")
    private Draft draft;
    /**
     * length
     * <p>
     * The various lengths of the vessel
     * 
     */
    @JsonProperty("length")
    @JsonPropertyDescription("The various lengths of the vessel")
    private Length length;
    /**
     * keel
     * <p>
     * Information about the vessel's keel
     * 
     */
    @JsonProperty("keel")
    @JsonPropertyDescription("Information about the vessel's keel")
    private Keel keel;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("beam")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature beam;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("airHeight")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature airHeight;
    /**
     * rigging
     * <p>
     * Information about the vessel's rigging
     * 
     */
    @JsonProperty("rigging")
    @JsonPropertyDescription("Information about the vessel's rigging")
    private Rigging rigging;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("displacement")
    public Temperature getDisplacement() {
        return displacement;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("displacement")
    public void setDisplacement(Temperature displacement) {
        this.displacement = displacement;
    }

    /**
     * The ais ship type see http://www.bosunsmate.org/ais/message5.php
     * 
     */
    @JsonProperty("aisShipType")
    public AisShipType getAisShipType() {
        return aisShipType;
    }

    /**
     * The ais ship type see http://www.bosunsmate.org/ais/message5.php
     * 
     */
    @JsonProperty("aisShipType")
    public void setAisShipType(AisShipType aisShipType) {
        this.aisShipType = aisShipType;
    }

    /**
     * draft
     * <p>
     * The draft of the vessel
     * 
     */
    @JsonProperty("draft")
    public Draft getDraft() {
        return draft;
    }

    /**
     * draft
     * <p>
     * The draft of the vessel
     * 
     */
    @JsonProperty("draft")
    public void setDraft(Draft draft) {
        this.draft = draft;
    }

    /**
     * length
     * <p>
     * The various lengths of the vessel
     * 
     */
    @JsonProperty("length")
    public Length getLength() {
        return length;
    }

    /**
     * length
     * <p>
     * The various lengths of the vessel
     * 
     */
    @JsonProperty("length")
    public void setLength(Length length) {
        this.length = length;
    }

    /**
     * keel
     * <p>
     * Information about the vessel's keel
     * 
     */
    @JsonProperty("keel")
    public Keel getKeel() {
        return keel;
    }

    /**
     * keel
     * <p>
     * Information about the vessel's keel
     * 
     */
    @JsonProperty("keel")
    public void setKeel(Keel keel) {
        this.keel = keel;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("beam")
    public Temperature getBeam() {
        return beam;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("beam")
    public void setBeam(Temperature beam) {
        this.beam = beam;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("airHeight")
    public Temperature getAirHeight() {
        return airHeight;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("airHeight")
    public void setAirHeight(Temperature airHeight) {
        this.airHeight = airHeight;
    }

    /**
     * rigging
     * <p>
     * Information about the vessel's rigging
     * 
     */
    @JsonProperty("rigging")
    public Rigging getRigging() {
        return rigging;
    }

    /**
     * rigging
     * <p>
     * Information about the vessel's rigging
     * 
     */
    @JsonProperty("rigging")
    public void setRigging(Rigging rigging) {
        this.rigging = rigging;
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
        return new ToStringBuilder(this).append("displacement", displacement).append("aisShipType", aisShipType).append("draft", draft).append("length", length).append("keel", keel).append("beam", beam).append("airHeight", airHeight).append("rigging", rigging).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(beam).append(keel).append(rigging).append(draft).append(length).append(displacement).append(additionalProperties).append(aisShipType).append(airHeight).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Design) == false) {
            return false;
        }
        Design rhs = ((Design) other);
        return new EqualsBuilder().append(beam, rhs.beam).append(keel, rhs.keel).append(rigging, rhs.rigging).append(draft, rhs.draft).append(length, rhs.length).append(displacement, rhs.displacement).append(additionalProperties, rhs.additionalProperties).append(aisShipType, rhs.aisShipType).append(airHeight, rhs.airHeight).isEquals();
    }

}
