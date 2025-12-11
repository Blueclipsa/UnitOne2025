package Module7Lab2;

import java.util.ArrayList;
import java.util.Scanner;
/*
    James Quinn
    11/30/2025
 */
/**
 * The {@code Driver} class provides the user interface
 * for interacting with smart devices in a console menu system.
 */
public class Driver
{
    /**
     * Main program loop allowing the user to interact
     * with multiple smart devices via text menus.
     *
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args)
    {
        Scanner readUserInput = new Scanner(System.in);
        int userInput;

        SmartLight smartLight = new SmartLight("Living Room Light");
        SmartSpeaker smartSpeaker = new SmartSpeaker("Fun Tunes Time", "We Are Young", 100);
        SmartThermostat smartThermostat = new SmartThermostat("Home Thermostat", 72.5);

        ArrayList<SmartDevice> devices = new ArrayList<>();

        devices.add(smartLight);
        devices.add(smartSpeaker);
        devices.add(smartThermostat);

        while (true)
        {
            System.out.println("Which device would you like to control?");
            deviceList(devices);
            System.out.print(">: ");
            userInput = readUserInput.nextInt();

            deviceControl(devices, readUserInput, userInput);
        }
    }

    /**
     * Displays a numbered list of all devices by name.
     *
     * @param devices list of smart devices
     */
    public static void deviceList(ArrayList<SmartDevice> devices)
    {
        int counter = 1;
        for (SmartDevice device : devices)
        {
            Device menuDevice = (Device) device;
            System.out.println(counter + ". " + menuDevice.getName());
            counter++;
        }
    }

    /**
     * Toggles power state of a smart device.
     *
     * @param device device to toggle
     */
    public static void powerHandler(SmartDevice device)
    {
        if (((Device) device).isOn())
        {
            device.turnOff();
        }
        else
        {
            device.turnOn();
        }
    }

    /**
     * Displays and processes the control menu for a selected device.
     *
     * @param devices list of all devices
     * @param readUserInput scanner used for reading input
     * @param intUserInput menu selection index
     */
    public static void deviceControl(ArrayList<SmartDevice> devices, Scanner readUserInput, int intUserInput)
    {
        String stringUserInput;
        boolean loop = true;
        Device device = (Device) devices.get(intUserInput - 1);

        if (device instanceof SmartLight)
        {
            System.out.println("1. Change Brightness");
            System.out.println("2. " + (((SmartLight) device).isOn() ? "Turn Off" : "Turn On"));
            System.out.println("3. Get current status");
            System.out.println("4. Return to main menu");

            while (loop)
            {
                System.out.print(">: ");
                intUserInput = readUserInput.nextInt();

                if (intUserInput == 1)
                {
                    System.out.print("Select new brightness: ");
                    intUserInput = readUserInput.nextInt();
                    ((SmartLight) device).setBrightness(intUserInput);
                }
                else if (intUserInput == 2)
                {
                    powerHandler((SmartDevice) device);
                }
                else if (intUserInput == 3)
                {
                    ((SmartLight) device).getStatus();
                }
                else if (intUserInput == 4)
                {
                    loop = false;
                }
                else
                {
                    System.out.println("Invalid input");
                }
            }
        }
        else if (device instanceof SmartSpeaker)
        {
            System.out.println("1. Set new song");
            System.out.println("2. Set new volume");
            System.out.println("3. " + (((SmartSpeaker) device).isOn() ? "Turn Off" : "Turn On"));
            System.out.println("4. Get current status");
            System.out.println("5. Return to main menu");

            while (loop)
            {
                System.out.print(">: ");
                intUserInput = readUserInput.nextInt();

                if (intUserInput == 1)
                {
                    System.out.print("Select new song: ");
                    readUserInput.nextLine(); // Clear leftover newline
                    stringUserInput = readUserInput.nextLine();
                    ((SmartSpeaker) device).setCurrentSong(stringUserInput);
                }
                else if (intUserInput == 2)
                {
                    System.out.println("Select volume: ");
                    intUserInput = readUserInput.nextInt();
                    ((SmartSpeaker) device).setVolume(intUserInput);
                }
                else if (intUserInput == 3)
                {
                    powerHandler((SmartDevice) device);
                }
                else if (intUserInput == 4)
                {
                    ((SmartSpeaker) device).getStatus();
                }
                else if (intUserInput == 5)
                {
                    loop = false;
                }
                else
                {
                    System.out.println("Invalid input");
                }
            }
        }
        else if (device instanceof SmartThermostat)
        {
            double doubleUserInput;

            System.out.println("1. Set new temperature");
            System.out.println("2. " + (((SmartThermostat) device).isOn() ? "Turn Off" : "Turn On"));
            System.out.println("3. Get current status");
            System.out.println("4. Return to main menu");

            while (loop)
            {
                System.out.print(">: ");
                intUserInput = readUserInput.nextInt();

                if (intUserInput == 1)
                {
                    System.out.print("Select new temperature (must be between 60 and 80 degrees): ");
                    doubleUserInput = readUserInput.nextDouble();
                    ((SmartThermostat) device).setRoomTemperature(doubleUserInput);
                }
                else if (intUserInput == 2)
                {
                    powerHandler((SmartDevice) device);
                }
                else if (intUserInput == 3)
                {
                    ((SmartThermostat) device).getStatus();
                }
                else if (intUserInput == 4)
                {
                    loop = false;
                }
                else
                {
                    System.out.println("Invalid input");
                }
            }
        }
    }
}
