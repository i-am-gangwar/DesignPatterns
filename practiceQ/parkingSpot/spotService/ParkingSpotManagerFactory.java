package practiceQ.parkingSpot.spotService;

import practiceQ.parkingSpot.Vehicle;
import practiceQ.parkingSpot.VehicleType;

import java.util.ArrayList;

public class ParkingSpotManagerFactory {
   public ParkingSpotManager getParkingManager(VehicleType vehicleType) {
       if (vehicleType ==VehicleType.TWO_WHEELER)
            return new TwoWheelerSpotManager(new ArrayList<>());
       if (vehicleType ==VehicleType.FOUR_WHEELER)
           return new FourWheelerSpotManager(new ArrayList<>());
       return null;
   }
}
