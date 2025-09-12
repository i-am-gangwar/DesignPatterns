package DesignPatterns.Creational.Factory;

public class NetBankingPayment implements Payment {
    @Override
    public String processPayment(double amount) {
        return  "Net Banking payment of amount " + amount + " is successful";
    }
    
}
