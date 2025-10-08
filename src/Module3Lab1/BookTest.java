package Module3Lab1;

import java.sql.SQLOutput;
import java.time.Year;

/*
    James Quinn
    09/23/2025
    This class will use both the Author and Book classes to demonstrate concepts of aggregation, overridden methods,
    and deep copy behavior from objects
 */
public class BookTest
{
    public static void main(String[] args)
    {
        Author collins = new Author("Suzanne Collins", "American", 1962);
        Author chixin = new Author("Liu Cixin", "Chinese", 1963);
        Book hungerGames = new Book("The Hunger Games","YA Dystopia" , 2008, collins);
        Book threeBodyProblem = new Book("The Three-Body Problem", "Science Fiction", 2006, chixin);

        System.out.println("First, I will demonstrate the Book objects and their respective authors.\n");
        System.out.println(hungerGames.toString());
        System.out.println();
        System.out.println(threeBodyProblem.toString());
        System.out.println();
        System.out.println("I will create a copy of a Book object (visible in code)");

        Book copiedHungerGames = new Book(hungerGames);

        System.out.println("Next, I will show the details of this copied book. During runtime this will be" +
                "identical to the first for the moment");
        System.out.println(copiedHungerGames.toString());

        System.out.println("\nNext, I am going to edit this book in a realistic fashion. Lets change the " +
                "information to reflect the sequel to this book.");

        copiedHungerGames.setBookTitle("Catching Fire");
        copiedHungerGames.setPublicationYear(2009);

        System.out.println("Lets see how that looks: ");
        System.out.println(copiedHungerGames.toString());

        System.out.println("\nBut as we can see the original object is unedited");
        System.out.println(hungerGames.toString());
        System.out.println("\nI can also change the information from the original author without touching the copy");
        hungerGames.getBookAuthor().setAuthorName("Suzanne Collins-Pryor");
        System.out.println(hungerGames.toString());
        System.out.println();
        System.out.println(copiedHungerGames.toString());

    }
}
