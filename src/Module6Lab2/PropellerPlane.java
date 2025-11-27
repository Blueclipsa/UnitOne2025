package Module6Lab2;
/*
    James Quinn
    11/15/2022-11/16/2022
 */
/**
 * Represents an aircraft that uses propellers for thrust. A {@code PropellerPlane}
 * extends the {@link Aircraft} class by adding the number of propellers the plane
 * is equipped with.
 *
 * <p>Propeller planes may have one or more propellers, and this class ensures that
 * only valid propeller counts are accepted. Subclasses or systems can use this class
 * to model small aircraft, cargo propeller planes, or training aircraft.</p>
 */
public class PropellerPlane extends Aircraft
{
    /** The number of propellers this plane has. Must be at least 1. */
    private int propellerCount;

    /**
     * Default constructor that initializes the propeller plane with default
     * {@link Aircraft} values and assigns it two propellers.
     *
     * @throws IllegalAircraftConfigException if inherited values fail validation
     */
    public PropellerPlane() throws IllegalAircraftConfigException
    {
        super();
        setPropellerCount(2);
    }

    /**
     * Constructs a propeller plane with the specified characteristics.
     *
     * @param callsign        the identifying callsign of the aircraft
     * @param model           the model name of the propeller plane
     * @param flightTime      the maximum flight time in minutes
     * @param propellerCount  the number of propellers on the aircraft;
     *                        must be at least 1
     *
     * @throws IllegalAircraftConfigException if any parameter is invalid
     */
    public PropellerPlane(String callsign, String model, int flightTime, int propellerCount)
            throws IllegalAircraftConfigException
    {
        super(callsign, model, flightTime);
        setPropellerCount(propellerCount);
    }

    /**
     * Copy constructor that creates a new {@code PropellerPlane} instance
     * by duplicating another propeller plane's properties.
     *
     * @param copyProp the propeller plane to copy
     *
     * @throws IllegalAircraftConfigException if copied values are invalid
     */
    public PropellerPlane(PropellerPlane copyProp) throws IllegalAircraftConfigException
    {
        super(copyProp);
        setPropellerCount(copyProp.getPropellerCount());
    }

    /**
     * Returns the number of propellers on this aircraft.
     *
     * @return the current propeller count
     */
    public int getPropellerCount()
    {
        return propellerCount;
    }

    /**
     * Sets the number of propellers on this aircraft.
     *
     * @param propellerCount the number of propellers; must be at least 1
     *
     * @throws IllegalAircraftConfigException if {@code propellerCount} is less than 1
     */
    public void setPropellerCount(int propellerCount) throws IllegalAircraftConfigException
    {
        if (propellerCount < 1)
        {
            throw new IllegalAircraftConfigException("Propeller count must be at least 1.");
        }
        else
        {
            this.propellerCount = propellerCount;
        }
    }

    /**
     * Simulates flying the propeller plane. This implementation prints a simple
     * message describing the flight.
     */
    @Override
    public void fly()
    {
        System.out.println("Propeller Plane did a flight");
    }

    /**
     * Returns a formatted string describing this propeller plane, including
     * the inherited aircraft details and the propeller count.
     *
     * @return a string representation of the propeller plane
     */
    @Override
    public String toString()
    {
        return super.toString()
                + "\nPropeller Count: " + propellerCount;
    }
}