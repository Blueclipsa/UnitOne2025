package Module4Lab2;
/*
    James Quinn
    10/15/2025
    This Utility class will perform a basic string format, "centering" text between two decorative lines
 */

public class Utility
{
    public void printLine()
    {
        System.out.println("************************************************");
    }

    public void printMessage(String message)
    {
        printLine();
        System.out.println("\t\t" + message);
        printLine();
    }
}
