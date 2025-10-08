package Module3Lab1;
/*
    James Quinn
    09/23/2025
    This class will contain all relevant variables, constructors, and methods to associate with an Author class and
    demonstrate aggregation
 */
import java.time.LocalDate;
import java.time.Year;

public class Book
{
    private String bookTitle;
    private String bookGenre;
    private int publicationYear;
    private Author bookAuthor;

    // Constructor
    public Book(String bookTitle, String bookGenre, int publicationYear, Author bookAuthor)
    {
        int currentYear = Year.now().getValue();
        /*
            In this constructor block, I check if I am being given a null value or
            an empty String and instead fill in with "No XXXX given. This uses several if/else statements to make sure
            each parameter is checked individually but separately to avoid double-setting data
         */
        if (bookTitle.isEmpty())
        {
            this.bookTitle = "No Title Given";
        }
        else
        {
            this.bookTitle = bookTitle;
        }
        if (bookGenre.isEmpty() || bookGenre == null)
        {
            this.bookGenre = "No Genre Given";
        }
        else
        {
            this.bookGenre = bookGenre;
        }
        if (publicationYear > currentYear)
        {
            this.publicationYear = currentYear;
            System.out.println("Publication year exceeds current year. Defaulting to current year.");
        }
        else
        {
            this.publicationYear = publicationYear;
        }
        this.bookAuthor = new Author(bookAuthor);

    }

    //  Copy constructor
    public Book(Book copyBook)
    {
        this.bookTitle = copyBook.bookTitle;
        this.bookGenre = copyBook.bookGenre;
        this.publicationYear = copyBook.publicationYear;
        this.bookAuthor = new Author(copyBook.bookAuthor);
    }

    //Getters
    public String getBookTitle()
    {
        return bookTitle;
    }

    public String getBookGenre()
    {
        return bookGenre;
    }

    public int getPublicationYear()
    {
        return publicationYear;
    }

    public Author getBookAuthor()
    {
        return bookAuthor;
    }

    //Setters
    public void setBookTitle(String bookTitle)
    {
        this.bookTitle = bookTitle;
    }

    public void setBookGenre(String bookGenre)
    {
        this.bookGenre = bookGenre;
    }

    public void setPublicationYear(int publicationYear)
    {
        this.publicationYear = publicationYear;
    }

    public void setBookAuthor(Author bookAuthor)
    {
        this.bookAuthor = new Author(bookAuthor); // Sets the books author by using a new object created out of the old
                                                  // object. Prevents shared objects from being overwritten due to
                                                  // reference passing
    }

    //Overrides
    @Override
    public String toString()
    {
        return "Book: " + bookTitle +
                "\nGenre: " + bookGenre +
                "\nPublication year: " + publicationYear +
                "\n" + bookAuthor.toString();
        // Since Author has its own toString I can chain them together instead of rewriting all functionality here
    }
}
