package Module2Lab1;
/*
    Gerald Quinn
    9/7/25
    Book Class: This class will create a Book object using one of two constructors, will have methods for getting and
    setting all instance attributes and borrowing status, and printing all of the book's information.
 */

public class Book
{
    // Instance attributes
    private String title;
    private String author;
    private int pages;
    private boolean isBorrowed;


    // Default Constructor
    public Book()
    {
        this.title = "No Title";
        this.author = "No Author";
        this.pages = 0;
        this.isBorrowed = false;
    }

    // Parameterized constructor
    public Book(String title, String author, int pages)
    {
        this.title = title;
        this.author = author;
        this.pages = pages;
        isBorrowed = false;
    }

    // Getters
    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    public int getPages()
    {
        return pages;
    }

    // Setters

    public Book setTitle(String title)
    {
        this.title = title;
        return this;
    }

    public Book setAuthor(String author)
    {
        this.author = author;
        return this;
    }

    public Book setPages(int pages)
    {
        this.pages = pages;
        return this;
    }

    // Change borrow status

    public Book borrowBook()
    {
        isBorrowed = true;
        return this;
    }

    public Book returnBook()
    {
        isBorrowed = false;
        return this;
    }

    // Print all book details
    public void printBook()
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Is borrowed?: " + isBorrowed);
    }
}
