package Module6Lab2;
/*
    James Quinn
    11/15/2022-11/16/2022
    This Aircraft system could theoretically be used by an FAA database to maintain a list of the many different aircraft
    that every Air Traffic Control center must be aware of. Since all aircraft large or small must register and be tracked
    by the FAA, this is a prime candidate for this kind of system.
 */
/**
 * Represents a generic aircraft with basic identifying information such as
 * callsign, model, and maximum flight time. This abstract class provides
 * validation for all aircraft properties and serves as a base for more
 * specific aircraft types such as drones, jet planes, or propeller planes.
 *
 * <p>All subclasses must implement the {@link #fly()} method to define the
 * aircraft's flight behavior.</p>
 */
public abstract class Aircraft
{
    /** The callsign or identifying name of the aircraft. */
    private String callsign;

    /** The model name or variant of the aircraft. */
    private String model;

    /** The aircraft's maximum flight time in minutes. */
    private int flightTime;

    /**
     * Default constructor that initializes the aircraft with default values:
     * <ul>
     *   <li>Callsign: "Default Aircraft"</li>
     *   <li>Model: "Default Model"</li>
     *   <li>Flight Time: 1 minute</li>
     * </ul>
     *
     * @throws IllegalAircraftConfigException if any default values fail validation
     */
    public Aircraft() throws IllegalAircraftConfigException
    {
        setCallsign("Default Aircraft");
        setModel("Default Model");
        setFlightTime(1);
    }

    /**
     * Constructs an aircraft with a specified callsign, model, and flight time.
     *
     * @param type        the aircraft's callsign or type label
     * @param model       the model name of the aircraft
     * @param flightTime  maximum flight time in minutes
     *
     * @throws IllegalAircraftConfigException if any values are invalid
     */
    public Aircraft(String type, String model, int flightTime) throws IllegalAircraftConfigException
    {
        setCallsign(type);
        setModel(model);
        setFlightTime(flightTime);
    }

    /**
     * Copy constructor that duplicates another {@code Aircraft} object's values.
     *
     * @param copyCraft the aircraft object to copy
     *
     * @throws IllegalAircraftConfigException if copied values fail validation
     */
    public Aircraft(Aircraft copyCraft) throws IllegalAircraftConfigException
    {
        setCallsign(copyCraft.getCallsign());
        setModel(copyCraft.getModel());
        setFlightTime(copyCraft.getFlightTime());
    }

    /**
     * Returns the aircraft's callsign.
     *
     * @return the callsign string
     */
    public String getCallsign()
    {
        return callsign;
    }

    /**
     * Returns the aircraft's model name.
     *
     * @return the model string
     */
    public String getModel()
    {
        return model;
    }

    /**
     * Returns the aircraft's maximum flight time in minutes.
     *
     * @return flight time in minutes
     */
    public int getFlightTime()
    {
        return flightTime;
    }

    /**
     * Sets the aircraft's callsign.
     *
     * @param callsign the new callsign value
     *
     * @throws IllegalAircraftConfigException if the callsign is null or empty
     */
    public void setCallsign(String callsign) throws IllegalAircraftConfigException
    {
        if (callsign == null || callsign.isEmpty())
        {
            throw new IllegalAircraftConfigException("Aircraft type cannot be null or empty");
        }
        else
        {
            this.callsign = callsign;
        }
    }

    /**
     * Sets the aircraft's model name.
     *
     * @param model the new model name
     *
     * @throws IllegalAircraftConfigException if the model is null or empty
     */
    public void setModel(String model) throws IllegalAircraftConfigException
    {
        if (model == null || model.isEmpty())
        {
            throw new IllegalAircraftConfigException("Aircraft model cannot be null or empty");
        }
        else
        {
            this.model = model;
        }
    }

    /**
     * Sets the aircraft's maximum flight time in minutes.
     *
     * @param flightTime the new maximum flight time
     *
     * @throws IllegalAircraftConfigException if flight time is zero or negative
     */
    public void setFlightTime(int flightTime) throws IllegalAircraftConfigException
    {
        if (flightTime <= 0)
        {
            throw new IllegalAircraftConfigException("Flight time must be greater than 0");
        }
        else
        {
            this.flightTime = flightTime;
        }
    }

    /**
     * Abstract method that defines how this aircraft flies.
     * <p>Each subclass must provide its own unique behavior for flight.</p>
     */
    public abstract void fly();

    /**
     * Returns a formatted, multi-line string describing this aircraft's details,
     * including callsign, model, and maximum flight time.
     *
     * @return a string representation of the aircraft
     */
    @Override
    public String toString()
    {
        return "\nAircraft Details: "
                + "\nAircraft Callsign: " + getCallsign()
                + "\nModel: " + getModel()
                + "\nMaximum flight time in minutes: " + getFlightTime();
    }

}
