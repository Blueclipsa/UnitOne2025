package Module5Lab2;
/*
    James Quinn
    11/2/2025

 */
public class WeldingRobot extends Robot
{
    // Instance variables
    private int weldStrength;

    public WeldingRobot() throws InvalidRobotConfigurationException
    {
        super();
        setWeldStrength(1);
    }

    public WeldingRobot(int weldStrength) throws InvalidRobotConfigurationException
    {
        super();
        setWeldStrength(weldStrength);
    }

    public WeldingRobot(String idNumber, String modelName, int batteryLevel, int weldStrength)
            throws InvalidRobotConfigurationException
    {
        super(idNumber, modelName, batteryLevel);
        setWeldStrength(weldStrength);
    }

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
