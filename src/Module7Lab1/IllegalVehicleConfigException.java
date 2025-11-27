package Module7Lab1;
/*
    James Quinn
    11/25/2025
    Custom exception class for illegal vehicle arguments to enforce validation
 */
public class IllegalVehicleConfigException extends Exception
{
    public IllegalVehicleConfigException(String message)
    {
        super(message);
    }
}
