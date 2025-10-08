package Module3Lab1;

/*
    James Quinn
    09/23/2025
    This class will contain all relevant variables, constructors, and methods to associate with a Book class and
    demonstrate aggregation
 */
public class Author
{
    private String authorName;
    private String authorNationality;
    private int birthYear;

    public Author(String authorName, String authorNationality, int birthYear)
    {
        this.authorName = authorName;
        this.authorNationality = authorNationality;
        this.birthYear = birthYear;
    }

    public Author(Author copyAuthor)
    {
        authorName = copyAuthor.authorName;
        authorNationality = copyAuthor.authorNationality;
        birthYear = copyAuthor.birthYear;
    }

    // Getters
    public String getAuthorName()
    {
        return authorName;
    }

    public String getAuthorNationality()
    {
        return authorNationality;
    }

    public int getBirthYear()
    {
        return birthYear;
    }

    //Setters
    public void setAuthorName(String authorName)
    {
        this.authorName = authorName;
    }

    public void setAuthorNationality(String authorNationality)
    {
        this.authorNationality = authorNationality;
    }

    public void setBirthYear(int birthYear)
    {
        this.birthYear = birthYear;
    }

    //Overrides

    @Override
    public String toString()
    {
        return "About the Author: \n" +
                authorName + " is a/an " +
                authorNationality +
                " person who was born in " + birthYear;
        // Even in absence of a single book, an about the author format can be good for conveying this info
    }
}
