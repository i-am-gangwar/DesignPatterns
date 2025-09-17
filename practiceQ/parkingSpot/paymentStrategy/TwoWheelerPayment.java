package practiceQ.parkingSpot.paymentStrategy;

import practiceQ.parkingSpot.Ticket;
import practiceQ.parkingSpot.spotEntity.TwoWheelerSpot;

import java.time.LocalDateTime;

public class TwoWheelerPayment implements PaymentStrategy{

    TwoWheelerSpot twoWheelerSpot;
    @Override
    public double calculateFee(Ticket ticket) {
        // total min.
       long minutes = java.time.Duration.between(
               ticket.getEntryTime(), LocalDateTime.now()
       ).toMinutes();

       return  ((double) minutes /60)*twoWheelerSpot.getPricePerHour();
    }

    @Override
    public void updateExitTime(Ticket ticket) {
        ticket.setExitTime(LocalDateTime.now());
    }


}
