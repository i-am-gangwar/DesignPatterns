package practiceQ.parkingSpot.spotEntity;

public class FourWheelerSpot extends ParkingSpot {

    public FourWheelerSpot(String id) {
        super(id);
    }

    @Override
    public int getPricePerHour() {
        return 50;
    }
}
