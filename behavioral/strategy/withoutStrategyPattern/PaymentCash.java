package behavioral.strategy.withoutStrategyPattern;

public class PaymentCash implements Payment {

    @Override
    public void payAmount(int amount) {
            System.out.println("paying amount via Cash:"+amount);
    }
}
