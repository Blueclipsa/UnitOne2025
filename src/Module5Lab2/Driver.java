package Module5Lab2;

/*
    Gerald Quinn
    10/29/2025
    This class contains the driver logic for the Robot class and Robot subclasses. This demonstrates exception handling
    and principles of polymorphism and inheritance
 */
public class Driver
{
    public static void main(String[] args) throws InvalidRobotConfigurationException
    {
        /*
            First I will create the robot instances. While I do this, I will also
            create broken robots alongside them to test exception handling.
         */
        WeldingRobot workingWeldBot = new WeldingRobot("UNIT01", "WELDBOT 1.0",
                100, 20);
        InspectionRobot workingDefaultInspectBot = new InspectionRobot();
        InspectionRobot workingSetupInspectBot = new InspectionRobot("UNIT04", "INSPECTBOT 1.0",
                5, 5.0);
        PaintingRobot workingPaintingBot = new PaintingRobot("UNIT03", "PAINTBOT 1.0",
                100, "Blue");
        PaintingRobot copiedWorkingPaintBot = new PaintingRobot(workingPaintingBot);

        // Demonstrating exception handling in WeldingRobot
        try
        {
            WeldingRobot brokenWeldBot = new WeldingRobot("UNIT02", null, 5, 10);
        }
        catch (InvalidRobotConfigurationException e)
        {
            System.out.println("Something went wrong creating a new WeldBot!: " + e.getMessage());
        }

        // Demonstrating exception handling in PaintingRobot
        try
        {
            workingPaintingBot.setPaintColor("");
        }
        catch (InvalidRobotConfigurationException e)
        {
            System.out.println("Something went wrong changing PaintBot's color!: " + e.getMessage());
        }

        // Demonstrating exception handling in InspectionRobot
        try
        {
            workingSetupInspectBot.setSensitivityLevel(11.0);
        }
        catch (InvalidRobotConfigurationException e)
        {
            System.out.println("Something went wrong changing InspectBot's sensitivity!: " + e.getMessage());
        }

        // Demonstrating performTask and recharge
        workingSetupInspectBot.performTask(); // This shouldn't work since battery is low
        workingSetupInspectBot.recharge();
        workingSetupInspectBot.performTask(); // Now it will work

        // Showing messages from other bots
        workingWeldBot.performTask();
        workingPaintingBot.performTask();

        // Get current bot charge level
        System.out.println("\nWeld Bot battery level: " + workingWeldBot.getBatteryLevel());
        System.out.println("Painting Bot battery level: " + workingPaintingBot.getBatteryLevel());

        // Recharge bots and display battery level
        System.out.println("Recharging batteries!");
        workingPaintingBot.recharge();
        workingWeldBot.recharge();
        System.out.println("\nNew Weld Bot battery level: " + workingWeldBot.getBatteryLevel());
        System.out.println("New Painting Bot battery level: " + workingPaintingBot.getBatteryLevel());

        // Displaying equals
        System.out.println("Is " + workingSetupInspectBot.getIdNumber() + " the same robot as " +
                workingDefaultInspectBot.getIdNumber() + "?: " +
                workingSetupInspectBot.equals(workingDefaultInspectBot));

        System.out.println("Is " + workingPaintingBot.getIdNumber() + " the same robot as " +
                copiedWorkingPaintBot.getIdNumber() + "?: " +
                workingPaintingBot.equals(copiedWorkingPaintBot));

        // Printing hashCode
        System.out.println("Now for some hashcodes: ");
        System.out.println(workingWeldBot.hashCode());
        System.out.println(workingPaintingBot.hashCode());
        System.out.println(workingSetupInspectBot.hashCode());
    }
}
