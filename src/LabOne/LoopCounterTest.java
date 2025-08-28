package LabOne;

import java.util.Scanner;
public class LoopCounterTest
{
    private static int loopCounter = 0;

    public static void main(String[] args)
    {
        Scanner readUserInput = new Scanner(System.in);
        String userInput;

        while (true)
        {
            System.out.println("Test the loop counter?");
            userInput = readUserInput.nextLine();

            if (userInput.equalsIgnoreCase("yes"))
            {
                System.out.println("Loop counter: " + loopWithinMethodCounterTest());
            }
            else System.exit(0);
        }
    }

    public static int loopWithinMethodCounterTest()
    {
        loopCounter += 1;
        int loopCounterTest = loopCounter;
        return loopCounterTest;
    }
}
