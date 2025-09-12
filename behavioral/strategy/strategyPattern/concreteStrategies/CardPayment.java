package behavioral.strategy.strategyPattern.concreteStrategies;

import behavioral.strategy.strategyPattern.strategyInterface.PaymentStrategy;

public class CardPayment implements PaymentStrategy {

    String paymentMode;
    public CardPayment(String paymentMode){
         this.paymentMode = paymentMode;
    }
    @Override
    public void payAmount(int amount) {
        System.out.println("paying using "+ paymentMode +" : " +amount);
    }
}
