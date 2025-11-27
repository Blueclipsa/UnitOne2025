package Module6Lab2;
/*
    James Quinn
    11/15/2022-11/16/2022
    This driver program will demonstrate principles of polymorphism on the Airplane-derived classes.
 */
import java.util.ArrayList;

public class Driver
{
    public static void main(String[] args) throws IllegalAircraftConfigException
    {
        Drone cameraDrone = new Drone("FA74555", "DJI Mavic Pro 2", 20, false );
        Drone FPVDrone = new Drone("FA12443", "Custom FPV Drone", 30, true);
        JetPlane airlineStandard = new JetPlane("UA452", "Boeing 737-800", 510, 162);
        PropellerPlane trainingPlane = new PropellerPlane("KAP8341", "Cessna 402", 300, 2);
        ArrayList<Aircraft> flyingVehicles = new ArrayList<>();

        flyingVehicles.add(cameraDrone);
        flyingVehicles.add(airlineStandard);
        flyingVehicles.add(trainingPlane);
        flyingVehicles.add(FPVDrone);

        for (Aircraft aircraft : flyingVehicles)
        {
            aircraft.fly();
        }

        for  (Aircraft aircraft : flyingVehicles)
        {
            System.out.println(aircraft.toString());
        }
    }
}
