package practiceQ.parkingSpot.paymentStrategy;

import practiceQ.parkingSpot.Ticket;
import practiceQ.parkingSpot.spotEntity.TwoWheelerSpot;

import java.time.*;

public class TwoWheelerPayment implements PaymentStrategy{

    @Override
    public double calculateFee(Ticket ticket) {
        LocalDateTime localDateTime = LocalDateTime.now();
        // total min.
       long minutes = java.time.Duration.between(
               ticket.getEntryTime(), localDateTime.plusMinutes(140)
       ).toMinutes();

        TwoWheelerSpot twoWheelerSpot = new TwoWheelerSpot(ticket.getParkingSpot().getId());
        updateExitTime(ticket);
       return  ((double) minutes /60)*twoWheelerSpot.getPricePerHour();
    }

    @Override
    public void updateExitTime(Ticket ticket) {
        ticket.setExitTime(LocalDateTime.now());
    }


}
