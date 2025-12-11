package Module8Lab2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/*
    James Quinn
    12/10/2025
    Yellow light state, turns red after two seconds of delay.
 */
public class YellowLight implements TrafficLightState
{
    // See RedLight for implementation comments
    @Override
    public void change(TrafficLightContext context)
    {
        System.out.println("The light is yellow");
        waitTime();
        context.setState(new RedLight());
    }

    private static void waitTime()
    {
        try
        {
            Thread.sleep(2000); // 2 second delay
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            System.out.println(timestamp);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
