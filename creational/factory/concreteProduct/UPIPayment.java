package creational.factory.concreteProduct;

import creational.factory.product.Payment;
// Concrete Product: The actual implementation of the product

public class UPIPayment  implements Payment {

    @Override
    public String processPayment(double amount) {
       return "UPI payment of amount "+amount+" is successful";
    }
    
}
