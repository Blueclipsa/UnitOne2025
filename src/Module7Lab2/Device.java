package Module7Lab2;

public abstract class Device
{
    private boolean isOn;
    private String name;

    public Device()
    {
        setOn(false);
        setName("No Device Name");
    }

    public Device(String name)
    {
        setOn(false);
        setName(name);
    }

    // Getters
    public boolean isOn()
    {
        return isOn;
    }

    public String getName()
    {
        return name;
    }

    // Setters
    public void setName(String name)
    {
        if (name == null || name.isEmpty())
        {
          throw new IllegalArgumentException("Name cannot be null or empty");
        }
        else
        {
            this.name = name;
        }
    }

    public void setOn(boolean on)
    {
        isOn = on;
    }


}
