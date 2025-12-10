package Module7Lab2;

/**
 * Represents a smart light that can be turned on, turned off,
 * and adjusted in brightness between 0 and 100.
 */
public class SmartLight extends Device implements SmartDevice
{
    private int brightness;

    /**
     * Default constructor that initializes the light with name "No Device Name"
     * and brightness 0 (off).
     */
    public SmartLight()
    {
        super();
        setBrightness(0);
    }

    /**
     * Constructs a smart light with a custom name and initial brightness of 0.
     *
     * @param name the name of the light
     */
    public SmartLight(String name)
    {
        super(name);
        setBrightness(0);
    }

    /**
     * Returns the current brightness level.
     *
     * @return brightness between 0 and 100
     */
    public int getBrightness()
    {
        return brightness;
    }

    /**
     * Sets the brightness level for the light.
     * Values ≤ 0 turn the light off.
     * Values > 100 are capped at 100.
     *
     * @param value the desired brightness
     */
    public void setBrightness(int value)
    {
        if (value <= 0)
        {
            brightness = 0;
            setOn(false);
        }
        else if (value > 100)
        {
            brightness = 100;
            setOn(true);
        }
        else
        {
            brightness = value;
            setOn(true);
        }
    }

    /** {@inheritDoc} */
    @Override
    public void turnOn()
    {
        if (isOn())
        {
            System.out.println("The light is already on");
        }
        else
        {
            if (brightness == 0)
            {
                setBrightness(100);
            }
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
        System.out.println("The light is currently " + (isOn() ? "on." : "off."));
        if (isOn())
        {
            System.out.println("Current brightness: " + getBrightness());
        }
    }
}
