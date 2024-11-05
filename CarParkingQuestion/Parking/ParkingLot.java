package CarParkingQuestion.Parking;

import java.util.*;

import CarParkingQuestion.vehicle.Vehicle;

public class ParkingLot {
    private final List<ParkingLevel> parkingLevels;
    private static ParkingLot instance;

    public ParkingLot(){
        parkingLevels = new ArrayList<>();
    }

    public static synchronized ParkingLot getInstance(){
        if(instance == null){
            instance = new ParkingLot();
        }
        return instance;
    }

    public void addNewLevel(ParkingLevel parkingLevel){
        parkingLevels.add(parkingLevel);
    }


    public ParkingSpot parkingCarOnLevels(Vehicle vehicle){
        ParkingSpot resultSpot = null;
        for(ParkingLevel parkingLevel:parkingLevels){
            resultSpot = parkingLevel.bookSpot(vehicle);
            if(resultSpot != null){
                System.out.println("Car is Parked");
                break;
            }
        }
        return resultSpot;
    }

    public boolean unParkCarOnLevels(ParkingSpot parkingSpot){
        //Boolean unPark = false;
        for(ParkingLevel parkingLevel:parkingLevels){
            if(parkingLevel.releaseSpot(parkingSpot)){
                System.out.println("Car is unparked of Vehicle Number " + parkingSpot.vehicle.vechicleNumber);
                return true;
            }
        }
        System.out.println((parkingSpot.vehicle == null ? "Vehicle number is incorrect" : "Car is not parked in Lot of vehicle number " + parkingSpot.vehicle.vechicleNumber) );
        return false;
    }
}
