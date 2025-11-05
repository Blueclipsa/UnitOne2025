package Module5Lab2;
/*
    James Quinn
    10/29/2025
    This class will contain the specific classes and variables required for a Welding Robot. This class inherits
    Robot and extends its functionality
 */
public class WeldingRobot extends Robot
{
    /**
     * The welding strength of the robot
     */
    private int weldStrength;

    /**
     * Default constructor that creates a new {@code WeldingRobot} with default values
     */
    public WeldingRobot() throws InvalidRobotConfigurationException
    {
        super();
        setWeldStrength(1);
    }

    /**
     * Creates a {@code WeldingRobot} with a specified welding strength and otherwise default values
     *
     * @param weldStrength The power of the welding torch used by the WeldBot
     * @throws InvalidRobotConfigurationException if weldStrength is not larger than zero
     */
    public WeldingRobot(int weldStrength) throws InvalidRobotConfigurationException
    {
        super();
        setWeldStrength(weldStrength);
    }

    /**
     * Creates a {@code WeldingRobot} with defined values
     *
     * @param idNumber Welding Robot's ID number
     * @param modelName Specific model name of Welding Robot
     * @param batteryLevel Welding Robot's starting battery level
     * @param weldStrength Welding Robot's strength for welding
     * @throws InvalidRobotConfigurationException when any user values are out of specified ranges
     */
    public WeldingRobot(String idNumber, String modelName, int batteryLevel, int weldStrength)
            throws InvalidRobotConfigurationException
    {
        super(idNumber, modelName, batteryLevel);
        setWeldStrength(weldStrength);
    }

    /**
     * Copies a welding bot to create an identical welding bot object
     *
     * @param copyBot The welding robot to be copied
     * @throws InvalidRobotConfigurationException If any welding robot parameters are out of range
     */
    public WeldingRobot(WeldingRobot copyBot) throws InvalidRobotConfigurationException
    {
        super(copyBot);
        setWeldStrength(copyBot.weldStrength);
    }

    /**
     * Retrieves the welding strength of the WeldBot as an integer
     *
     * @return Welding Strength of a Welding Robot
     */
    public int getWeldStrength()
    {
        return weldStrength;
    }

    /**
     * Sets the welding strength of a Welding Robot
     *
     * @param strength Strength of the welds from a Welding Bot
     * @throws InvalidRobotConfigurationException if Strength is less than or equal to zero
     */
    public void setWeldStrength(int strength) throws InvalidRobotConfigurationException
    {
        if (strength <= 0)
        {
            throw new InvalidRobotConfigurationException("Invalid weld strength, must be greater than 0");
        }
    }

    /**
     * Makes Welding Bot complete a welding task. Welding uses 10% of the battery
     */
    @Override
    public void performTask()
    {
        try
        {
            setBatteryLevel(getBatteryLevel() - 10);
            System.out.println("Welding Robot did some welding!");
        }
        catch (InvalidRobotConfigurationException e)
        {
            System.out.println("Battery too low! Welding robot did not do the task.");
        }
    }
}
