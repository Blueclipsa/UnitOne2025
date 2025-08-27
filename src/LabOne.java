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

    // Main block - Display user options and read user input to determine method calls.
    public static void main(String[] args)
    {
        System.out.println("BANKING TERMINAL");
        System.out.println("----------------");
        System.out.println();
        System.out.println("TERMINAL OPTIONS:");
        System.out.println("WITHDRAWAL");
        System.out.println("DEPOSIT");
        System.out.println("CHECK BALANCE");
        System.out.println("EXIT");
        System.out.println();

        userInput = readUserInput.nextLine();

        switch (userInput)
            {
            case "WITHDRAWAL":
            }
    }

    
}
