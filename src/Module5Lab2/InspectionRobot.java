package Module5Lab2;

public class InspectionRobot extends Robot
{
    // Instance variables
    private double sensitivityLevel;


    public InspectionRobot() throws InvalidRobotConfigurationException
    {
        super();
        setSensitivityLevel(1);
    }

    public InspectionRobot(double sensitivityLevel) throws InvalidRobotConfigurationException
    {
        super();
        setSensitivityLevel(sensitivityLevel);
    }

    public InspectionRobot(String idNumber, String modelName, int batteryLevel, double sensitivityLevel)
            throws InvalidRobotConfigurationException
    {
        super(idNumber, modelName, batteryLevel);
        setSensitivityLevel(sensitivityLevel);
    }

    public InspectionRobot(InspectionRobot copyBot) throws InvalidRobotConfigurationException
    {
        super(copyBot);
        setSensitivityLevel(copyBot.sensitivityLevel);
    }

    /**
     * Retrieves the sensitivity level of the InspectBot as a double
     *
     * @return Sensitivity level of an inspection Robot
     */
    public double getSensitivityLevel()
    {
        return sensitivityLevel;
    }

    public void setSensitivityLevel(double sensitivityLevel) throws InvalidRobotConfigurationException
    {
        if (sensitivityLevel < 0.1 || sensitivityLevel > 10.0)
        {
            throw new InvalidRobotConfigurationException("Sensitivity level must be between 0.1 and 10.0");
        }
        else
        {
            this.sensitivityLevel = sensitivityLevel;
        }
    }

    @Override
    public void performTask()
    {
        try
        {
            setBatteryLevel(getBatteryLevel() - 10);
            System.out.println("Inspection Bot did some inspecting!");
        }
        catch (InvalidRobotConfigurationException e)
        {
            System.out.println("Battery too low! Inspection robot did not do the task.");
        }
    }
}
