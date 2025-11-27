package Module7Lab1;
/*
    James Quinn
    11/25/2025
 */
/**
 * Represents a component of a vehicle that can provide basic information
 * about itself. This interface is intended to be implemented by vehicle-related
 * classes that expose pricing data and a method for displaying their details.
 *
 * <p>Any implementing class must provide a way to retrieve its price and
 * must define how its information should be displayed.</p>
 */
public interface VehicleComponent
{
    /**
     * Displays relevant information about the vehicle component.
     *
     * <p>This method typically outputs details such as make, model, year,
     * and price, but specific implementations may include additional
     * fields or formatting.</p>
     */
    void displayInfo();

    /**
     * Returns the price associated with this vehicle component.
     *
     * @return the price value as a double
     */
    double getPrice();
}