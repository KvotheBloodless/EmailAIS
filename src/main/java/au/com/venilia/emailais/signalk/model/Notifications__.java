
package au.com.venilia.emailais.signalk.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * notifications
 * <p>
 * Notifications currently raised. Major categories have well-defined names, but the tree can be extended by any hierarchical structure
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "mob",
    "fire",
    "sinking",
    "flooding",
    "collision",
    "grounding",
    "listing",
    "adrift",
    "piracy",
    "abandon"
})
public class Notifications__ {

    @JsonProperty("mob")
    private Mob mob;
    @JsonProperty("fire")
    private Mob fire;
    @JsonProperty("sinking")
    private Mob sinking;
    @JsonProperty("flooding")
    private Mob flooding;
    @JsonProperty("collision")
    private Mob collision;
    @JsonProperty("grounding")
    private Mob grounding;
    @JsonProperty("listing")
    private Mob listing;
    @JsonProperty("adrift")
    private Mob adrift;
    @JsonProperty("piracy")
    private Mob piracy;
    @JsonProperty("abandon")
    private Mob abandon;

    @JsonProperty("mob")
    public Mob getMob() {
        return mob;
    }

    @JsonProperty("mob")
    public void setMob(Mob mob) {
        this.mob = mob;
    }

    @JsonProperty("fire")
    public Mob getFire() {
        return fire;
    }

    @JsonProperty("fire")
    public void setFire(Mob fire) {
        this.fire = fire;
    }

    @JsonProperty("sinking")
    public Mob getSinking() {
        return sinking;
    }

    @JsonProperty("sinking")
    public void setSinking(Mob sinking) {
        this.sinking = sinking;
    }

    @JsonProperty("flooding")
    public Mob getFlooding() {
        return flooding;
    }

    @JsonProperty("flooding")
    public void setFlooding(Mob flooding) {
        this.flooding = flooding;
    }

    @JsonProperty("collision")
    public Mob getCollision() {
        return collision;
    }

    @JsonProperty("collision")
    public void setCollision(Mob collision) {
        this.collision = collision;
    }

    @JsonProperty("grounding")
    public Mob getGrounding() {
        return grounding;
    }

    @JsonProperty("grounding")
    public void setGrounding(Mob grounding) {
        this.grounding = grounding;
    }

    @JsonProperty("listing")
    public Mob getListing() {
        return listing;
    }

    @JsonProperty("listing")
    public void setListing(Mob listing) {
        this.listing = listing;
    }

    @JsonProperty("adrift")
    public Mob getAdrift() {
        return adrift;
    }

    @JsonProperty("adrift")
    public void setAdrift(Mob adrift) {
        this.adrift = adrift;
    }

    @JsonProperty("piracy")
    public Mob getPiracy() {
        return piracy;
    }

    @JsonProperty("piracy")
    public void setPiracy(Mob piracy) {
        this.piracy = piracy;
    }

    @JsonProperty("abandon")
    public Mob getAbandon() {
        return abandon;
    }

    @JsonProperty("abandon")
    public void setAbandon(Mob abandon) {
        this.abandon = abandon;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("mob", mob).append("fire", fire).append("sinking", sinking).append("flooding", flooding).append("collision", collision).append("grounding", grounding).append("listing", listing).append("adrift", adrift).append("piracy", piracy).append("abandon", abandon).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(mob).append(collision).append(adrift).append(abandon).append(piracy).append(sinking).append(fire).append(flooding).append(listing).append(grounding).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Notifications__) == false) {
            return false;
        }
        Notifications__ rhs = ((Notifications__) other);
        return new EqualsBuilder().append(mob, rhs.mob).append(collision, rhs.collision).append(adrift, rhs.adrift).append(abandon, rhs.abandon).append(piracy, rhs.piracy).append(sinking, rhs.sinking).append(fire, rhs.fire).append(flooding, rhs.flooding).append(listing, rhs.listing).append(grounding, rhs.grounding).isEquals();
    }

}
