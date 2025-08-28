package LabOne;

/*
    James Quinn
    08/27/2025
    Program will hold three variables and display their values to the user
 */
import java.util.Scanner;
public class ClassWork
{
    public static Scanner readUserInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        int bannerID;
        double GPA;
        String name;

        System.out.println("Please enter the following values: ");
        System.out.print("\nYour name: ");
        name = readUserInput.nextLine();

        System.out.printf("\nYour Banner ID: ");
        bannerID = readUserInput.nextInt();

        System.out.printf("\nYour GPA: ");
        GPA = readUserInput.nextDouble();

        System.out.println("Name: " + name);
        System.out.println("Banner ID: " + bannerID);
        System.out.println("Student GPA: " + GPA);
    }
}

