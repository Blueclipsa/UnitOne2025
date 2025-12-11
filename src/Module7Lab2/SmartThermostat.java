package Module7Lab2;
/*
    James Quinn
    11/30/2025
 */
/**
 * Represents a smart thermostat capable of adjusting
 * room temperature between 60°F and 80°F.
 */
public class SmartThermostat extends Device implements SmartDevice
{
    private double roomTemperature;

    /**
     * Default constructor setting the temperature to 65°F.
     */
    public SmartThermostat()
    {
        super();
        roomTemperature = 65.0;
    }

    /**
     * Constructs a thermostat with a custom name and temperature.
     *
     * @param name device name
     * @param roomTemperature desired initial temperature
     */
    public SmartThermostat(String name, double roomTemperature)
    {
        super(name);
        this.roomTemperature = roomTemperature;
    }

    /**
     * Gets the current thermostat temperature.
     *
     * @return temperature in °F
     */
    public double getRoomTemperature()
    {
        return roomTemperature;
    }

    /**
     * Sets the thermostat temperature.
     * Values below 60 become 60, values above 80 become 80.
     *
     * @param roomTemperature requested temperature
     */
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

    /** {@inheritDoc} */
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

    /** {@inheritDoc} */
    @Override
    public void turnOff()
    {
        setOn(false);
    }

    /** {@inheritDoc} */
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
