package creational.factory.creator;

import creational.factory.product.Payment;

public interface PaymentFactory {
    public Payment createPayment();
}
