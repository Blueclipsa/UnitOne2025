package Module7Lab2;

/**
 * The {@code SmartDevice} interface defines the required functionality
 * for any smart device in the system.
 */
public interface SmartDevice
{
    /** Turns the device on. */
    void turnOn();

    /** Turns the device off. */
    void turnOff();

    /** Prints the current status of the device to the console. */
    void getStatus();
}
