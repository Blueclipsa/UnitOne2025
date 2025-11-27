package Module7Lab2;

public class SmartSpeaker extends Device implements SmartDevice
{
    private String currentSong;
    private int volume;
    private int lastSetVolume;

    public SmartSpeaker()
    {
        super();
        setCurrentSong("");
        setVolume(0);
        lastSetVolume = 0;
    }

    public SmartSpeaker(String name, String currentSong, int volume)
    {
        super(name);
        setCurrentSong(currentSong);
        setVolume(volume);
        lastSetVolume = 0;
    }

    public String getCurrentSong()
    {
        return currentSong;
    }

    public int getVolume()
    {
        return volume;
    }

    public void setCurrentSong(String currentSong)
    {
        if (currentSong == null || currentSong.isEmpty())
        {
            this.currentSong = "No Song Playing";
        }
        else
        {
            this.currentSong = currentSong;
        }
    }

    public void setVolume(int volume)
    {
        if (volume <= 0)
        {
            this.volume = 0;
        }
        else if (volume > 100)
        {
            this.volume = 100;
        }
        else
        {
            this.volume = volume;
        }
    }

    @Override
    public void turnOn()
    {
        if (isOn())
        {
            System.out.println("The speaker is already on");
        }
        else
        {
            setOn(true);
            if (lastSetVolume > 0)
            {
                setVolume(lastSetVolume);
            }
            else
            {
                setVolume(50);
            }
        }
    }

    @Override
    public void turnOff()
    {
        lastSetVolume = getVolume();
        setOn(false);
        setCurrentSong("");
    }

    @Override
    public void getStatus()
    {
        if (isOn())
        {
            System.out.println("Now Playing: " + getCurrentSong());
            System.out.println("Speaker: " + getName());
            System.out.println("Volume: " + getVolume());
        }
        else
        {
            System.out.println(getName() + " is currently turned off.");
        }
    }
}
