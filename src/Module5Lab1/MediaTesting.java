package Module5Lab1;

import java.time.Year;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class MediaTesting
{
    private Media testMedia;
    private String title;
    private String genre;
    private int releaseYear;

    /**
     * Tests the Media class default constructor values
     * Ensures that the default constructor sets the correct values
     */
    @BeforeEach
    public void SetUp()
    {
        title = "Indiana Jones";
        genre = "Adventure";
        releaseYear = 1995;
    }

    @org.junit.Test // I get a warning for just doing @Test, things seem to have changed in JUnit4
    public void testDefaultConstructorValues()
    {
        testMedia = new Media();
        assertTrue(testMedia.getTitle().equals("No Given Title"));
        assertTrue(testMedia.getGenre().equals("No Given Genre"));
        assertTrue(testMedia.getReleaseYear() == Year.now().getValue());
    }

    @org.junit.Test
    public void testParameterConstructorValuesAndValidation()
    {
        title = "Indiana Jones";
        genre = "Adventure";
        releaseYear = 1995;

        testMedia = new Media(title, genre, releaseYear);
        assertEquals(testMedia.getTitle(), title);
        assertEquals(testMedia.getGenre(), genre);
        assertEquals(testMedia.getReleaseYear(), releaseYear);

        testMedia.setTitle(null); // Attempt to set null values
        testMedia.setGenre(null);
        assertNotNull(testMedia.getTitle()); // Assert that these values should not be null
        assertNotNull(testMedia.getGenre());

        testMedia.setReleaseYear(-1); // Assert that the release year must be valid, testing negative
        assertTrue(testMedia.getReleaseYear() > 1888); // 1888 chosen as no film is older than that year
        testMedia.setReleaseYear(3001); // Assert that the release year must be valid, testing over current year
        assertTrue(testMedia.getReleaseYear() <=Year.now().getValue());
    }

    @org.junit.Test
    public void testCopyConstructor()
    {
        testMedia = new Media(title, genre, releaseYear);
        Media copiedMedia = new Media(testMedia);

        assertEquals(testMedia.getTitle(), copiedMedia.getTitle());
        assertEquals(testMedia.getGenre(), copiedMedia.getGenre());
        assertEquals(testMedia.getReleaseYear(), copiedMedia.getReleaseYear());

        copiedMedia.setReleaseYear(testMedia.getReleaseYear() + 1);
        assertNotEquals(testMedia.getReleaseYear(), copiedMedia.getReleaseYear()); // Ensure deep copy behavior

    }


}
