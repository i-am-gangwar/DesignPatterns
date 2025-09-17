package practiceQ.parkingSpot.spotEntity;

import practiceQ.parkingSpot.Vehicle;

public abstract class ParkingSpot {
    private String id;
    private boolean isAvailable;
    private Vehicle vehicle; // assigned vehicle

    public ParkingSpot(String id){
        this.id = id;
        this.isAvailable = true;
    }

    public abstract int getPricePerHour();  // Different for 2W vs 4W

    public void parkVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        this.isAvailable = false;

    }
    public void removeVehicle(){
        this.vehicle = null;
        this.isAvailable = true;
    }


  // getter and setter
    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }





}
