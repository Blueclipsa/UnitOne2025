package Module7Lab1;
/*
    James Quinn
    11/25/2025
    Driver class to demonstrate composite design patterns, abstract classes, and interface implementation
 */
import java.text.NumberFormat;

public class CarLotInventory
{
    public static void main(String[] args) throws IllegalVehicleConfigException
    {
        Vehicle firstCar = new Car("Nissan", "Altima", 2025, 20000.00, 4,
                "petroleum", 10.0);

        Vehicle secondCar = new Car("Toyota","Corolla", 1999, 8000.50,4,
                "Petroleum", 13.5);

        Vehicle firstTruck = new Truck("Toyota","Tundra",2019,23500.0,
                10000,7.5);

        Vehicle secondTruck = new Truck("Ford","F-150",1985,6000.50,6000,10);


        VehicleGroup lotInventory = new VehicleGroup();
        lotInventory.addVehicle(firstCar);
        lotInventory.addVehicle(secondCar);
        lotInventory.addVehicle(firstTruck);
        lotInventory.addVehicle(secondTruck);

        lotInventory.displayInfo();
        System.out.println("Total lot value: " + NumberFormat.getCurrencyInstance().format(lotInventory.getPrice()));
    }
}
