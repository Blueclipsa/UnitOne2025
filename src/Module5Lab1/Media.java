package Module5Lab1;

import java.time.Year;

public class Media
{
    /**
     * The name of the piece of media.
     */
    private String title;
    /**
     * The genre of the piece of media.
     */
    private String genre;
    /**
     * The year the piece of media was released.
     */
    private int releaseYear;

    /**
     * Default constructor inherited by all subclasses. Creates a new {@code Media} with default values
     */
    public Media()
    {
        setTitle("No Given Title");
        setGenre("No Given Genre");
        setReleaseYear(Year.now().getValue());
    }

    /**
     * Parameterized constructor used by subclasses. Creates a new {@code Media} with user-defined values
     *
     * @param title The title of the piece of media.
     * @param genre The genre of the piece of media.
     * @param releaseYear The year the media was released
     */
    public Media(String title, String genre, int releaseYear)
    {
        setTitle(title);
        setGenre(genre);
        setReleaseYear(releaseYear);
    }

    /**
     * Creates a new {@code Media} using an existing Media object as a template
     *
     * @param copyMedia An existing Media object to be copied
     */
    public Media(Media copyMedia)
    {
        setTitle(copyMedia.getTitle());
        setGenre(copyMedia.getGenre());
        setReleaseYear(copyMedia.getReleaseYear());
    }

    /**
     * Returns the title of the piece of media
     *
     * @return The title of the media
     */
    public String getTitle()
    {
        return title;
    }
    /**
     * Returns the genre of the piece of media
     *
     * @return The genre of the media
     */
    public String getGenre()
    {
        return genre;
    }
    /**
     * Returns the year of release of the piece of media
     *
     * @return The release year of the media
     */
    public int getReleaseYear()
    {
        return releaseYear;
    }

    /**
     * Sets the name of the piece of media. Title cannot be null or empty
     *
     * @param title The name of the piece of media
     */
    public void setTitle(String title)
    {
        if (title == null || title.isEmpty())
        {
            System.out.println("Title cannot be null or empty, setting safe value.");
            this.title = "No Given Title";
        }
        else
        {
            this.title = title;
        }
    }
    /**
     * Sets the genre of the piece of media. Genre cannot be null or empty
     *
     * @param genre The genre of the piece of media
     */
    public void setGenre(String genre)
    {
        if (genre == null || genre.isEmpty())
        {
            System.out.println("Genre cannot be null or empty, setting safe value.");
            this.genre = "No Given Genre";
        }
        else
        {
            this.genre = genre;
        }
    }
    /**
     * Sets year of release. of the piece of media. Must not be past the current year or less than zero
     *
     * @param releaseYear The year the piece of media was released
     */
    public void setReleaseYear(int releaseYear)
    {
        if (releaseYear <= 0)
        {
            System.out.println("Release year cannot be less than 0, setting safe value.");
            this.releaseYear = Year.now().getValue();
        }
        else if (releaseYear > Year.now().getValue())
        {
            System.out.println("Release year cannot be in the future, setting safe value.");
            this.releaseYear = releaseYear - Year.now().getValue();
        }
        else
        {
            this.releaseYear = releaseYear;
        }
    }

    /**
     * Prints a String to console containing the Media object's values
     *
     * @return A formatted String of Media values
     */
    @Override
    public String toString()
    {
        return "\nTitle: " + title
                + "\nGenre: " + genre
                + "\nReleaseYear: " + releaseYear;
    }
}
