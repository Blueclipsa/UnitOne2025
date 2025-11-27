package Module6Lab2;
/*
    James Quinn
    11/15/2022-11/16/2022
 */
/**
 * Represents a jet-powered aircraft with a defined seating capacity.
 * This class extends the {@link Aircraft} class and adds functionality
 * specific to passenger jet planes.
 *
 * <p>A JetPlane tracks the number of passenger seats and provides
 * customized flight behavior output. It also performs validation to ensure
 * seat capacity is always a positive value.</p>
 */
public class JetPlane extends Aircraft
{
    /**
     * The maximum number of passenger seats available on the jet plane.
     */
    private int seatCapacity;

    /**
     * Default constructor that creates a JetPlane with default Aircraft settings
     * and a preset seat capacity of 10.
     *
     * @throws IllegalAircraftConfigException if the default configuration is invalid
     */
    public JetPlane() throws IllegalAircraftConfigException
    {
        super();
        setSeatCapacity(10);
    }

    /**
     * Constructs a JetPlane with the specified parameters.
     *
     * @param callsign     the unique identifying callsign of the aircraft
     * @param model        the aircraft model name
     * @param flightTime   the flight time in minutes
     * @param seatCapacity the number of passenger seats
     * @throws IllegalAircraftConfigException if any configuration value is invalid
     */
    public JetPlane(String callsign, String model, int flightTime, int seatCapacity)
            throws IllegalAircraftConfigException
    {
        super(callsign, model, flightTime);
        setSeatCapacity(seatCapacity);
    }

    /**
     * Copy constructor that creates a new JetPlane using the data from
     * another JetPlane.
     *
     * @param copyCraft the JetPlane object to copy
     * @throws IllegalAircraftConfigException if copied values violate configuration rules
     */
    public JetPlane(JetPlane copyCraft) throws IllegalAircraftConfigException
    {
        super(copyCraft);
        setSeatCapacity(copyCraft.getSeatCapacity());
    }

    /**
     * Returns the seating capacity of the jet plane.
     *
     * @return the number of passenger seats
     */
    public int getSeatCapacity()
    {
        return seatCapacity;
    }

    /**
     * Sets the seating capacity of the jet plane.
     *
     * @param seatCapacity the number of passenger seats; must be greater than zero
     * @throws IllegalAircraftConfigException if seatCapacity is less than or equal to zero
     */
    public void setSeatCapacity(int seatCapacity) throws IllegalAircraftConfigException
    {
        if (seatCapacity <= 0)
        {
            throw new IllegalAircraftConfigException("Seat Capacity must be greater than zero.");
        }
        this.seatCapacity = seatCapacity;
    }

    /**
     * Simulates the aircraft flying. Outputs a message describing the number
     * of passengers carried and the flight duration.
     */
    @Override
    public void fly()
    {
        System.out.println("Jet Plane flew a group of " + getSeatCapacity() + " passengers for "
                + getFlightTime() + " minutes.");
    }

    /**
     * Returns a formatted string containing all JetPlane details,
     * including data inherited from {@link Aircraft}.
     *
     * @return a descriptive string representation of the JetPlane
     */
    @Override
    public String toString()
    {
        return super.toString()
                + "\nSeat Capacity: " + getSeatCapacity();
    }
}