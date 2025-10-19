package Module5Lab1;

public class Book extends Media
{
    /**
     * The name of the book's author
     */
    private String author;
    /**
     * The number of pages in the book
     */
    private int pages;

    /**
     * Constructs a new {@code Book} with default values
     */
    public Book()
    {
        super();
        setAuthor("No Given Author");
        setPages(0);
    }

    /**
     * Creates a {@code Book} with parameters determined by method call
     *
     * @param title The title of the Book
     * @param genre The genre of the Book
     * @param releaseYear The year the Book was released, which must be the current year or earlier
     * @param author The author of the Book
     * @param pages The number of pages in the Book, which cannot be negative
     */
    public Book(String title, String genre, int releaseYear, String author, int pages)
    {
        super(title, genre, releaseYear);
        setAuthor(author);
        setPages(pages);
    }

    /**
     * Creates a new {@code Book} using an existing Book object as a template
     *
     * @param copyBook An existing Book object to be copied
     */
    public Book(Book copyBook)
    {
        super(copyBook.getTitle(), copyBook.getGenre(), copyBook.getReleaseYear());
        setAuthor(copyBook.getAuthor());
        setPages(copyBook.getPages());
    }

    /**
     * Returns the author of the Book
     *
     * @return The author of the Book
     */
    public String getAuthor()
    {
        return author;
    }

    /**
     * Returns the number of pages in the book
     *
     * @return The number of pages in the book
     */
    public int getPages()
    {
        return pages;
    }

    /**
     * Sets the author for a Book object
     *
     * @param author The author's name
     */
    public void setAuthor(String author)
    {
        if (author == null || author.isEmpty())
        {
            System.out.println("Author cannot be null or empty, setting safe value.");
            this.author = "No Given Author";
        }
        else
        {
            this.author = author;
        }
    }

    /**
     * Sets the number of pages in a Book object
     *
     * @param pages Number of pages in the Book
     */
    public void setPages(int pages)
    {
        if  (pages < 0)
        {
            System.out.println("Pages cannot be negative, setting safe value.");
            this.pages = 0;
        }
        else
        {
            this.pages = pages;
        }
    }

    /**
     * Prints a String to console including all information about a Book
     *
     * @return Returns a formatted String of all Book information.
     */
    @Override
    public String toString()
    {
        return super.toString()
                + "\nAuthor: " + getAuthor()
                + "\nPages: " + getPages();
    }
}
