package Module7Lab2;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver
{
    public static void main(String[] args)
    {
        Scanner readUserInput = new Scanner(System.in);

        SmartLight smartLight = new SmartLight("Living Room Light");
        SmartSpeaker smartSpeaker = new SmartSpeaker("Fun Tunes Time", "We Are Young", 100);
        SmartThermostat smartThermostat = new SmartThermostat("Home Thermostat", 72.5);

        ArrayList<SmartDevice> devices = new ArrayList<SmartDevice>();

        devices.add(smartLight);
        devices.add(smartSpeaker);
        devices.add(smartThermostat);

        while (true)
        {
            System.out.println("Which device would you like to control?");
            System.out.println();
        }

    }
}
