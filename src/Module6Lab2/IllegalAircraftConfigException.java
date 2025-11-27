package Module6Lab2;
/*
    James Quinn
    11/15/2022-11/16/2022
    This exception will allow for cleaner validation and error handling in a larger program.
 */
public class IllegalAircraftConfigException extends Exception
{
    public IllegalAircraftConfigException(String message)
    {
        super(message);
    }
}
