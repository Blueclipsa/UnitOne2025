package Module2Lab2;
/*
    James Quinn
    09/20/2025
    This driver program will use the House class to create two objects: one default object and another user-defined
    object
 */
import java.util.Scanner;
public class HouseDriver
{
    public static void main(String[] args)
    {
        int doors;
        int windows;
        int bedrooms;
        int userIntegers;
        int userTestIntStorage;
        double askingPrice;
        double userDoubles;
        double userTestDoubleStorage;
        House defaultHouse = new House();
        Scanner readUserInput = new Scanner(System.in);

        // Using toString
        System.out.println("Default House");
        System.out.println(defaultHouse.toString());

        // Using getters
        System.out.println("\nAnd now the Default House using getters");
        System.out.println("Default house doors:        " + defaultHouse.getNumDoors());
        System.out.println("Default house windows:      " + defaultHouse.getNumWindows());
        System.out.println("Default house bedrooms:     " + defaultHouse.getNumBedrooms());
        System.out.println("Default house asking price: " + defaultHouse.getAskingPrice());

        // Getting user input
        System.out.println("\nNow, lets create our own house.");
        System.out.println("Enter a number of doors for the house: ");

        /*
            I don't like what I'm about to do, but it was the simplest way to do this under the instructions provided.
            I am going to use the negative value check from the default house here.
            It is better than rewriting that method to be a more complicated static method in this driver and
            I prefer to check my values BEFORE I create the object. I am sure there are better ways to do this and I will
            learn them, but I am so done with this at the specific moment I am writing this
         */
        userTestIntStorage = readUserInput.nextInt();
        readUserInput.nextLine();
        doors = defaultHouse.negativeValueCheck(readUserInput, userTestIntStorage);

        System.out.println("Enter a number of windows for the house: ");
        userTestIntStorage = readUserInput.nextInt();
        readUserInput.nextLine();
        windows = defaultHouse.negativeValueCheck(readUserInput, userTestIntStorage);

        System.out.println("Enter a number of bedrooms for the house: ");
        userTestIntStorage = readUserInput.nextInt();
        readUserInput.nextLine();
        bedrooms = defaultHouse.negativeValueCheck(readUserInput, userTestIntStorage);

        System.out.println("Enter a desired price for the house: ");
        userTestDoubleStorage = readUserInput.nextDouble();
        readUserInput.nextLine();
        askingPrice = userTestDoubleStorage;

        // Create user input derived House object
        House userHouse = new House(doors, windows, bedrooms, askingPrice);
        System.out.println("User House");
        System.out.println(userHouse.toString());
        System.out.println("Below market value?: " + userHouse.isBelowMarketValue(userHouse));

        // Adding a bedroom
        System.out.println("Adding a bedroom...");
        userHouse.setNumBedrooms(userHouse.getNumBedrooms() + 1);

        // Get new asking price
        System.out.println("Please update the asking price to account for the new bedroom: ");
        userTestDoubleStorage = readUserInput.nextDouble();
        readUserInput.nextLine();
        userHouse.setAskingPrice(userHouse.negativeValueCheck(readUserInput, userTestDoubleStorage));

        // Display new house details
        System.out.println("Updated House");
        System.out.println(userHouse.toString());
        System.out.println("Below Market Value?: " +userHouse.isBelowMarketValue(userHouse));
    }
}
