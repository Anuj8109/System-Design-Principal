package CarParkingQuestion;

import java.util.ArrayList;

import CarParkingQuestion.Parking.ParkingLevel;
import CarParkingQuestion.Parking.ParkingLot;
import CarParkingQuestion.Parking.ParkingManagementSystem;
import CarParkingQuestion.Parking.ParkingSpot;
import CarParkingQuestion.vehicle.Bike;
import CarParkingQuestion.vehicle.Car;

public class Demo {
    
    public static void main(String[] args){
        ParkingSpot ps1 = new ParkingSpot(VehicleType.BIKE, Status.AVAILABLE);
        ParkingSpot ps2 = new ParkingSpot(VehicleType.CAR, Status.AVAILABLE);
        ParkingSpot ps3 = new ParkingSpot(VehicleType.TRUCK,Status.AVAILABLE);
        ParkingSpot ps4 = new ParkingSpot(VehicleType.BIKE, Status.MAINTENANCE);

        ParkingSpot ps5 = new ParkingSpot(VehicleType.CAR, Status.MAINTENANCE);
        ArrayList<ParkingSpot> arraySpots = new ArrayList<>();
        arraySpots.add(ps1);arraySpots.add(ps2);arraySpots.add(ps3);arraySpots.add(ps4);arraySpots.add(ps5);
        ParkingLevel pl1 = new ParkingLevel(1, 5, arraySpots);


        ParkingManagementSystem.getInstance().addNewLevel(pl1);
        arraySpots.add(ps1);
        ParkingLevel pl2 = new ParkingLevel(2, arraySpots.size(), arraySpots);
        ParkingManagementSystem.getInstance().addNewLevel(pl2);

        Car c1 = new Car("1234", "Test1234");
        Bike b1 = new Bike("Bike123", "Anuj");

        ParkingSpot p1 = ParkingManagementSystem.getInstance().parkingCarOnLevels(b1);
        ParkingManagementSystem.getInstance().unParkCarOnLevels(ps3);
    }
}
