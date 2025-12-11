package Module8Lab2;
/*
    James Quinn
    12/10/2025
    Driver to demonstrate state behavior and simplicity of implementation
 */
public class TrafficLightDriver
{
    public static void main(String[] args)
    {
        TrafficLightContext context = new TrafficLightContext();

        for (int i = 0; i < 7; i++)
        {
            context.next();
        }
    }
}
