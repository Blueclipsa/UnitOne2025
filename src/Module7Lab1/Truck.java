package Module7Lab1;
/*
    James Quinn
    11/25/2025
 */
/**
 * Represents a Truck, which is a type of Vehicle and implements the
 * VehicleComponent interface. Includes towing capacity and bed length
 * specific to trucks.
 */
public class Truck extends Vehicle implements VehicleComponent
{
    private double towingCapacity;
    private double bedLength;

    /**
     * Constructs a Truck with the specified attributes.
     *
     * @param make the manufacturer of the truck
     * @param model the model name of the truck
     * @param year the manufacturing year
     * @param price the price of the truck
     * @param towingCapacity the maximum towing capacity (must be > 0)
     * @param bedLength the bed length (must be > 0)
     * @throws IllegalVehicleConfigException if towingCapacity or bedLength are invalid
     */
    public Truck(String make, String model, int year, double price,
                 double towingCapacity, double bedLength)
            throws IllegalVehicleConfigException
    {
        super(make, model, year, price);
        setTowingCapacity(towingCapacity);
        setBedLength(bedLength);
    }

    /**
     * Returns the towing capacity of the truck.
     *
     * @return the towing capacity
     */
    public double getTowingCapacity()
    {
        return towingCapacity;
    }

    /**
     * Returns the bed length of the truck.
     *
     * @return the bed length
     */
    public double getBedLength()
    {
        return bedLength;
    }

    /**
     * Sets the towing capacity for the truck.
     *
     * @param towingCapacity the towing capacity (must be > 0)
     * @throws IllegalVehicleConfigException if towingCapacity is less than or equal to zero
     */
    public void setTowingCapacity(double towingCapacity) throws IllegalVehicleConfigException
    {
        if (towingCapacity <= 0)
        {
            throw new IllegalVehicleConfigException("Towing capacity must be greater than zero.");
        }
        else
        {
            this.towingCapacity = towingCapacity;
        }
    }

    /**
     * Sets the bed length for the truck.
     *
     * @param bedLength the bed length (must be > 0)
     * @throws IllegalVehicleConfigException if bedLength is less than or equal to zero
     */
    public void setBedLength(double bedLength) throws IllegalVehicleConfigException
    {
        if (bedLength <= 0)
        {
            throw new IllegalVehicleConfigException("Bed length must be greater than zero.");
        }
        else
        {
            this.bedLength = bedLength;
        }
    }

    /**
     * Displays information about the truck, including base vehicle
     * details and truck-specific fields.
     */
    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Towing capacity: " + getTowingCapacity());
        System.out.println("Bed length: " + getBedLength());
    }
}
