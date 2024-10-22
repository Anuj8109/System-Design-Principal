package CarParkingQuestion.Parking;

import CarParkingQuestion.Status;
import CarParkingQuestion.VehicleType;
import CarParkingQuestion.vehicle.Vehicle;

public class ParkingSpot {
    public VehicleType spotType;
    public Status currentStatus;
    public Vehicle vehicle;
    
    public ParkingSpot(VehicleType vehicleType, Status status){
        this.spotType = vehicleType;
        this.currentStatus = status;
    }

    public boolean isAvailableSpot(){
        return currentStatus == Status.AVAILABLE ? true : false;
    }
    synchronized public boolean parkCar(Vehicle vehicle){
        if(vehicle.vehicleType != spotType && currentStatus != Status.AVAILABLE){
            return false;
        }
        this.vehicle = vehicle;
        currentStatus = Status.UNAVAILABLE;
        return true;
    }

    synchronized public boolean unParkCar(Vehicle vehicle){
        if(currentStatus == Status.UNAVAILABLE && this.vehicle != null && vehicle != null
            && vehicle.ownerName == this.vehicle.ownerName 
            && vehicle.vechicleNumber == this.vehicle.vechicleNumber){
                currentStatus = Status.AVAILABLE;
                vehicle = null;
                return true;
        }
        return false;
    }
}
