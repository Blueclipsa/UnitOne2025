package Module5Lab2;
/*
    Gerald Quinn
    10/29/2025
    This class creates a custom exception for error handling use in the Robot programs, although it can theoretically
    be reused.
 */
public class InvalidRobotConfigurationException extends Exception
{
    public InvalidRobotConfigurationException(String message)
    {
        super(message);
    }
}
