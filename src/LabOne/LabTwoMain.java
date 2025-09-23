package LabOne;
import java.util.Scanner;
/*
    Gerald Quinn
    9/7/25
    Lab Two | Movie Ticket Booking Assistant: Simulate a basic movie ticket kiosk. User will be able to select from
    three movies, amount of tickets, and possible discounts and program will return proper receipt
 */
public class LabTwoMain
{
    private static double[] moviePrices = new double[3];
    private static String[] movieNames = new String[3];
    public static void main(String[] args)
    {
        moviePrices[0] = 8.99; // Set initial movie prices; these won't change in the program as is
        moviePrices[1] = 10.99;  // But the array set up is more flexible if this were to be updated with "new movies"
        moviePrices[2] = 13.99; // Although it only accepts 3 movies currently, setter method can set each index

        movieNames[0] = "Avengers: Last Rites";
        movieNames[1] = "The Lion King 6";
        movieNames[2] = "Jurassic Universe";

        int selectedMovie;
        int numberOfTickets;
        boolean isStudentOrSenior;
        String userInput;
        Scanner readUserInput = new Scanner(System.in);

        displayMovieMenu();
        System.out.println("Type exit to leave at any time.");
        System.out.println("Select a movie (please use number): ");
        userInput = readUserInput.nextLine();
        selectedMovie = checkInt(userInput, readUserInput);

        System.out.println("How many tickets would you like: ");
        userInput = readUserInput.nextLine();
        numberOfTickets = checkInt(userInput, readUserInput);

        System.out.println("Are you a student or Senior? (Y/N)");
        userInput = readUserInput.nextLine();
        isStudentOrSenior = checkDiscountInput(userInput, readUserInput);

        printReceipt(selectedMovie, numberOfTickets, isStudentOrSenior); // Tabulate the final receipt with all parameters
    }

    public static void displayMovieMenu()
    {
        System.out.println("            NOW PLAYING            ");
        System.out.println("-----------------------------------");
        System.out.println("1:  Avengers: Last Rites    ($8.99)");
        System.out.println("-----------------------------------");
        System.out.println("2:    The Lion King 6      ($10.99)");
        System.out.println("-----------------------------------");
        System.out.println("3:   Jurassic Universe      (13.99)");
    }

    public static double getMoviePrice(int preIndex)
    {
        int index = preIndex - 1;
        return moviePrices[index];
    }

    public static void setMoviePrice(int preIndex, double price)
    {
        int index = preIndex - 1;
        moviePrices[index] = price;
    }

    public static void setMovieName(int preIndex, String movieName)
    {
        int index = preIndex - 1;
        movieNames[index] = movieName;
    }

    /*
        parameters: userCart - the current subtotal of tickets before discount
                    isStudentOrSenior - true/false determination of whether discount is applied or not.
     */
    public static double applyDiscount(double userCart, boolean isStudentOrSenior) // Read if user selected a discount and apply
    {
        if  (isStudentOrSenior == true)
        {
            return userCart * 0.9; // Multiplying by .9 give us 90% of the total (in other words a 10% discount)
        }
        else
        {
            return userCart;
        }
    }

    public static double calculateTotalCost(int selectedMovie, int numberOfTickets, boolean isStudentOrSenior)
    {
        double preDiscountPrice = getMoviePrice(selectedMovie) * numberOfTickets;
        double totalPrice = applyDiscount(preDiscountPrice, isStudentOrSenior);

        return totalPrice;
    }

    public static void printReceipt(int selectedMovie, int numberOfTickets, boolean isStudentOrSenior)
    {
        System.out.println("FINAL RECEIPT");
        System.out.println("-------------");
        System.out.println("Selected Movie: " + movieNames[selectedMovie]);
        System.out.println("Total Tickets: " + numberOfTickets);
        System.out.println("-------------");
        System.out.println("Ticket Price: " + moviePrices[selectedMovie]);
        System.out.println("Applied Discount: " + isStudentOrSenior);
        System.out.printf("FINAL TOTAL: %.2f%n", calculateTotalCost(selectedMovie, numberOfTickets, isStudentOrSenior));
    }

    // Checks integer values to ensure they work with program
    // Can also cleanly exit program if user requests
    public static int checkInt(String userInput, Scanner readUserInput)
    {
        int convertedInput; // Will contain the final int value to pass back
        while (true)
        {
            if (userInput.equalsIgnoreCase("exit"))
                System.exit(0);
            try // Convert user-provided string into integer
                // Will continue to loop until input is valid
            {
                convertedInput = Integer.parseInt(userInput);
                return convertedInput;
            }
            catch (Exception e)
            {
                // Loops until valid user input is given
                System.out.print("\nThe input is not valid. Please try again.\n");
                userInput = readUserInput.nextLine();
            }
        }
    }

    // Checks discount input to make sure yes or no was entered and ask for another input if incorrect value is placed.
    // Also allows clean user exit
    public static boolean checkDiscountInput(String userInput, Scanner readUserInput)
    {
        boolean userInputIsValid = false;

        while (userInputIsValid == false)
        {
            if (userInput.equalsIgnoreCase("Y") ||  userInput.equalsIgnoreCase("YES"))
            {
                userInputIsValid = true;
                return true;
            }
            else if (userInput.equalsIgnoreCase("N") ||  userInput.equalsIgnoreCase("NO"))
            {
                userInputIsValid = true;
                return false;
            }
            else if (userInput.equalsIgnoreCase("exit"))
            {
                System.exit(0);
            }
            else
            {
                System.out.print("\nThe input is not valid. Please try again.\n");
                userInput = readUserInput.nextLine();
            }
        }
        return false;
    }

}
