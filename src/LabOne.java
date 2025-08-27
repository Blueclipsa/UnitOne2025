/*
 James Quinn
 Aug 25 -

*/
import java.sql.SQLOutput;
import java.util.Scanner;
public class LabOne
{
    static Scanner readUserInput = new Scanner(System.in);
    static String  userInput;
    static float   userBalance;
    // Main block - Display user options and read user input to determine method calls.
    public static void main(String[] args)
    {
        System.out.println("BANKING TERMINAL");
        System.out.println("----------------");
        System.out.println();
        System.out.println("TERMINAL OPTIONS:");
        System.out.println("(1): WITHDRAWAL");
        System.out.println("(2): DEPOSIT");
        System.out.println("(3): CHECK BALANCE");
        System.out.println("(4): EXIT");
        System.out.println();

        userInput = readUserInput.nextLine();

        if (userInput.equalsIgnoreCase("1") ||  userInput.equalsIgnoreCase("WITHDRAWAL") ) {
            System.out.println("Withdrawal");
        }
        else System.out.println(getUserBalance());
        {}

    }

    public static float getUserBalance()
    {
        return userBalance;
    }


}
