package practiceQ.parkingSpot.spotService;

import practiceQ.parkingSpot.spotEntity.ParkingSpot;

import java.util.List;

public class TwoWheelerSpotManager extends ParkingSpotManager{
    TwoWheelerSpotManager(List<ParkingSpot> parkingSpotList) {
        super(parkingSpotList);
    }
}
