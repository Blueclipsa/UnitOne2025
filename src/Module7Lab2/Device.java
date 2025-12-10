package Module7Lab2;

/**
 * The {@code Device} class is an abstract base class representing a generic smart device.
 * It stores shared attributes such as the device name and power state.
 * All specific smart devices (light, speaker, thermostat) inherit from this class.
 */
public abstract class Device
{
    private boolean isOn;
    private String name;

    /**
     * Default constructor that initializes the device to "off"
     * and gives it a placeholder name.
     */
    public Device()
    {
        setOn(false);
        setName("No Device Name");
    }

    /**
     * Constructs a device with a custom name.
     *
     * @param name the name of the device
     * @throws IllegalArgumentException if the name is null or empty
     */
    public Device(String name)
    {
        setOn(false);
        setName(name);
    }

    /**
     * Returns whether the device is currently powered on.
     *
     * @return true if on, false if off
     */
    public boolean isOn()
    {
        return isOn;
    }

    /**
     * Retrieves the device's name.
     *
     * @return the device name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets the device's name.
     *
     * @param name the new name
     * @throws IllegalArgumentException if the name is null or empty
     */
    public void setName(String name)
    {
        if (name == null || name.isEmpty())
        {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    /**
     * Sets the device's power state.
     *
     * @param on true to turn on, false to turn off
     */
    public void setOn(boolean on)
    {
        isOn = on;
    }
}
