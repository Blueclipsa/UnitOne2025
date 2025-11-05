package Module5Lab2;
/*
    James Quinn
    10/29/2025
    This class will contain the specific classes and variables required for a Painting Robot. This class inherits
    Robot and extends its functionality
 */
public class PaintingRobot extends Robot
{
    // Instance variables
    private String paintColor;

    /**
     * Default constructor that creates a new {@code PaintingRobot} with default values
     */
    public PaintingRobot() throws InvalidRobotConfigurationException
    {
        super();
        setPaintColor("No Color Selected");
    }

    /**
     * Creates a {@code PaintingRobot} with a specified paint color and otherwise default values
     *
     * @param paintColor The color of the paint used by the PaintBot
     * @throws InvalidRobotConfigurationException if paintColor is null or empty
     */
    public PaintingRobot(String paintColor) throws InvalidRobotConfigurationException
    {
        super();
        setPaintColor(paintColor);
    }

    /**
     * Creates a {@code PaintingRobot} with defined values
     *
     * @param idNumber Painting Robot's ID number
     * @param modelName Specific model name of Painting Robot
     * @param batteryLevel Painting Robot's starting battery level
     * @param paintColor Painting Robot's current paint color
     * @throws InvalidRobotConfigurationException when any user values are out of specified ranges
     */
    public PaintingRobot(String idNumber, String modelName, int batteryLevel, String paintColor)
            throws InvalidRobotConfigurationException
        {
        super(idNumber, modelName, batteryLevel);
        setPaintColor(paintColor);
    }

    /**
     * Copies a welding bot to create an identical welding bot object
     *
     * @param copyBot The welding robot to be copied
     * @throws InvalidRobotConfigurationException If any welding robot parameters are out of range
     */
    public PaintingRobot(PaintingRobot copyBot) throws InvalidRobotConfigurationException
    {
        super(copyBot);
        setPaintColor(copyBot.paintColor);
    }

    /**
     * @return The current paint color the Painting Bot is using
     */
    public String getPaintColor()
    {
        return paintColor;
    }

    /**
     * Sets a new paint color for the painting robot
     *
     * @param paintColor The paint color the robot will be using
     * @throws InvalidRobotConfigurationException if the paint color is null or empty
     */
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

    /**
     * PaintingRobot performs a painting task and paints a wall. This will use 10% battery
     */
    @Override
    public void performTask()
    {
        try
        {
            setBatteryLevel(getBatteryLevel() - 10);
            System.out.println("Painting Robot did some painting! The wall is now " + getPaintColor());
        }
        catch (InvalidRobotConfigurationException e)
        {
            System.out.println("Battery too low! Painting robot did not do the task.");
        }
    }
}
