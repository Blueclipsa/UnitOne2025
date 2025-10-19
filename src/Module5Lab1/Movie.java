package Module5Lab1;

import java.time.Year;

public class Movie extends Media
{
    /**
     * The name of the movie's director
     */
    private String director;
    /**
     * The duration of the movie in minutes
     */
    private int duration;

    /**
     * Constructs a new {@code Movie} with default values
     */
    public Movie()
    {
        super();
        setDirector("No Given Director");
        setDuration(30);
    }

    /**
     * Constructs a new {@code Movie} with specified parameters
     *
     * @param title The title of the film
     * @param genre The genre of the film
     * @param releaseYear The year the film released, which must be the current year or older
     * @param director The director of the film
     * @param duration The duration of the film in minutes, which must be >= 30
     */
    public Movie(String title, String genre, int releaseYear, String director, int duration)
    {
        setTitle(title);
        setGenre(genre);
        setReleaseYear(releaseYear); // I have overridden setReleaseYear in this to have movie-specific properties
        setDirector(director);
        setDuration(duration);
    }

    /**
     * Constructs a copy of an existing Movie object
     *
     * @param copyMovie
     */
    public Movie(Movie copyMovie)
    {
        super(copyMovie.getTitle(), copyMovie.getGenre(), copyMovie.getReleaseYear());
        setDirector(copyMovie.getDirector());
        setDuration(copyMovie.getDuration());
    }

    /**
     * Returns the name of the film's director
     *
     * @return The director's name
     */
    public String getDirector()
    {
        return director;
    }

    /**
     * Returns the duration of the film in minutes
     *
     * @return Film's duration in minutes
     */
    public int getDuration()
    {
        return duration;
    }

    /**
     * Sets the director to a specified name
     *
     * @param director Director's name, must not be null or empty
     */
    public void setDirector(String director)
    {
        if (director == null || director.isEmpty())
        {
            System.out.println("Director cannot be null or empty, setting safe value.");
            this.director = "No Given director";
        }
        else
        {
            this.director = director;
        }
    }

    /**
     * Sets the duration of the film in minutes
     *
     * @param duration Duration of film in minutes, must be >= 30
     */
    public void setDuration(int duration)
    {
        if  (duration < 30)
        {
            System.out.println("Duration cannot be less than 30 minutes, setting safe value.");
            this.duration = 30;
        }
        else
        {
            this.duration = duration;
        }
    }

    /**
     * Sets the release year for the film. Supersedes Media.setReleaseYear().
     * Value must be set between the current year and 1888 for a film.
     *
     * @param releaseYear The year the film was released.
     */
    public void setReleaseYear(int releaseYear)
    {
        if (releaseYear < 1888)
        {
            System.out.println("Release year cannot be before 1888 as no film exists before that year.");
            super.setReleaseYear(Year.now().getValue());
        }
        else if (releaseYear > Year.now().getValue())
        {
            System.out.println("Release year cannot be in the future, setting safe value.");
            super.setReleaseYear(Year.now().getValue());
        }
        else
        {
            super.setReleaseYear(releaseYear);
        }
    }

    /**
     * Prints a String to console including all information about a film
     *
     * @return Returns a formatted String of all film information.
     */
    @Override
    public String toString()
    {
        return  super.toString()
                + "\nDirector: " + getDirector()
                + "\nDuration: " + getDuration();
    }
}
