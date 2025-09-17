package practiceQ.parkingSpot.spotService;

import practiceQ.parkingSpot.spotEntity.ParkingSpot;

import java.util.List;

public class FourWheelerSpotManager extends ParkingSpotManager{
    FourWheelerSpotManager(List<ParkingSpot> parkingSpotList) {
        super(parkingSpotList);
    }
}
