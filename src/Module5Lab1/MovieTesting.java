package Module5Lab1;

import static org.junit.jupiter.api.Assertions.*;

public class MovieTesting
{
    private Movie testMovie;
    // Class-specific values
    private String director;
    private int durationInMinutes;
    // Inherited values
    private String title;
    private String genre;
    private int releaseYear;

    @org.junit.Test // I get a warning for just doing @Test and I want to cut down on warnings. AFAIK this is the same
    public void testDefaultConstructorValues()
    {
        testMovie = new Movie();
        assertEquals("No Given Director", testMovie.getDirector());
        assertEquals(30, testMovie.getDuration());
    }

    @org.junit.Test
    public void testParameterConstructorValuesAndValidation()
    {
        title = "The Martian";
        genre = "Science Fiction";
        releaseYear = 2015;
        director = "Ridley Scott";
        durationInMinutes = 151;

        testMovie = new Movie(title, genre, releaseYear, director, durationInMinutes);
        assertEquals(director, testMovie.getDirector());
        assertEquals(durationInMinutes, testMovie.getDuration());

        testMovie.setDirector(null);
        testMovie.setDuration(0);
        testMovie.setReleaseYear(1754);
        assertNotNull(testMovie.getDirector());
        assertTrue(testMovie.getDuration() >= 30);
        assertTrue(testMovie.getReleaseYear() >= 1888); // 1888 chosen as no film is older than that date
    }

    @org.junit.Test
    public void testCopyConstructor()
    {
        title = "The Martian";
        genre = "Science Fiction";
        releaseYear = 2015;
        director = "Ridley Scott";
        durationInMinutes = 151;

        testMovie = new Movie(title, genre, releaseYear, director, durationInMinutes);
        Movie testMovieCopy = new Movie(testMovie);

        assertEquals(testMovie.getDirector(), testMovieCopy.getDirector());
        assertEquals(testMovie.getDuration(), testMovieCopy.getDuration());

        testMovieCopy.setDirector("James Cameron");
        assertNotEquals(testMovie.getDirector(), testMovieCopy.getDirector());
    }
}
