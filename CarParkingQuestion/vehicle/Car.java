package CarParkingQuestion.vehicle;

import CarParkingQuestion.VehicleType;

public class Car extends Vehicle{

    public Car(String vechicleNumber, String ownerName) {
        super(vechicleNumber, VehicleType.CAR, ownerName);
    }
    
}
