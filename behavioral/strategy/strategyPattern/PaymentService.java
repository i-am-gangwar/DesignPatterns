package behavioral.strategy.strategyPattern;

import behavioral.strategy.strategyPattern.strategyInterface.PaymentStrategy;

public class PaymentService {

    private PaymentStrategy paymentStrategy;

    // constructor injection
    public PaymentService(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // setter injection (if you want to change strategy later)
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(int amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Payment mode not set!");
        }
        paymentStrategy.payAmount(amount);
    }

}
