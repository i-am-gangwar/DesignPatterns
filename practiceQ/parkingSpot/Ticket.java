package practiceQ.parkingSpot;

import practiceQ.parkingSpot.spotEntity.ParkingSpot;

import java.time.LocalDateTime;

public class Ticket {
    private String id;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private  Vehicle vehicle;
    private ParkingSpot parkingSpot;

    public Ticket(String ticketId,Vehicle vehicle, ParkingSpot parkingSpot){
        this.id = ticketId;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.entryTime = LocalDateTime.now();

    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    // getter

    public String getId() {
        return id;
    }


    public LocalDateTime getEntryTime() {
        return entryTime;
    }




    public LocalDateTime getExitTime() {
        return exitTime;
    }



    public Vehicle getVehicle() {
        return vehicle;
    }



    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }




}
