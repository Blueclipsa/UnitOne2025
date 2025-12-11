package Module8Lab2;
/*
    James Quinn
    12/10/2025
    Interface to define behavior for traffic light states and allow polymorphic behavior
 */
public interface TrafficLightState
{
    void change(TrafficLightContext context);
}
