package Module8Lab2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/*
    James Quinn
    12/10/2025
    Green light state, turns yellow after five seconds of delay
 */
public class GreenLight implements TrafficLightState
{
    // See RedLight for implementation comments
    @Override
    public void change(TrafficLightContext context)
    {
        System.out.println("The light is green");
        waitTime();
        context.setState(new YellowLight());
    }

    private static void waitTime()
    {
        try
        {
            Thread.sleep(4000); // 4 second delay
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            System.out.println(timestamp);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
