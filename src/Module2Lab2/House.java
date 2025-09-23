package Module2Lab2;

/*
    James Quinn
    09/20/2025
    This class contains the variables and logic necessary to create a house and verify input
 */
import java.util.Scanner;
public class House
{
    // Instance variables
    private int numDoors;
    private int numWindows;
    private int numBedrooms;
    private double askingPrice;


    // Constructors
    public House()
    {
        numDoors = 0;
        numWindows = 0;
        numBedrooms = 0;
        askingPrice = 0.0;
    }

    public House(int doors, int windows, int bedrooms, double askingPrice)
    {
        numDoors = doors;
        numWindows = windows;
        numBedrooms = bedrooms;
        this.askingPrice = askingPrice;
    }


    // Getters
    public int getNumDoors()
    {
        return numDoors;
    }

    public int getNumWindows()
    {
        return numWindows;
    }

    public int getNumBedrooms()
    {
        return numBedrooms;
    }

    public double getAskingPrice()
    {
        return askingPrice;
    }

    // Setters

    public void setNumDoors(int numDoors)
    {
        this.numDoors = numDoors;
    }

    public void setNumWindows(int numWindows)
    {
        this.numWindows = numWindows;
    }

    public void setNumBedrooms(int numBedrooms)
    {
        this.numBedrooms = numBedrooms;
    }

    public void setAskingPrice(double askingPrice)
    {
        this.askingPrice = askingPrice;
    }


    // Methods

    public double calculateMarketValue(int windows, int bedrooms)
    {
        return (300000 + (55000 * bedrooms) + (3000 * windows) );
    }

    public boolean isBelowMarketValue(House evaluate)
    {
        /*
            Here I am using the house object's other methods to achieve this goal instead of
            rewriting all of this functionality
         */
        if (evaluate.getAskingPrice() < evaluate.calculateMarketValue(evaluate.getNumWindows(), evaluate.getNumBedrooms()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // This method is used to check inputs for the setters. It is overloaded to be called with both ints and doubles
    public int negativeValueCheck(Scanner userInput, int userInt)
    {
        while (true)
        {
            if (userInt > 0)
            {
                return userInt;
            }
            else
            {
                System.out.println("Please enter a positive number");
                userInt = userInput.nextInt();
                userInput.nextLine();
            }
        }
    }

    public double negativeValueCheck(Scanner userInput, double userDouble)
    {
        while (true)
        {
            if (userDouble > 0)
            {
                return userDouble;
            }
            else
            {
                System.out.println("Please enter a positive number");
                userDouble = userInput.nextInt();
                userInput.nextLine();
            }
        }
    }

    @Override
    public String toString()
    {
        return "\nDoors:        " + numDoors +
               "\nWindows:      " + numWindows +
               "\nBedrooms:     " + numBedrooms +
               "\nAsking Price: " + askingPrice +
               "\nMarket Value: " + calculateMarketValue(numWindows, numBedrooms);
    }
}
