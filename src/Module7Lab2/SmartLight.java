package Module7Lab2;

public class SmartLight extends Device implements SmartDevice
{
    private int brightness;

    public SmartLight()
    {
        super();
        setBrightness(0);
    }

    // This is the only parameterized constructor as I don't see a need to instantiate a light with it on at
    // a certain brightness. Simple seemed better.
    public SmartLight(String name)
    {
        super(name);
        setBrightness(0);
    }

    public int getBrightness()
    {
        return brightness;
    }

    public void setBrightness(int value)
    {
        if (value <= 0)
        {
            brightness = 0;
            setOn(false);
        }
        else if (value > 100)
        {
            setOn(true);
            brightness = 100;
        }
        else
        {
            setOn(true);
            brightness = value;
        }
    }

    @Override
    public void turnOn()
    {
        if (isOn()) // Check if light is already on
        {
            System.out.println("The light is already on");
        }
        else // If the light is off, check if the light was last turned off above 0 and set to last brightness
        {
            if (brightness == 0)
            {
                setBrightness(100);
            }
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
        System.out.println("The light is currently " + (isOn() ? "on." : "off."));
        if (isOn())
        {
            System.out.println("Current brightness: " + getBrightness());
        }
    }
}
