package practiceQ.parkingSpot.spotEntity;

public class TwoWheelerSpot extends ParkingSpot {

    public TwoWheelerSpot(String id) {
        super(id);
    }

    @Override
    public int getPricePerHour() {
        return 25;
    }
}
