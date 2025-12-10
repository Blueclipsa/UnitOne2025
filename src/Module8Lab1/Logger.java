package Module8Lab1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/*
    James Quinn
    12/09/2025
    This class demonstrates the Singleton design principle by maintaining only a single instance of a class. This class
    also uses double-checked locking to ensure thread safety.
 */
public class Logger
{
    private static volatile Logger instance;

    private Logger()
    {
        // there are no variables or anything to assign so empty constructor?
    }

    public static Logger getInstance()
    {
        if (instance == null)
        synchronized  (Logger.class)
        {
            if (instance == null)
            {
                instance = new Logger();
            }
        }
        return instance;
    }

    // Logs a message with a timestamp prefix
    public void log(String message)
    {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("[" + timestamp + "] " + message);
    }
}
