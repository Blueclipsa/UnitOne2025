package Module2Lab1;
/*
    James Quinn
    9/8/25
    This driver program will pass in details for a Book object, then use it's printBook method to
    display those details in console.
 */

import LabOne.LabOneMain;

public class BookDriver
{
    public static void main(String[] args)
    {
        String bookTitle = "The Hunger Games";
        String bookAuthor = "Suzanne Collins";
        int pages = 374;

        Book testBook = new Book(bookTitle, bookAuthor, pages);

        // Will use printBook to show current book info, and will print info after each change to prove the change worked
        testBook.printBook();

        System.out.println("\nBorrowing book");
        testBook.borrowBook().printBook();

        System.out.println("\nReturning book");
        testBook.returnBook().printBook();

        LabOneMain.withdraw(55);
        System.out.println(LabOneMain.getBalance());
    }
}
