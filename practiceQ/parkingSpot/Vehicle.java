package practiceQ.parkingSpot;

import practiceQ.parkingSpot.spotEntity.ParkingSpot;

public class Vehicle {
    private String number;
    private VehicleType type;
    private ParkingSpot parkingSpot;

    public String getNumber(){
        return number;
    }
    public VehicleType getType(){
        return type;
    }

}
