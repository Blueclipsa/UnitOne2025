package Module8Lab2;
/*
    James Quinn
    12/10/2025
    Context handler for traffic light simulation. Keeps current state in context and facilitates state changes
*/
public class TrafficLightContext implements TrafficLightState
{
    private TrafficLightState state;

    public void setState(TrafficLightState state)
    {
        this.state = state;
    }

    public TrafficLightState getState()
    {
        return state;
    }

    public void next()
    {
        if (state == null) // If state is null, start on cycle on red light
        {
            state = new RedLight();
            state.change(this);
        }
        else
        {
            state.change(this);
        }
    }

    @Override
    public void change(TrafficLightContext context)
    {
        state.change(context); // Calls the change method of the currently defined state
    }
}
