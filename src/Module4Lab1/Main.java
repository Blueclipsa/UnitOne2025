package Module4Lab1;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
/*
    James Quinn
    10/07/2025
    This main driver contains the code necessary to demonstrate all functions of the video game class, as well as
    special functions for inventory control purposes.
*/
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<VideoGame> games = new ArrayList<>(); // Let's create an ArrayList

        // Let's add three valid pieces of data to this
        games.add(new VideoGame("Xbox 360", "Halo 3", 40.0,2007));
        games.add(new VideoGame("Wii", "Super Mario Galaxy", 25.0,2007));
        games.add(new VideoGame("PlayStation 3", "The Last of Us", 45.0, 2013));

        // Now let's try and add some bogus data
        try
        {
            games.add(new VideoGame(null,"Half-Life 3", 20, 2025));
        }
        catch (IllegalArgumentException e) // Specified IllegalArgumentException here but I didn't really need to
        {
            System.out.println("An error occurred!: " + e.getMessage());
        }

        // Let's now display all the valid game data
        displayInventory(games);

        // Next, lets display the total inventory value
        calculateTotalValue(games);

        // Finally, lets create a copy of one of the games and compare it.
        VideoGame copyGame = new VideoGame(games.get(2));

        if (copyGame.equals(games.get(2)))
        {
            System.out.println("These games are the same!");
        }
        else
        {
            System.out.println("The games are not the same!");
        }

    }

    public static void displayInventory(ArrayList<VideoGame> list)
    {
        for (VideoGame game : list)
        {
            System.out.println(game);
            System.out.println();
        }
    }

    public static void calculateTotalValue(ArrayList<VideoGame> list)
    {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        // Attempting to use an iterator
        Iterator<VideoGame> iterator = list.iterator();
        double sum = 0;
        while (iterator.hasNext())
        {
            VideoGame operator = iterator.next();
            sum += operator.getRetailPrice();
        }
        System.out.println("Total value of inventory: " + currency.format(sum));
    }
}
