package Module7Lab1;

import java.text.NumberFormat;
import java.time.Year;
/*
    James Quinn
    11/25/2025
 */
/**
 * Represents a generic vehicle with common attributes such as make,
 * model, production year, and price. This abstract class serves as a base
 * for specific vehicle types and enforces shared validation rules.
 *
 * <p>All mutator methods perform configuration validation and may throw
 * {@link IllegalVehicleConfigException} if invalid data is supplied.</p>
 */
public abstract class Vehicle implements VehicleComponent
{
    /**
     * The manufacturer of the vehicle.
     */
    private String make;

    /**
     * The model name or designation of the vehicle.
     */
    private String model;

    /**
     * The model year of the vehicle. Must not exceed next year’s model year.
     */
    private int year;

    /**
     * The price of the vehicle, represented as a non-negative value.
     */
    private double price;

    /**
     * Default constructor that initializes a Vehicle with preset default values:
     * <ul>
     *     <li>Make: "Default Make"</li>
     *     <li>Model: "Default Model"</li>
     *     <li>Year: next calendar year</li>
     *     <li>Price: 20,000.00</li>
     * </ul>
     */
    public Vehicle()
    {
        make = "Default Make";
        model = "Default Model";
        year = (Year.now().getValue() + 1);
        price = 20000.0;
    }

    /**
     * Constructs a Vehicle using the provided attribute values.
     *
     * @param make  the manufacturer name; must not be null or empty
     * @param model the model name; must not be null or empty
     * @param year  the model year; must be between Year 1 and next model year
     * @param price the price of the vehicle; must not be negative
     * @throws IllegalVehicleConfigException if any provided value is invalid
     */
    public Vehicle(String make, String model, int year, double price)
            throws IllegalVehicleConfigException
    {
        setMake(make);
        setModel(model);
        setYear(year);
        setPrice(price);
    }

    /**
     * Copy constructor that creates a new Vehicle based on another Vehicle object.
     *
     * @param copyVehicle the Vehicle to copy data from
     * @throws IllegalVehicleConfigException if any copied attribute violates validation rules
     */
    public Vehicle(Vehicle copyVehicle) throws IllegalVehicleConfigException
    {
        setMake(copyVehicle.getMake());
        setModel(copyVehicle.getModel());
        setYear(copyVehicle.getYear());
        setPrice(copyVehicle.getPrice());
    }

    // ---------------- Getters ----------------

    /**
     * Returns the manufacturer of the vehicle.
     *
     * @return the make of the vehicle
     */
    public String getMake()
    {
        return make;
    }

    /**
     * Returns the model name of the vehicle.
     *
     * @return the vehicle model
     */
    public String getModel()
    {
        return model;
    }

    /**
     * Returns the model year of the vehicle.
     *
     * @return the vehicle's production year
     */
    public int getYear()
    {
        return year;
    }

    /**
     * Returns the price of the vehicle.
     *
     * @return the vehicle price
     */
    public double getPrice()
    {
        return price;
    }

    // ---------------- Setters ----------------

    /**
     * Sets the manufacturer name for the vehicle.
     *
     * @param make the manufacturer name; must not be null or empty
     * @throws IllegalVehicleConfigException if make is null or empty
     */
    public void setMake(String make) throws IllegalVehicleConfigException
    {
        if (make == null || make.isEmpty())
        {
            throw new IllegalVehicleConfigException("Make cannot be null or empty");
        }
        this.make = make;
    }

    /**
     * Sets the model name for the vehicle.
     *
     * @param model the model name; must not be null or empty
     * @throws IllegalVehicleConfigException if model is null or empty
     */
    public void setModel(String model) throws IllegalVehicleConfigException
    {
        if (model == null || model.isEmpty())
        {
            throw new IllegalVehicleConfigException("Model cannot be null or empty");
        }
        this.model = model;
    }

    /**
     * Sets the model year of the vehicle.
     *
     * @param year the model year; must be greater than 0 and no later than next model year
     * @throws IllegalVehicleConfigException if the year is before year 1 or after next model year
     */
    public void setYear(int year) throws IllegalVehicleConfigException
    {
        if (year <= 0)
        {
            throw new IllegalVehicleConfigException("Year cannot be before Year 0.");
        }
        else if (year > (Year.now().getValue() + 1))
        {
            throw new IllegalVehicleConfigException("Year cannot be past next model year.");
        }
        this.year = year;
    }

    /**
     * Sets the price of the vehicle.
     *
     * @param price the vehicle price; must not be negative
     * @throws IllegalVehicleConfigException if price is negative
     */
    public void setPrice(double price) throws IllegalVehicleConfigException
    {
        if (price < 0)
        {
            throw new IllegalVehicleConfigException("Price cannot be negative");
        }
        this.price = price;
    }

    // ---------------- Methods ----------------

    /**
     * Displays vehicle information including year, make, model, and formatted price.
     * This method fulfills the {@link VehicleComponent} interface requirement.
     */
    @Override
    public void displayInfo()
    {
        System.out.println("Vehicle Information:");
        System.out.println("Year: " + getYear());
        System.out.println("Make: " + getMake());
        System.out.println("Model: " + getModel());
        System.out.println("Price: " + NumberFormat.getCurrencyInstance().format(getPrice()));
    }
}