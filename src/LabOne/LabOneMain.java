package LabOne;
import java.util.Scanner;

public class LabOneMain
{
    private static double accountBalance = 521.25; // Declaring account balance and default value
                                                   // Private for access control.

    // Main block - Display user options and read user input to determine method calls.
    public static void main(String[] args)
    {
        Scanner readUserInput = new Scanner(System.in);
        String userInput;
        double userModifierValue;

        System.out.println("BANKING TERMINAL");
        System.out.println("----------------");
        System.out.println();
        System.out.println("TERMINAL OPTIONS:");
        System.out.println("WITHDRAWAL");
        System.out.println("DEPOSIT");
        System.out.println("CHECK BALANCE");
        System.out.println("EXIT");

        while (true) {                  // This maintains the loop until system exit
                                        // This feels bad but works flawlessly so I didn't change it
            System.out.println();
            System.out.printf("\nUser@Terminal:  "); // Feels closer to how things should in a console
            userInput = readUserInput.nextLine();

            if (userInput.equalsIgnoreCase("WITHDRAWAL")) {
                System.out.printf("\nHow much you want to deposit: ");
                userModifierValue = readUserInput.nextDouble();
                withdraw(userModifierValue);
                System.out.println("Operation complete!");
            }
            else if (userInput.equalsIgnoreCase("DEPOSIT")) {
            System.out.printf("\nHow much would you like to deposit?: ");
            userModifierValue = readUserInput.nextDouble();
            deposit(userModifierValue);
            System.out.println("Operation complete!");
            }
            else if (userInput.equalsIgnoreCase("BALANCE") || userInput.contains("balance")) {
                System.out.println("Your current account balance is: " + getAccountBalance());
            }
            else if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
                System.exit(0);
            }
        }
    }

    // Method for returning the current user balance
    public static double getAccountBalance()
    {
        return accountBalance;
    }

    public static void setAccountBalance(double accountBalance)
    {
        LabOneMain.accountBalance = accountBalance;
    }

    public static void deposit(double userModifierValue)
    {

        double previousAccountBalance = LabOneMain.accountBalance;
        double newAccountBalance = previousAccountBalance + userModifierValue;

        // Set new values
        setAccountBalance(newAccountBalance);
    }

    public static void withdraw(double userModifierValue) // Withdraw user specified amount then set account balance
    {
        double previousAccountBalance = LabOneMain.accountBalance;
        if (userModifierValue < 0) {}
            double newAccountBalance = previousAccountBalance - userModifierValue;

        // Set new values
        setAccountBalance(newAccountBalance);
    }


}
