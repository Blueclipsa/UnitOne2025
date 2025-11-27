package Module6Lab2;
/*
    James Quinn
    11/15/2022-11/16/2022
 */
/**
 * Represents a drone aircraft, which may be either an FPV (First-Person View) drone
 * or a standard camera drone. A {@code Drone} extends the {@link Aircraft} class and
 * adds behavior specific to FPV and non-FPV flight styles.
 *
 * <p>FPV drones typically perform tricks and agile maneuvers, while camera drones
 * focus on stable, scenic flight operations. This class allows configuring and
 * identifying the drone type.</p>
 */
public class Drone extends Aircraft
{
    /** Indicates whether this drone is an FPV (First-Person View) drone. */
    private boolean isFPVDrone;

    /**
     * Default constructor that creates a drone with default {@link Aircraft} settings
     * and sets the drone type to a non-FPV (camera) drone.
     *
     * @throws IllegalAircraftConfigException if the base {@code Aircraft} constructor
     *         encounters invalid configuration values
     */
    public Drone() throws IllegalAircraftConfigException
    {
        super();
        setFPVDrone(false);
    }

    /**
     * Constructs a drone with a specified callsign, model, flight time, and FPV type.
     *
     * @param callsign     the aircraft's callsign identifier
     * @param model        the drone's model name
     * @param flightTime   maximum flight time in minutes
     * @param isFPVDrone   {@code true} if this drone is an FPV drone;
     *                     {@code false} if it is a camera drone
     *
     * @throws IllegalAircraftConfigException if any arguments are invalid according
     *         to the {@link Aircraft} constructor's validation rules
     */
    public Drone(String callsign, String model, int flightTime, boolean isFPVDrone)
            throws IllegalAircraftConfigException
    {
        super(callsign, model, flightTime);
        setFPVDrone(isFPVDrone);
    }

    /**
     * Copy constructor that creates a new {@code Drone} based on an existing one.
     *
     * @param copyCraft the drone instance to copy
     *
     * @throws IllegalAircraftConfigException if the base aircraft fields in the
     *         provided drone do not meet validation requirements
     */
    public Drone(Drone copyCraft) throws IllegalAircraftConfigException
    {
        super(copyCraft);
        setFPVDrone(copyCraft.isFPVDrone);
    }

    /**
     * Returns whether this drone is configured as an FPV drone.
     *
     * @return {@code true} if this is an FPV drone; {@code false} if it is a camera drone
     */
    public boolean getIsFPVDrone()
    {
        return isFPVDrone;
    }

    /**
     * Sets whether this drone is an FPV drone.
     *
     * @param FPVDrone {@code true} to mark this drone as an FPV drone,
     *                 {@code false} to mark it as a camera drone
     */
    public void setFPVDrone(boolean FPVDrone)
    {
        isFPVDrone = FPVDrone;
    }

    /**
     * Simulates flying the drone. The output displayed depends on whether the drone
     * is configured as an FPV drone or a camera drone.
     *
     * <p>FPV drones perform tricks, while camera drones produce cinematic shots.</p>
     */
    @Override
    public void fly()
    {
        if (isFPVDrone)
        {
            System.out.println("FPV drone was flown and did some tricks");
        }
        else
        {
            System.out.println("Camera drone was flown and got some beautiful shots");
        }
    }

    /**
     * Returns a formatted string containing this drone's details, including its
     * inherited {@link Aircraft} information and whether it is an FPV or camera drone.
     *
     * @return a string representation of this drone
     */
    @Override
    public String toString()
    {
        return super.toString()
                + (getIsFPVDrone()
                ? "\nThis model is an FPV drone."
                : "\nThis model is a camera drone.");
    }
}

