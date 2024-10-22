package CarParkingQuestion.Parking;

import java.util.ArrayList;

import CarParkingQuestion.vehicle.Vehicle;

public class ParkingManagementSystem {
    private static ParkingLot parkingLot;

    private ParkingManagementSystem(){};

    public static ParkingLot getInstance(){
        if(parkingLot == null){
            synchronized (ParkingManagementSystem.class){
                if(parkingLot == null){
                    parkingLot = new ParkingLot();
                }
            }
        }
        return parkingLot;
    }

    public ParkingSpot parkCar(Vehicle vehicle){
        ParkingLot currentLot = getInstance();
        return parkingLot.parkingCarOnLevels(vehicle);
    }

    public void unParkCar(ParkingSpot spot){
        getInstance().unParkCarOnLevels(spot);
    }

    public void addNewLevelInLot(ParkingLevel pl){
        getInstance().addNewLevel(pl);
    }

}
