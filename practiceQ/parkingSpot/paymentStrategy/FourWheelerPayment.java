package practiceQ.parkingSpot.paymentStrategy;

import practiceQ.parkingSpot.Ticket;
import practiceQ.parkingSpot.spotEntity.FourWheelerSpot;

import java.time.LocalDateTime;

public class FourWheelerPayment implements PaymentStrategy{
    FourWheelerSpot fourWheelerSpot;
    @Override
    public double calculateFee(Ticket ticket) {
        long mintues = java.time.Duration.between(
                ticket.getEntryTime(), LocalDateTime.now()
                ).toMinutes();

        return ((double) mintues /60)* fourWheelerSpot.getPricePerHour();
    }

    @Override
    public void updateExitTime(Ticket ticket) {
        ticket.setExitTime(LocalDateTime.now());
    }
}
