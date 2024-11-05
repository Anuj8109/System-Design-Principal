package CarParkingQuestion.vehicle;

public abstract class Vehicle {
    public String vechicleNumber;
    public VehicleType vehicleType;
    public String ownerName;

    public Vehicle(String vechicleNumber, VehicleType vehicleType, String ownerName){
        this.vechicleNumber = vechicleNumber;
        this.vehicleType = vehicleType;
        this.ownerName = ownerName;
    }    
}
