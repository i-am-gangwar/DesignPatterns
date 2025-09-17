package practiceQ.parkingSpot.spotService;

import practiceQ.parkingSpot.spotEntity.FourWheelerSpot;
import practiceQ.parkingSpot.spotEntity.TwoWheelerSpot;

import java.util.ArrayList;


public class FourWheelerSpotManager extends ParkingSpotManager{
    FourWheelerSpotManager(int capacity) {
        super(new ArrayList<>());
        for (int i = 1; i <= capacity; i++) {
            parkingSpotList.add(new FourWheelerSpot("4W-" + i));
        }
    }
}
