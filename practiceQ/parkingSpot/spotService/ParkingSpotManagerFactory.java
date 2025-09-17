package practiceQ.parkingSpot.spotService;

import practiceQ.parkingSpot.Vehicle;
import practiceQ.parkingSpot.VehicleType;

import java.util.ArrayList;

public class ParkingSpotManagerFactory {

    // keep one instance per type
    private static ParkingSpotManager twoWheelerManager;
    private static ParkingSpotManager fourWheelerManager;

   public ParkingSpotManager getParkingManager(VehicleType vehicleType) {
       if (vehicleType ==VehicleType.TWO_WHEELER){
           if(twoWheelerManager==null){
               twoWheelerManager = new TwoWheelerSpotManager(2);
           }
           return twoWheelerManager;
       }

       if (vehicleType ==VehicleType.FOUR_WHEELER){
           if(fourWheelerManager==null){
               fourWheelerManager =  new FourWheelerSpotManager(2);
           }
           return fourWheelerManager;

       }

       return null;
   }
}
