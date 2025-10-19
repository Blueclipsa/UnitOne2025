package Module5Lab1;

import java.time.Year;
import static org.junit.jupiter.api.Assertions.*;

public class MediaTesting
{
    private Media testMedia;
    private String title;
    private String genre;
    private int releaseYear;

    @org.junit.Test // I get a warning for just doing @Test, things seem to have changed in JUnit4
    public void testDefaultConstructorValues()
    {
        testMedia = new Media();
        assertEquals("No Given Title", testMedia.getTitle());
        assertEquals("No Given Genre", testMedia.getGenre());
        assertEquals(testMedia.getReleaseYear(), Year.now().getValue());
    }

    @org.junit.Test
    public void testParameterConstructorValuesAndValidation()
    {
        title = "Indiana Jones";
        genre = "Adventure";
        releaseYear = 1995;

        testMedia = new Media(title, genre, releaseYear);
        assertEquals(title, testMedia.getTitle());
        assertEquals(genre, testMedia.getGenre());
        assertEquals(releaseYear, testMedia.getReleaseYear());

        testMedia.setTitle(null); // Attempt to set null values
        testMedia.setGenre(null);
        assertNotNull(testMedia.getTitle()); // Assert that these values should not be null
        assertNotNull(testMedia.getGenre());

        testMedia.setReleaseYear(-1); // Assert that the release year must be valid, testing negative
        /*
            Since media has existed for most of human history and since things date back to the BC era, I will set this
            at zero. Technically I think it would be best to override the validation directly in Movie/Book setters
            for more specific numbers. Personally, I think year could be better represented as a String for that purpose
         */
        assertTrue(testMedia.getReleaseYear() > 0);
        testMedia.setReleaseYear(3001); // Assert that the release year must be valid, testing over current year
        assertTrue(testMedia.getReleaseYear() <=Year.now().getValue());
    }

    @org.junit.Test
    public void testCopyConstructor()
    {
        title = "Indiana Jones";
        genre = "Adventure";
        releaseYear = 1995;

        testMedia = new Media(title, genre, releaseYear);
        Media copiedMedia = new Media(testMedia);

        assertEquals(testMedia.getTitle(), copiedMedia.getTitle());
        assertEquals(testMedia.getGenre(), copiedMedia.getGenre());
        assertEquals(testMedia.getReleaseYear(), copiedMedia.getReleaseYear());

        copiedMedia.setReleaseYear(testMedia.getReleaseYear() + 1);
        assertNotEquals(testMedia.getReleaseYear(), copiedMedia.getReleaseYear()); // Ensure deep copy behavior

    }


}
