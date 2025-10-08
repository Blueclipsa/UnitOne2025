package Module4Lab1;

import Module2Lab3.Course;

import java.text.NumberFormat;
import java.time.Year;
import java.util.Objects;

/*
    James Quinn
    10/01/2025 - 10/07/2025
    This class will contain the logic and variables necessary to represent a video game in an inventory system.
 */
public class VideoGame
{
    // Constants
    private final double MARK_UP = 0.2;

    // Instance variables
    private String platform;
    private String title;
    private double wholesaleCost;
    private int year;

    // Constructors
    public VideoGame()
    {
        setTitle("No Title Given");
        setPlatform("Unconfirmed Platforms");
        setYear(Year.now().getValue());
        setWholesaleCost(1.0);
    }

    public VideoGame(String platform, String title, double wholesaleCost, int year)
    {
        setTitle(title);
        setPlatform(platform);
        setWholesaleCost(wholesaleCost);
        setYear(year);
    }

    public VideoGame(VideoGame copyGame)
    {
        setTitle(copyGame.getTitle());
        setPlatform(copyGame.getPlatform());
        setWholesaleCost(copyGame.getWholesaleCost());
        setYear(copyGame.getYear());
    }


    // Getters
    public String getTitle()
    {
        return title;
    }

    public String getPlatform()
    {
        return platform;
    }

    public double getWholesaleCost()
    {
        return wholesaleCost;
    }

    public double getRetailPrice()
    {
        return (wholesaleCost * MARK_UP) + wholesaleCost;
    }

    public int getYear()
    {
        return year;
    }

    // Setters
    public void setTitle(String title)
    {
        if (title == null || title.isEmpty())
        {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        else
        {
            this.title = title;
        }
    }

    public void setPlatform(String platform)
    {
        if (platform == null || platform.isEmpty())
        {
            throw new IllegalArgumentException("Platform cannot be null or empty");
        }
        else
        {
            this.platform = platform;
        }
    }

    public void setYear(int inputYear)
    {
        if ( inputYear < 1970 || inputYear > Year.now().getValue())
        {
            throw new IllegalArgumentException("Year must be between 1970 and " + Year.now().getValue());
        }
        else
        {
            this.year = inputYear;
        }
    }

    public void setWholesaleCost(double wholesaleCost)
    {
        if (wholesaleCost < 0)
        {
            throw new IllegalArgumentException("Wholesale cost cannot be negative");
        }
        else
        {
            this.wholesaleCost = wholesaleCost;
        }
    }

    // Overrides
    @Override
    public String toString()
    {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return title +
                "\nReleased: " + year +
                "\nPlatforms: " + platform +
                "\nUnit Wholesale: " + wholesaleCost +
                "\nRetail Price: " + currency.format(getRetailPrice());
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true; // If same object, return true
        if (obj == null || getClass() != obj.getClass()) return false; // If null or different class, return false
        VideoGame game = (VideoGame) obj; // Force object into expected class
        return Objects.equals(platform, game.platform) &&
                Objects.equals(title, game.title) &&
                year == game.year &&
                wholesaleCost == game.wholesaleCost;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(platform, title, year, wholesaleCost);
    }
}
