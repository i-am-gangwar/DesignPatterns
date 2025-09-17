package practiceQ.parkingSpot.spotService;

import practiceQ.parkingSpot.Vehicle;
import practiceQ.parkingSpot.spotEntity.ParkingSpot;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public abstract class ParkingSpotManager {
    List<ParkingSpot> parkingSpotList;
    ParkingSpotManager(List<ParkingSpot> parkingSpotList){
        this.parkingSpotList = parkingSpotList;
    }

    public ParkingSpot findParkingSpot(){
        for(ParkingSpot spot: parkingSpotList){
            if(spot.getIsAvailable()){
                return spot;
            }
        }
        return null;
    }
    public void addParkingSpace(ParkingSpot parkingSpot){
          parkingSpotList.add(parkingSpot);
    }
    public void removeParkingSpace(String spotId){
        parkingSpotList.removeIf(parkingSpot ->
                parkingSpot.getId().equalsIgnoreCase(spotId));

    }
    // Assign a vehicle to a spot (first available)
    public boolean parkVehicle(Vehicle vehicle){
        ParkingSpot freeParkingSpot  = findParkingSpot();
        if(freeParkingSpot!=null){
            freeParkingSpot.setVehicle(vehicle);
            freeParkingSpot.setAvailable(false);
            return true;
        }
        return false; // No space available


    }
    public ParkingSpot findAssignedSpot(Vehicle vehicle){
       Optional<ParkingSpot> parkingSpot = parkingSpotList.stream().filter(
                spot -> Objects.equals(spot.getVehicle().getNumber(), vehicle.getNumber())
        ).findAny();
        return parkingSpot.orElse(null);
    }
    // Remove vehicle (free the spot)
    public boolean removeVehicle(String vehicleNumber){
        for(ParkingSpot spot: parkingSpotList){
            if(!spot.getIsAvailable()){
                if(spot.getVehicle().getNumber().equals(vehicleNumber)){
                    spot.removeVehicle();
                    return true;
                }
            }
        }
        return false;

    }





    // getter and setter


    // 👉 This gives you the full list
    public void getAllParkingSpots() {
        for(ParkingSpot spot: parkingSpotList){
            System.out.println(spot.toString());
        }
    }

    public void setParkingSpotList(List<ParkingSpot> parkingSpotList) {
        this.parkingSpotList = parkingSpotList;
    }
}
