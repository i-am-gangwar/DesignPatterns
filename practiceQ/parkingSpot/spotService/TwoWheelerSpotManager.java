package practiceQ.parkingSpot.spotService;
import practiceQ.parkingSpot.spotEntity.TwoWheelerSpot;
import java.util.ArrayList;


public class TwoWheelerSpotManager extends ParkingSpotManager{
   public TwoWheelerSpotManager(int capacity) {
       super(new ArrayList<>());
            for (int i = 1; i <= capacity; i++) {
                parkingSpotList.add(new TwoWheelerSpot("2W-" + i));
            }

    }
}
