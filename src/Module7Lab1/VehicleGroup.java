package Module7Lab1;

import java.util.ArrayList;
import java.util.List;
/*
    James Quinn
    11/25/2025
 */
/**
 * Represents a group of Vehicle objects using the composite pattern.
 * A VehicleGroup behaves as a VehicleComponent, allowing nested or
 * grouped vehicle structures.
 */
public class VehicleGroup implements VehicleComponent
{
    /** List holding all vehicles in this group. */
    List<Vehicle> vehicleList = new ArrayList<Vehicle>();

    /**
     * Displays information for every vehicle in the group by calling
     * each vehicle's displayInfo() method.
     */
    public void displayInfo()
    {
        for (Vehicle vehicle : vehicleList)
        {
            vehicle.displayInfo();
        }
    }

    /**
     * Calculates the total price of all vehicles in the group.
     *
     * @return the sum of the prices of all vehicles
     */
    public double getPrice()
    {
        double totalprice = 0;
        for (Vehicle vehicle : vehicleList)
        {
            totalprice += vehicle.getPrice();
        }
        return totalprice;
    }

    /**
     * Adds a vehicle to the group.
     *
     * @param vehicle the vehicle to be added
     */
    public void addVehicle(Vehicle vehicle)
    {
        vehicleList.add(vehicle);
    }

    /**
     * Removes a vehicle from the group.
     *
     * @param vehicle the vehicle to remove
     */
    public void removeVehicle(Vehicle vehicle)
    {
        vehicleList.remove(vehicle);
    }

}
