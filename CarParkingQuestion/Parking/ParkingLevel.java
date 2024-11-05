package CarParkingQuestion.Parking;

import java.util.*;

import CarParkingQuestion.vehicle.Vehicle;
import CarParkingQuestion.vehicle.VehicleType;

public class ParkingLevel {
    public List<ParkingSpot> parkingSpots = new ArrayList<>();
    public Integer totalSpot;
    public Map<VehicleType, Integer> availableSpot = new HashMap<>();
    public Integer floorNumber;

    public ParkingLevel(Integer floorNumber, Integer totalSpot, ArrayList<ParkingSpot> spots ){
        this.floorNumber = floorNumber;
        this.totalSpot = totalSpot;
        for(VehicleType type:VehicleType.values()){
            availableSpot.put(type, 0);
        }
        for(ParkingSpot spot : spots){
            parkingSpots.add(spot);
            availableSpot.put(spot.spotType, availableSpot.get(spot.spotType));
        }
    }

    public ParkingSpot bookSpot(Vehicle vehicle){
        for(ParkingSpot parkingSpot:parkingSpots){
            if(parkingSpot.isAvailableSpot() && parkingSpot.parkCar(vehicle)){
                availableSpot.put(vehicle.vehicleType, availableSpot.get(vehicle.vehicleType) - 1);
                return parkingSpot;
            }
        }
        return null;
    }

    public boolean releaseSpot(ParkingSpot parkedSpot){
        for(ParkingSpot parkingSpot:parkingSpots){
            if(parkingSpot.unParkCar(parkedSpot.vehicle)){
                availableSpot.put(parkedSpot.spotType, availableSpot.get(parkedSpot.spotType) + 1);
                return true;
            }
        }
        return false;
    }

    public Map<VehicleType, Integer> currentAvailbleSpot(){
        return availableSpot;
    }
}
