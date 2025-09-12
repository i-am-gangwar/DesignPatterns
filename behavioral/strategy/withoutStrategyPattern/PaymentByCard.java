package behavioral.strategy.withoutStrategyPattern;

public class PaymentByCard implements Payment {

    @Override
    public void payAmount(int amount) {
            System.out.println("paying amount via Card:"+amount);
    }
}
