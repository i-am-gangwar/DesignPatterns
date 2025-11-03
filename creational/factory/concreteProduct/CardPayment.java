package creational.factory.concreteProduct;

import creational.factory.product.Payment;
// Concrete Product: The actual implementation of the product

public class CardPayment implements Payment {

    @Override
    public String processPayment(double amount) {
        return "Card payment of amount " + amount + " is successful";
    }

}
