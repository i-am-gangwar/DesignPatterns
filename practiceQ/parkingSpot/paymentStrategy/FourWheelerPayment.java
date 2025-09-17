package practiceQ.parkingSpot.paymentStrategy;

import practiceQ.parkingSpot.Ticket;
import practiceQ.parkingSpot.spotEntity.FourWheelerSpot;

import java.time.LocalDateTime;

public class FourWheelerPayment implements PaymentStrategy{

    @Override
    public double calculateFee(Ticket ticket) {
        LocalDateTime localDateTime = LocalDateTime.now();
        long mintues = java.time.Duration.between(
                ticket.getEntryTime(), localDateTime.plusMinutes(150)
                ).toMinutes();
        FourWheelerSpot fourWheelerSpot = new FourWheelerSpot(ticket.getParkingSpot().getId());
        updateExitTime(ticket);
        return ((double) mintues /60)* fourWheelerSpot.getPricePerHour();
    }

    @Override
    public void updateExitTime(Ticket ticket) {
        ticket.setExitTime(LocalDateTime.now());
    }
}
