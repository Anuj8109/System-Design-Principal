package CarParkingQuestion.Parking;

import java.util.*;

import CarParkingQuestion.vehicle.Vehicle;

public class ParkingLot {
    List<ParkingLevel> parkingLevels;

    public ParkingLot(List<ParkingLevel> levels){
        this.parkingLevels = parkingLevels;
    }

    public ParkingLot(){
        parkingLevels = new ArrayList<>();
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
        System.out.println("Car is not parked in Lot of vehicle number " + parkingSpot.vehicle.vechicleNumber);
        return false;
    }
}
