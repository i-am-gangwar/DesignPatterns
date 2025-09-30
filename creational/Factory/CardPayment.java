package Creational.Factory;

public class CardPayment implements Payment {

    @Override
    public String processPayment(double amount) {
        return "Card payment of amount " + amount + " is successful";
    }

}
