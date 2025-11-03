package Module5Lab2;

import java.util.Objects;

/*
    Gerald Quinn
    10/29/2025
    This class will contain the parent variables and base logic for Robot classes which will be extended by later
    classes. Sets bedrock for inheritance and polymorphic behavior
 */
public class Robot
{
    // Instance attributes
    private String idNumber;
    private String modelName;
    private int batteryLevel;

    public Robot() throws InvalidRobotConfigurationException
    {
        setModelName("No Model Provided");
        setBatteryLevel(0);
        setIdNumber("NO ID");
    }

    public Robot(String idNumber, String modelName, int batteryLevel) throws InvalidRobotConfigurationException
    {
        setModelName(modelName);
        setBatteryLevel(batteryLevel);
        setIdNumber(idNumber);
    }

    public Robot(Robot copyBot) throws InvalidRobotConfigurationException
    {
        setModelName(copyBot.modelName);
        setBatteryLevel(copyBot.batteryLevel);
        setIdNumber(copyBot.idNumber);
    }

    /**
     * Gets the ID number of any Robot or Robot derived object.
     *
     * @return A Robot's identification number
     */
    public String getIdNumber()
    {
        return idNumber;
    }

    /**
     * Gets the model name of a Robot or Robot-derived object-
     *
     * @return A Robot's model name
     */
    public String getModelName()
    {
        return modelName;
    }

    /**
     * Gets the battery percentage of a Robot or Robot-derived object expressed as an integer
     *
     * @return A Robot's battery percentage as an int
     */
    public int getBatteryLevel()
    {
        return batteryLevel;
    }

    /**
     * Sets the ID number for a Robot or Robot-derived object to a user-defined value
     *
     * @param idNumber ID number for a Robot or Robot-derived object
     * @throws InvalidRobotConfigurationException if ID is null or empty
     */
    public void setIdNumber(String idNumber) throws InvalidRobotConfigurationException
    {
        if (idNumber == null || idNumber.isEmpty())
        {
            throw new InvalidRobotConfigurationException("ID cannot be null or empty");
        }
        else
        {
            this.idNumber = idNumber;
        }
    }

    /**
     * Sets the model name for a Robot or Robot-derived object to a user-defined value
     *
     * @param modelName ID number for a Robot or Robot-derived object
     * @throws InvalidRobotConfigurationException if ID is null or empty
     */
    public void setModelName(String modelName) throws InvalidRobotConfigurationException
    {
        if (modelName == null || modelName.isEmpty())
        {
            throw new InvalidRobotConfigurationException("Model cannot be null or empty");
        }
        else
        {
            this.modelName = modelName;
        }
    }

    /**
     * Sets the battery percentage of a Robot or Robot-derived object to a user-defined value
     *
     * @param batteryLevel The battery percentage of the Robot displayed as an integer
     * @throws InvalidRobotConfigurationException if battery percentage is below zero or above one hundred
     */
    public void setBatteryLevel(int batteryLevel) throws InvalidRobotConfigurationException
    {
        if (batteryLevel < 0 || batteryLevel > 100)
        {
            throw new InvalidRobotConfigurationException("Battery level must be between 0 and 100");
        }
        else
        {
            this.batteryLevel = batteryLevel;
        }
    }

    /**
     * Makes Robot perform the task of printing a generic message to console
     */
    public void performTask()
    {
        System.out.println("Performing generic action.");
    }

    /**
     * Recharges Robot object to full battery level
     */
    public void recharge()
    {
        /*
            I did this instead of setBatteryLevel(100); because there should be no reason this ever throws an
            exception since it sets a single value to a safe point and takes no input. I thought it was better than
            writing a bunch of exception handling code that would never be used.
         */
        batteryLevel = 100;
    }

    /**
     * Returns a formatted String paragraph with all Robot information.
     *
     * @return Model name, battery level, and ID number, formatted.
     */
    @Override
    public String toString()
    {
        return "\nModel: " + modelName
                + "\nIdentification Number: " + idNumber
                + "\nBattery Level: " + batteryLevel;
    }

    /**
     * Compares all parameters of two Robot objects to determine if they are equivalent.
     *
     * @param obj   the reference object with which to compare.
     * @return True if object is the same in memory or if all parameters are equivalent.
     */
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true; // If same object, return true
        if (obj == null || getClass() != obj.getClass()) return false;
        Robot robot = (Robot) obj;
        return modelName.equals(robot.modelName)
                && batteryLevel == robot.batteryLevel
                && idNumber.equals(robot.idNumber);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(modelName, batteryLevel, idNumber);
    }
}
