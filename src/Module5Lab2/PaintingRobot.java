package Module5Lab2;

public class PaintingRobot extends Robot
{
    // Instance variables
    private String paintColor;

    public PaintingRobot() throws InvalidRobotConfigurationException
    {
        super();
        setPaintColor("No Color Selected");
    }

    public PaintingRobot(String paintColor) throws InvalidRobotConfigurationException
    {
        super();
        setPaintColor(paintColor);
    }

    public PaintingRobot(String idNumber, String modelName, int batteryLevel, String paintColor)
            throws InvalidRobotConfigurationException
        {
        super(idNumber, modelName, batteryLevel);
        setPaintColor(paintColor);
    }

    public PaintingRobot(PaintingRobot copyBot) throws InvalidRobotConfigurationException
    {
        super(copyBot);
        setPaintColor(copyBot.paintColor);
    }

    public String getPaintColor()
    {
        return paintColor;
    }

    public void setPaintColor(String paintColor) throws InvalidRobotConfigurationException
    {
        if (paintColor == null || paintColor.isEmpty())
        {
            throw new InvalidRobotConfigurationException("Paint color cannot be null or empty");
        }
        else
        {
            this.paintColor = paintColor;
        }
    }

    @Override
    public void performTask()
    {
        try
        {
            setBatteryLevel(getBatteryLevel() - 10);
            System.out.println("Painting Robot did some painting!");
        }
        catch (InvalidRobotConfigurationException e)
        {
            System.out.println("Battery too low! Painting robot did not do the task.");
        }
    }
}
