package behavioral.strategy.strategyPattern.concreteStrategies;

import behavioral.strategy.strategyPattern.strategyInterface.PaymentStrategy;

// Concrete Strategies
public class UPIPayment implements PaymentStrategy {

    private String paymentMode;
    public UPIPayment(String paymentMode){
        this.paymentMode = paymentMode;
    }

    @Override
    public void payAmount(int amount){
        System.out.println("paying using UPI "+ paymentMode +" : " +amount);

    }
}
