package Module7Lab2;

public class SmartThermostat extends Device implements SmartDevice
{
    private double roomTemperature;

    public SmartThermostat()
    {
        super();
        roomTemperature = 65.0;
    }

    public SmartThermostat(String name, double roomTemperature)
    {
        super(name);
        this.roomTemperature = roomTemperature;
    }

    public double getRoomTemperature()
    {
        return roomTemperature;
    }

    public void setRoomTemperature(double roomTemperature)
    {
        if (roomTemperature < 60)
        {
            this.roomTemperature = 60;
        }
        else if (roomTemperature > 80)
        {
            this.roomTemperature = 80;
        }
        else
        {
            this.roomTemperature = roomTemperature;
        }
    }
    @Override
    public void turnOn()
    {
        if (isOn())
        {
            System.out.println("Thermostat is already on");
        }
        else
        {
            setOn(true);
        }
    }

    @Override
    public void turnOff()
    {
        setOn(false);
    }

    @Override
    public void getStatus()
    {
        if (isOn())
        {
            System.out.println("Unit: " + getName());
            System.out.println("Thermostat is on, and set to " + getRoomTemperature());
        }
        else
        {
            System.out.println("The system is currently off.");
        }
    }
}
