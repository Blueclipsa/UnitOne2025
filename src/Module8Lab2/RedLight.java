package Module8Lab2;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/*
    James Quinn
    12/10/2025
    Red light state, turns green after five seconds of delay
 */
public class RedLight implements TrafficLightState
{
    @Override
    public void change(TrafficLightContext context) //
    {
        System.out.println("The light is red");
        waitTime();
        context.setState(new GreenLight());
    }

    private static void waitTime()
    {
        try
        {
            Thread.sleep(5000); // 5 second delay
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            System.out.println(timestamp); // Prints timestamp for screenshot purposes
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
