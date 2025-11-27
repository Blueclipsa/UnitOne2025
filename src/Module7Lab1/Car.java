package Module7Lab1;
/*
    James Quinn
    11/25/2025
 */

/**
 * Represents a car with specific attributes such as the number of doors,
 * fuel type, and trunk storage capacity. This class extends the
 * {@link Vehicle} class and inherits its common vehicle properties.
 *
 * <p>The Car class enforces validation rules to ensure all provided
 * configuration values (such as door count and trunk space) are valid.</p>
 */
public class Car extends Vehicle implements VehicleComponent
{
    /**
     * The number of doors on the car. Must be 2 or more.
     */
    private int numDoors;

    /**
     * The type of fuel the car uses (e.g., "Gasoline", "Electric", "Hybrid").
     */
    private String fuelType;

    /**
     * The amount of trunk storage space available, measured in cubic feet.
     */
    private double trunkSpace;

    /**
     * Constructs a fully-configured Car object using the provided values.
     *
     * @param make        the vehicle manufacturer; must not be null or empty
     * @param model       the vehicle model; must not be null or empty
     * @param year        the model year; must be within allowable range
     * @param price       the price of the car; must not be negative
     * @param numDoors    the number of doors; must be 2 or greater
     * @param fuelType    the type of fuel used; must not be null or empty
     * @param trunkSpace  the trunk space in cubic feet; must be greater than 0
     * @throws IllegalVehicleConfigException if any argument violates validation rules
     */
    public Car(String make, String model, int year, double price,
               int numDoors, String fuelType, double trunkSpace)
            throws IllegalVehicleConfigException
    {
        super(make, model, year, price);
        setNumDoors(numDoors);
        setFuelType(fuelType);
        setTrunkSpace(trunkSpace);
    }

    // ---------------- Getters ----------------

    /**
     * Returns the number of doors on the car.
     *
     * @return the door count
     */
    public int getNumDoors()
    {
        return numDoors;
    }

    /**
     * Returns the fuel type used by the car.
     *
     * @return the fuel type string
     */
    public String getFuelType()
    {
        return fuelType;
    }

    /**
     * Returns the trunk space capacity of the car.
     *
     * @return the trunk space in cubic feet
     */
    public double getTrunkSpace()
    {
        return trunkSpace;
    }

    // ---------------- Setters ----------------

    /**
     * Sets the number of doors for the car.
     *
     * @param numDoors the door count; must be at least 2
     * @throws IllegalVehicleConfigException if numDoors is less than 2
     */
    public void setNumDoors(int numDoors) throws IllegalVehicleConfigException
    {
        if (numDoors < 2)
        {
            throw new IllegalVehicleConfigException("A car cannot have less than 2 doors.");
        }
        this.numDoors = numDoors;
    }

    /**
     * Sets the fuel type for the car.
     *
     * @param fuelType a descriptive fuel type (e.g., "Gasoline", "Diesel"); must not be null or empty
     * @throws IllegalVehicleConfigException if fuelType is null or empty
     */
    public void setFuelType(String fuelType) throws IllegalVehicleConfigException
    {
        if (fuelType == null || fuelType.isEmpty())
        {
            throw new IllegalVehicleConfigException("Fuel type cannot be null or empty");
        }
        this.fuelType = fuelType;
    }

    /**
     * Sets the trunk storage space for the car.
     *
     * @param trunkSpace the trunk capacity in cubic feet; must be greater than 0
     * @throws IllegalVehicleConfigException if trunkSpace is less than or equal to 0
     */
    public void setTrunkSpace(double trunkSpace) throws IllegalVehicleConfigException
    {
        if (trunkSpace <= 0)
        {
            throw new IllegalVehicleConfigException("Trunk space must be a positive number");
        }
        this.trunkSpace = trunkSpace;
    }

    // ---------------- Methods ----------------

    /**
     * Displays information about the car, including inherited vehicle details
     * and specific fields such as door count, fuel type, and trunk space.
     */
    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Number of Doors: " + getNumDoors());
        System.out.println("Fuel Type: " + getFuelType());
        System.out.println("Trunk Space: " + getTrunkSpace());
    }
}