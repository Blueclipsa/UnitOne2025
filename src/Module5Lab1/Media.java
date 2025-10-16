package Module5Lab1;

import java.time.Year;

public class Media
{
    // Instance variables
    private String title;
    private String genre;
    private int releaseYear;

    // Constructors
    public Media()
    {
        setTitle("");
        setGenre("");
        setReleaseYear(Year.now().getValue());
    }

    public Media(String title, String genre, int releaseYear)
    {
        setTitle(title);
        setGenre(genre);
        setReleaseYear(releaseYear);
    }

    public Media(Media copyMedia)
    {
        setTitle(copyMedia.getTitle());
        setGenre(copyMedia.getGenre());
        setReleaseYear(copyMedia.getReleaseYear());
    }

    // Getters
    public String getTitle()
    {
        return title;
    }

    public String getGenre()
    {
        return genre;
    }

    public int getReleaseYear()
    {
        return releaseYear;
    }

    // Setters
    public void setTitle(String title)
    {
        if (title == null || title.isEmpty())
        {
            this.title = "No Given Title";
        }
        else
        {
            this.title = title;
        }
    }

    public void setGenre(String genre)
    {
        if (genre == null || genre.isEmpty())
        {
            this.genre = "No Given Genre";
        }
        else
        {
            this.genre = genre;
        }
    }

    public void setReleaseYear(int releaseYear)
    {
        if (releaseYear <= 0)
        {
            this.releaseYear = Year.now().getValue();
        }
        else if (releaseYear > Year.now().getValue())
        {
            this.releaseYear = releaseYear - Year.now().getValue();
        }
        else
        {
            this.releaseYear = releaseYear;
        }
    }
}
