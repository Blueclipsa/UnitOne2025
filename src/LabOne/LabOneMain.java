package LabOne;
import java.util.Scanner;
/*
    Gerald Quinn
    8/27/25-9/7/25
    Lab One - Bank Account Simulator: Take an initial starting balance and allow a user to manipulate it through withdrawals
    and deposits as well as display the balance and exit cleanly when asked.
 */

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

        while (true)        // This maintains the loop until system exit
                            // This feels bad but works flawlessly so I didn't change it
        {
            terminalOptions();
            System.out.println();
            userInput = readUserInput.nextLine();

            if (userInput.equalsIgnoreCase("WITHDRAW"))
            {
                System.out.printf("\nHow much you want to withdraw: ");
                userModifierValue = readUserInput.nextDouble();
                readUserInput.nextLine();
                withdraw(userModifierValue);
            }
            else if (userInput.equalsIgnoreCase("DEPOSIT"))
            {
                System.out.printf("\nHow much would you like to deposit?: ");
                userModifierValue = readUserInput.nextDouble();
                readUserInput.nextLine();
                deposit(userModifierValue);
                System.out.println("Operation complete!");
            }
            else if (userInput.equalsIgnoreCase("BALANCE") )
            {
                System.out.println("Your current account balance is: " + getBalance());
            }
            else if (userInput.equalsIgnoreCase("exit"))
            {
                System.out.println("Exiting...");
                System.exit(0);
            }
            else
            {
                System.out.println("Invalid input. Try again.");
            }
        }
    }

    // Method for returning the current user balance (getter)
    public static double getBalance()
    {
        return accountBalance;
    }

    public static void setBalance(double accountBalance) // Setter for account balance
    {
        LabOneMain.accountBalance = accountBalance;
    }

    public static void deposit(double userModifierValue) // Handle deposits and ensure positive number usage
    {

        double previousBalance = LabOneMain.accountBalance;

        if  (userModifierValue < 0)
        {
            System.out.println("Cannot deposit negative value. Try again.");
        }
        else
        {
            setBalance(previousBalance + userModifierValue);
        }
    }

    public static void withdraw(double userModifierValue) // Withdraw user specified amount then set account balance.
    {
        double previousBalance = LabOneMain.accountBalance;

        if (previousBalance - userModifierValue < 0)
        {
            System.out.println("Insufficient funds. Please try again.");
        }
        else if (userModifierValue < 0)
        {
            System.out.println("Cannot withdraw negative value. Try again.");
        }
        else
        {
            setBalance(previousBalance - userModifierValue);
            System.out.println("Operation complete!");
        }
    }

    public static void terminalOptions()
    {
        System.out.println("BANKING TERMINAL");
        System.out.println("----------------");
        System.out.println();
        System.out.println("TERMINAL OPTIONS:");
        System.out.println("WITHDRAW");
        System.out.println("DEPOSIT");
        System.out.println("CHECK BALANCE");
        System.out.println("EXIT");
    }

}
