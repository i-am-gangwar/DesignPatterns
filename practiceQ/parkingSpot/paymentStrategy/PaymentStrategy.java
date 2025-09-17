package practiceQ.parkingSpot.paymentStrategy;

import practiceQ.parkingSpot.Ticket;

public interface PaymentStrategy {
    double calculateFee(Ticket ticket);
    void updateExitTime(Ticket ticket);
}
