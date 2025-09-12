package behavioral.strategy.withoutStrategyPattern;

public class PaymentByUPI implements Payment {

    @Override
    public void payAmount(int amount) {
            System.out.println("paying amount via UPI:"+amount);
    }
}
