package practiceQ.parkingSpot;

import practiceQ.parkingSpot.spotEntity.ParkingSpot;
import practiceQ.parkingSpot.spotService.ParkingSpotManager;
import practiceQ.parkingSpot.spotService.ParkingSpotManagerFactory;

import java.util.UUID;

public class EntranceGate {
   private ParkingSpotManagerFactory parkingSpotManagerFactory;

    public EntranceGate(ParkingSpotManagerFactory parkingSpotManagerFactory) {
        this.parkingSpotManagerFactory = parkingSpotManagerFactory;
    }

    public Ticket generateTicket(Vehicle vehicle){
        ParkingSpotManager parkingSpotManager = parkingSpotManagerFactory.getParkingManager(vehicle.getType());
       Boolean isParked = parkingSpotManager.parkVehicle(vehicle);
       if(!isParked){
           System.out.println("No available spot for " + vehicle.getType());
           return null;
       }
      ParkingSpot parkingSpot = parkingSpotManager.findAssignedSpot(vehicle);
        Ticket ticket = new Ticket(UUID.randomUUID().toString(), vehicle, parkingSpot);
        System.out.println("Ticket Generated: " + ticket.getId() +
                " for vehicle " + vehicle.getNumber()+ "for spot "+ ticket.getParkingSpot());
        return ticket;


    }

   public void findSpace(Vehicle vehicle){

   }
   public void bookSpot(Vehicle vehicle){

   }


}
