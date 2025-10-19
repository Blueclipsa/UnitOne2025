package Module5Lab1;

import static org.junit.jupiter.api.Assertions.*;

public class BookTesting
{
    private Book testBook;
    // Class-specific values
    private String author;
    private int pages;
    // Inherited values
    private String title;
    private String genre;
    private int releaseYear;

//    @BeforeEach Does not work at all in JUnit4?
//    public void SetUp()
//    {
//        title = "The Martian";
//        genre = "Science Fiction";
//        releaseYear = 2011;
//        author = "Andy Weir";
//        pages = 384;
//    }
    @org.junit.Test // I get a warning for just doing @Test and I want to cut down on warnings. AFAIK this is the same
    public void testDefaultConstructorValues()
    {
        testBook = new Book();
        assertEquals("No Given Author", testBook.getAuthor());
        assertEquals(0, testBook.getPages());
    }

    @org.junit.Test
    public void testParameterConstructorValuesAndValidation()
    {
        // Sets the relevant information. I tried to use the SetUp method and it did not work.
        // Quite a bit of the JUnit syntax was different
        title = "The Martian";
        genre = "Science Fiction";
        releaseYear = 2011;
        author = "Andy Weir";
        pages = 384;

        testBook = new Book(title, genre, releaseYear, author, pages);
        assertEquals(author, testBook.getAuthor());
        assertEquals(pages, testBook.getPages());

        testBook.setAuthor(null);
        testBook.setPages(-1);
        assertNotNull(testBook.getAuthor());
        assertTrue(testBook.getPages() >= 0);
    }

    @org.junit.Test
    public void testCopyConstructor()
    {
        title = "The Martian";
        genre = "Science Fiction";
        releaseYear = 2011;
        author = "Andy Weir";
        pages = 384;

        testBook = new Book(title, genre, releaseYear, author, pages);
        Book testBookCopy = new Book(testBook);

        assertEquals(testBook.getAuthor(), testBookCopy.getAuthor());
        assertEquals(testBook.getPages(), testBookCopy.getPages());

        testBookCopy.setAuthor("JK Simmons");
        assertNotEquals(testBook.getAuthor(), testBookCopy.getAuthor());
    }
}
