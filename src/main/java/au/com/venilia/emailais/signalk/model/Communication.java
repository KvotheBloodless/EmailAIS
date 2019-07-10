
package au.com.venilia.emailais.signalk.model;

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
 * communication
 * <p>
 * Schema describing the communication child-object of a Vessel.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "callsignVhf",
    "callsignHf",
    "phoneNumber",
    "emailHf",
    "email",
    "satPhoneNumber",
    "skipperName",
    "crewNames"
})
public class Communication {

    /**
     * Callsign for VHF communication
     * 
     */
    @JsonProperty("callsignVhf")
    @JsonPropertyDescription("Callsign for VHF communication")
    private String callsignVhf;
    /**
     * Callsign for HF communication
     * 
     */
    @JsonProperty("callsignHf")
    @JsonPropertyDescription("Callsign for HF communication")
    private String callsignHf;
    /**
     * Phone number of skipper
     * 
     */
    @JsonProperty("phoneNumber")
    @JsonPropertyDescription("Phone number of skipper")
    private String phoneNumber;
    /**
     * Email address to be used for HF email (Winmail, Airmail, Sailmail)
     * 
     */
    @JsonProperty("emailHf")
    @JsonPropertyDescription("Email address to be used for HF email (Winmail, Airmail, Sailmail)")
    private String emailHf;
    /**
     * Regular email for the skipper
     * 
     */
    @JsonProperty("email")
    @JsonPropertyDescription("Regular email for the skipper")
    private String email;
    /**
     * Satellite phone number for vessel.
     * 
     */
    @JsonProperty("satPhoneNumber")
    @JsonPropertyDescription("Satellite phone number for vessel.")
    private String satPhoneNumber;
    /**
     * Full name of the skipper of the vessel.
     * 
     */
    @JsonProperty("skipperName")
    @JsonPropertyDescription("Full name of the skipper of the vessel.")
    private String skipperName;
    /**
     * Array with the names of the crew
     * 
     */
    @JsonProperty("crewNames")
    @JsonPropertyDescription("Array with the names of the crew")
    private List<Object> crewNames = new ArrayList<Object>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Callsign for VHF communication
     * 
     */
    @JsonProperty("callsignVhf")
    public String getCallsignVhf() {
        return callsignVhf;
    }

    /**
     * Callsign for VHF communication
     * 
     */
    @JsonProperty("callsignVhf")
    public void setCallsignVhf(String callsignVhf) {
        this.callsignVhf = callsignVhf;
    }

    /**
     * Callsign for HF communication
     * 
     */
    @JsonProperty("callsignHf")
    public String getCallsignHf() {
        return callsignHf;
    }

    /**
     * Callsign for HF communication
     * 
     */
    @JsonProperty("callsignHf")
    public void setCallsignHf(String callsignHf) {
        this.callsignHf = callsignHf;
    }

    /**
     * Phone number of skipper
     * 
     */
    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Phone number of skipper
     * 
     */
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Email address to be used for HF email (Winmail, Airmail, Sailmail)
     * 
     */
    @JsonProperty("emailHf")
    public String getEmailHf() {
        return emailHf;
    }

    /**
     * Email address to be used for HF email (Winmail, Airmail, Sailmail)
     * 
     */
    @JsonProperty("emailHf")
    public void setEmailHf(String emailHf) {
        this.emailHf = emailHf;
    }

    /**
     * Regular email for the skipper
     * 
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * Regular email for the skipper
     * 
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Satellite phone number for vessel.
     * 
     */
    @JsonProperty("satPhoneNumber")
    public String getSatPhoneNumber() {
        return satPhoneNumber;
    }

    /**
     * Satellite phone number for vessel.
     * 
     */
    @JsonProperty("satPhoneNumber")
    public void setSatPhoneNumber(String satPhoneNumber) {
        this.satPhoneNumber = satPhoneNumber;
    }

    /**
     * Full name of the skipper of the vessel.
     * 
     */
    @JsonProperty("skipperName")
    public String getSkipperName() {
        return skipperName;
    }

    /**
     * Full name of the skipper of the vessel.
     * 
     */
    @JsonProperty("skipperName")
    public void setSkipperName(String skipperName) {
        this.skipperName = skipperName;
    }

    /**
     * Array with the names of the crew
     * 
     */
    @JsonProperty("crewNames")
    public List<Object> getCrewNames() {
        return crewNames;
    }

    /**
     * Array with the names of the crew
     * 
     */
    @JsonProperty("crewNames")
    public void setCrewNames(List<Object> crewNames) {
        this.crewNames = crewNames;
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
        return new ToStringBuilder(this).append("callsignVhf", callsignVhf).append("callsignHf", callsignHf).append("phoneNumber", phoneNumber).append("emailHf", emailHf).append("email", email).append("satPhoneNumber", satPhoneNumber).append("skipperName", skipperName).append("crewNames", crewNames).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(callsignVhf).append(callsignHf).append(phoneNumber).append(satPhoneNumber).append(emailHf).append(skipperName).append(additionalProperties).append(crewNames).append(email).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Communication) == false) {
            return false;
        }
        Communication rhs = ((Communication) other);
        return new EqualsBuilder().append(callsignVhf, rhs.callsignVhf).append(callsignHf, rhs.callsignHf).append(phoneNumber, rhs.phoneNumber).append(satPhoneNumber, rhs.satPhoneNumber).append(emailHf, rhs.emailHf).append(skipperName, rhs.skipperName).append(additionalProperties, rhs.additionalProperties).append(crewNames, rhs.crewNames).append(email, rhs.email).isEquals();
    }

}
