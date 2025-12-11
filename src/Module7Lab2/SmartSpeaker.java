package Module7Lab2;
/*
    James Quinn
    11/30/2025
 */
/**
 * Represents a smart speaker capable of playing music,
 * adjusting volume, and remembering its last volume level.
 */
public class SmartSpeaker extends Device implements SmartDevice
{
    private String currentSong;
    private int volume;
    private int lastSetVolume;

    /**
     * Default constructor initializing the speaker with no song
     * and volume set to 0.
     */
    public SmartSpeaker()
    {
        super();
        setCurrentSong("");
        setVolume(0);
        lastSetVolume = 0;
    }

    /**
     * Constructs a smart speaker with a custom name,
     * initial song, and volume level.
     *
     * @param name the speaker name
     * @param currentSong the song to begin with
     * @param volume initial volume, capped 0–100
     */
    public SmartSpeaker(String name, String currentSong, int volume)
    {
        super(name);
        setCurrentSong(currentSong);
        setVolume(volume);
        lastSetVolume = 0;
    }

    /**
     * Returns the currently playing song.
     *
     * @return the song name, or "No Song Playing"
     */
    public String getCurrentSong()
    {
        return currentSong;
    }

    /**
     * Gets the current volume level.
     *
     * @return volume between 0 and 100
     */
    public int getVolume()
    {
        return volume;
    }

    /**
     * Sets the song currently playing.
     * If input is invalid, defaults to "No Song Playing".
     *
     * @param currentSong song name
     */
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

    /**
     * Sets the speaker volume.
     * Values ≤ 0 become 0.
     * Values > 100 become 100.
     *
     * @param volume desired volume level
     */
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

    /** {@inheritDoc} */
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

    /** {@inheritDoc} */
    @Override
    public void turnOff()
    {
        lastSetVolume = getVolume();
        setOn(false);
        setCurrentSong("");
    }

    /** {@inheritDoc} */
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
