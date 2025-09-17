package practiceQ.parkingSpot;

import practiceQ.parkingSpot.spotEntity.ParkingSpot;

public class Vehicle {
    private String number;
    private VehicleType type;

    public Vehicle(String number, VehicleType vehicleType){
        this.number = number;
        this.type = vehicleType;
    }
    public String getNumber(){
        return number;
    }
    public VehicleType getType(){
        return type;
    }

}
