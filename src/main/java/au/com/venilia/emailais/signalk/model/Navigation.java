
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
 * navigation
 * <p>
 * Schema describing the navigation child-object of a Vessel.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "lights",
    "courseOverGroundMagnetic",
    "courseOverGroundTrue",
    "courseRhumbline",
    "courseGreatCircle",
    "closestApproach",
    "racing",
    "magneticVariation",
    "magneticVariationAgeOfService",
    "destination",
    "gnss",
    "headingMagnetic",
    "headingTrue",
    "position",
    "attitude",
    "maneuver",
    "rateOfTurn",
    "speedOverGround",
    "speedThroughWater",
    "speedThroughWaterTransverse",
    "speedThroughWaterLongitudinal",
    "leewayAngle",
    "log",
    "trip",
    "state",
    "anchor",
    "datetime"
})
public class Navigation {

    /**
     * Navigation lights
     * <p>
     * Current state of the vessels navigation lights
     * 
     */
    @JsonProperty("lights")
    @JsonPropertyDescription("Current state of the vessels navigation lights")
    private Lights lights;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("courseOverGroundMagnetic")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature courseOverGroundMagnetic;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("courseOverGroundTrue")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature courseOverGroundTrue;
    /**
     * Course
     * <p>
     * The currently active course (can be a route, or just a point one is navigating towards)
     * 
     */
    @JsonProperty("courseRhumbline")
    @JsonPropertyDescription("The currently active course (can be a route, or just a point one is navigating towards)")
    private CourseRhumbline courseRhumbline;
    /**
     * Course
     * <p>
     * The currently active course (can be a route, or just a point one is navigating towards)
     * 
     */
    @JsonProperty("courseGreatCircle")
    @JsonPropertyDescription("The currently active course (can be a route, or just a point one is navigating towards)")
    private CourseRhumbline courseGreatCircle;
    /**
     * Calculated values for other vessels, e.g. from AIS
     * 
     */
    @JsonProperty("closestApproach")
    @JsonPropertyDescription("Calculated values for other vessels, e.g. from AIS")
    private ClosestApproach closestApproach;
    /**
     * Specific navigational data related to yacht racing.
     * 
     */
    @JsonProperty("racing")
    @JsonPropertyDescription("Specific navigational data related to yacht racing.")
    private Racing racing;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("magneticVariation")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature magneticVariation;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("magneticVariationAgeOfService")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature magneticVariationAgeOfService;
    /**
     * destination
     * <p>
     * The intended destination of this trip
     * 
     */
    @JsonProperty("destination")
    @JsonPropertyDescription("The intended destination of this trip")
    private Destination destination;
    /**
     * gnss
     * <p>
     * Global satellite navigation meta information
     * 
     */
    @JsonProperty("gnss")
    @JsonPropertyDescription("Global satellite navigation meta information")
    private Gnss gnss;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("headingMagnetic")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature headingMagnetic;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("headingTrue")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature headingTrue;
    /**
     * position
     * <p>
     * The position in 3 dimensions
     * 
     */
    @JsonProperty("position")
    @JsonPropertyDescription("The position in 3 dimensions")
    private StartLineStb position;
    /**
     * Attitude
     * <p>
     * Vessel attitude: roll, pitch and yaw
     * 
     */
    @JsonProperty("attitude")
    @JsonPropertyDescription("Vessel attitude: roll, pitch and yaw")
    private Attitude attitude;
    /**
     * Special maneuver such as regional passing arrangement. (from ais)
     * 
     */
    @JsonProperty("maneuver")
    @JsonPropertyDescription("Special maneuver such as regional passing arrangement. (from ais)")
    private Maneuver maneuver = null;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("rateOfTurn")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature rateOfTurn;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("speedOverGround")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature speedOverGround;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("speedThroughWater")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature speedThroughWater;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("speedThroughWaterTransverse")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature speedThroughWaterTransverse;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("speedThroughWaterLongitudinal")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature speedThroughWaterLongitudinal;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("leewayAngle")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature leewayAngle;
    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("log")
    @JsonPropertyDescription("Data should be of type number.")
    private Temperature log;
    /**
     * Trip data
     * 
     */
    @JsonProperty("trip")
    @JsonPropertyDescription("Trip data")
    private Trip trip;
    /**
     * state
     * <p>
     * Current navigational state of the vessel
     * 
     */
    @JsonProperty("state")
    @JsonPropertyDescription("Current navigational state of the vessel")
    private State state;
    /**
     * anchor
     * <p>
     * The anchor data, for anchor watch etc
     * 
     */
    @JsonProperty("anchor")
    @JsonPropertyDescription("The anchor data, for anchor watch etc")
    private Anchor anchor;
    /**
     * Time and Date from the GNSS Positioning System
     * 
     */
    @JsonProperty("datetime")
    @JsonPropertyDescription("Time and Date from the GNSS Positioning System")
    private Datetime datetime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Navigation lights
     * <p>
     * Current state of the vessels navigation lights
     * 
     */
    @JsonProperty("lights")
    public Lights getLights() {
        return lights;
    }

    /**
     * Navigation lights
     * <p>
     * Current state of the vessels navigation lights
     * 
     */
    @JsonProperty("lights")
    public void setLights(Lights lights) {
        this.lights = lights;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("courseOverGroundMagnetic")
    public Temperature getCourseOverGroundMagnetic() {
        return courseOverGroundMagnetic;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("courseOverGroundMagnetic")
    public void setCourseOverGroundMagnetic(Temperature courseOverGroundMagnetic) {
        this.courseOverGroundMagnetic = courseOverGroundMagnetic;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("courseOverGroundTrue")
    public Temperature getCourseOverGroundTrue() {
        return courseOverGroundTrue;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("courseOverGroundTrue")
    public void setCourseOverGroundTrue(Temperature courseOverGroundTrue) {
        this.courseOverGroundTrue = courseOverGroundTrue;
    }

    /**
     * Course
     * <p>
     * The currently active course (can be a route, or just a point one is navigating towards)
     * 
     */
    @JsonProperty("courseRhumbline")
    public CourseRhumbline getCourseRhumbline() {
        return courseRhumbline;
    }

    /**
     * Course
     * <p>
     * The currently active course (can be a route, or just a point one is navigating towards)
     * 
     */
    @JsonProperty("courseRhumbline")
    public void setCourseRhumbline(CourseRhumbline courseRhumbline) {
        this.courseRhumbline = courseRhumbline;
    }

    /**
     * Course
     * <p>
     * The currently active course (can be a route, or just a point one is navigating towards)
     * 
     */
    @JsonProperty("courseGreatCircle")
    public CourseRhumbline getCourseGreatCircle() {
        return courseGreatCircle;
    }

    /**
     * Course
     * <p>
     * The currently active course (can be a route, or just a point one is navigating towards)
     * 
     */
    @JsonProperty("courseGreatCircle")
    public void setCourseGreatCircle(CourseRhumbline courseGreatCircle) {
        this.courseGreatCircle = courseGreatCircle;
    }

    /**
     * Calculated values for other vessels, e.g. from AIS
     * 
     */
    @JsonProperty("closestApproach")
    public ClosestApproach getClosestApproach() {
        return closestApproach;
    }

    /**
     * Calculated values for other vessels, e.g. from AIS
     * 
     */
    @JsonProperty("closestApproach")
    public void setClosestApproach(ClosestApproach closestApproach) {
        this.closestApproach = closestApproach;
    }

    /**
     * Specific navigational data related to yacht racing.
     * 
     */
    @JsonProperty("racing")
    public Racing getRacing() {
        return racing;
    }

    /**
     * Specific navigational data related to yacht racing.
     * 
     */
    @JsonProperty("racing")
    public void setRacing(Racing racing) {
        this.racing = racing;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("magneticVariation")
    public Temperature getMagneticVariation() {
        return magneticVariation;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("magneticVariation")
    public void setMagneticVariation(Temperature magneticVariation) {
        this.magneticVariation = magneticVariation;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("magneticVariationAgeOfService")
    public Temperature getMagneticVariationAgeOfService() {
        return magneticVariationAgeOfService;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("magneticVariationAgeOfService")
    public void setMagneticVariationAgeOfService(Temperature magneticVariationAgeOfService) {
        this.magneticVariationAgeOfService = magneticVariationAgeOfService;
    }

    /**
     * destination
     * <p>
     * The intended destination of this trip
     * 
     */
    @JsonProperty("destination")
    public Destination getDestination() {
        return destination;
    }

    /**
     * destination
     * <p>
     * The intended destination of this trip
     * 
     */
    @JsonProperty("destination")
    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    /**
     * gnss
     * <p>
     * Global satellite navigation meta information
     * 
     */
    @JsonProperty("gnss")
    public Gnss getGnss() {
        return gnss;
    }

    /**
     * gnss
     * <p>
     * Global satellite navigation meta information
     * 
     */
    @JsonProperty("gnss")
    public void setGnss(Gnss gnss) {
        this.gnss = gnss;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("headingMagnetic")
    public Temperature getHeadingMagnetic() {
        return headingMagnetic;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("headingMagnetic")
    public void setHeadingMagnetic(Temperature headingMagnetic) {
        this.headingMagnetic = headingMagnetic;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("headingTrue")
    public Temperature getHeadingTrue() {
        return headingTrue;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("headingTrue")
    public void setHeadingTrue(Temperature headingTrue) {
        this.headingTrue = headingTrue;
    }

    /**
     * position
     * <p>
     * The position in 3 dimensions
     * 
     */
    @JsonProperty("position")
    public StartLineStb getPosition() {
        return position;
    }

    /**
     * position
     * <p>
     * The position in 3 dimensions
     * 
     */
    @JsonProperty("position")
    public void setPosition(StartLineStb position) {
        this.position = position;
    }

    /**
     * Attitude
     * <p>
     * Vessel attitude: roll, pitch and yaw
     * 
     */
    @JsonProperty("attitude")
    public Attitude getAttitude() {
        return attitude;
    }

    /**
     * Attitude
     * <p>
     * Vessel attitude: roll, pitch and yaw
     * 
     */
    @JsonProperty("attitude")
    public void setAttitude(Attitude attitude) {
        this.attitude = attitude;
    }

    /**
     * Special maneuver such as regional passing arrangement. (from ais)
     * 
     */
    @JsonProperty("maneuver")
    public Maneuver getManeuver() {
        return maneuver;
    }

    /**
     * Special maneuver such as regional passing arrangement. (from ais)
     * 
     */
    @JsonProperty("maneuver")
    public void setManeuver(Maneuver maneuver) {
        this.maneuver = maneuver;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("rateOfTurn")
    public Temperature getRateOfTurn() {
        return rateOfTurn;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("rateOfTurn")
    public void setRateOfTurn(Temperature rateOfTurn) {
        this.rateOfTurn = rateOfTurn;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("speedOverGround")
    public Temperature getSpeedOverGround() {
        return speedOverGround;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("speedOverGround")
    public void setSpeedOverGround(Temperature speedOverGround) {
        this.speedOverGround = speedOverGround;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("speedThroughWater")
    public Temperature getSpeedThroughWater() {
        return speedThroughWater;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("speedThroughWater")
    public void setSpeedThroughWater(Temperature speedThroughWater) {
        this.speedThroughWater = speedThroughWater;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("speedThroughWaterTransverse")
    public Temperature getSpeedThroughWaterTransverse() {
        return speedThroughWaterTransverse;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("speedThroughWaterTransverse")
    public void setSpeedThroughWaterTransverse(Temperature speedThroughWaterTransverse) {
        this.speedThroughWaterTransverse = speedThroughWaterTransverse;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("speedThroughWaterLongitudinal")
    public Temperature getSpeedThroughWaterLongitudinal() {
        return speedThroughWaterLongitudinal;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("speedThroughWaterLongitudinal")
    public void setSpeedThroughWaterLongitudinal(Temperature speedThroughWaterLongitudinal) {
        this.speedThroughWaterLongitudinal = speedThroughWaterLongitudinal;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("leewayAngle")
    public Temperature getLeewayAngle() {
        return leewayAngle;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("leewayAngle")
    public void setLeewayAngle(Temperature leewayAngle) {
        this.leewayAngle = leewayAngle;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("log")
    public Temperature getLog() {
        return log;
    }

    /**
     * Data should be of type number.
     * 
     */
    @JsonProperty("log")
    public void setLog(Temperature log) {
        this.log = log;
    }

    /**
     * Trip data
     * 
     */
    @JsonProperty("trip")
    public Trip getTrip() {
        return trip;
    }

    /**
     * Trip data
     * 
     */
    @JsonProperty("trip")
    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    /**
     * state
     * <p>
     * Current navigational state of the vessel
     * 
     */
    @JsonProperty("state")
    public State getState() {
        return state;
    }

    /**
     * state
     * <p>
     * Current navigational state of the vessel
     * 
     */
    @JsonProperty("state")
    public void setState(State state) {
        this.state = state;
    }

    /**
     * anchor
     * <p>
     * The anchor data, for anchor watch etc
     * 
     */
    @JsonProperty("anchor")
    public Anchor getAnchor() {
        return anchor;
    }

    /**
     * anchor
     * <p>
     * The anchor data, for anchor watch etc
     * 
     */
    @JsonProperty("anchor")
    public void setAnchor(Anchor anchor) {
        this.anchor = anchor;
    }

    /**
     * Time and Date from the GNSS Positioning System
     * 
     */
    @JsonProperty("datetime")
    public Datetime getDatetime() {
        return datetime;
    }

    /**
     * Time and Date from the GNSS Positioning System
     * 
     */
    @JsonProperty("datetime")
    public void setDatetime(Datetime datetime) {
        this.datetime = datetime;
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
        return new ToStringBuilder(this).append("lights", lights).append("courseOverGroundMagnetic", courseOverGroundMagnetic).append("courseOverGroundTrue", courseOverGroundTrue).append("courseRhumbline", courseRhumbline).append("courseGreatCircle", courseGreatCircle).append("closestApproach", closestApproach).append("racing", racing).append("magneticVariation", magneticVariation).append("magneticVariationAgeOfService", magneticVariationAgeOfService).append("destination", destination).append("gnss", gnss).append("headingMagnetic", headingMagnetic).append("headingTrue", headingTrue).append("position", position).append("attitude", attitude).append("maneuver", maneuver).append("rateOfTurn", rateOfTurn).append("speedOverGround", speedOverGround).append("speedThroughWater", speedThroughWater).append("speedThroughWaterTransverse", speedThroughWaterTransverse).append("speedThroughWaterLongitudinal", speedThroughWaterLongitudinal).append("leewayAngle", leewayAngle).append("log", log).append("trip", trip).append("state", state).append("anchor", anchor).append("datetime", datetime).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(courseRhumbline).append(racing).append(log).append(destination).append(speedOverGround).append(speedThroughWaterTransverse).append(headingTrue).append(magneticVariation).append(maneuver).append(courseOverGroundTrue).append(datetime).append(trip).append(speedThroughWaterLongitudinal).append(speedThroughWater).append(courseOverGroundMagnetic).append(state).append(lights).append(rateOfTurn).append(closestApproach).append(magneticVariationAgeOfService).append(courseGreatCircle).append(headingMagnetic).append(leewayAngle).append(gnss).append(anchor).append(position).append(additionalProperties).append(attitude).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Navigation) == false) {
            return false;
        }
        Navigation rhs = ((Navigation) other);
        return new EqualsBuilder().append(courseRhumbline, rhs.courseRhumbline).append(racing, rhs.racing).append(log, rhs.log).append(destination, rhs.destination).append(speedOverGround, rhs.speedOverGround).append(speedThroughWaterTransverse, rhs.speedThroughWaterTransverse).append(headingTrue, rhs.headingTrue).append(magneticVariation, rhs.magneticVariation).append(maneuver, rhs.maneuver).append(courseOverGroundTrue, rhs.courseOverGroundTrue).append(datetime, rhs.datetime).append(trip, rhs.trip).append(speedThroughWaterLongitudinal, rhs.speedThroughWaterLongitudinal).append(speedThroughWater, rhs.speedThroughWater).append(courseOverGroundMagnetic, rhs.courseOverGroundMagnetic).append(state, rhs.state).append(lights, rhs.lights).append(rateOfTurn, rhs.rateOfTurn).append(closestApproach, rhs.closestApproach).append(magneticVariationAgeOfService, rhs.magneticVariationAgeOfService).append(courseGreatCircle, rhs.courseGreatCircle).append(headingMagnetic, rhs.headingMagnetic).append(leewayAngle, rhs.leewayAngle).append(gnss, rhs.gnss).append(anchor, rhs.anchor).append(position, rhs.position).append(additionalProperties, rhs.additionalProperties).append(attitude, rhs.attitude).isEquals();
    }

}
