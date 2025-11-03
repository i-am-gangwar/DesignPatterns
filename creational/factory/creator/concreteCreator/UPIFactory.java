package creational.factory.creator.concreteCreator;

import creational.factory.concreteProduct.UPIPayment;
import creational.factory.creator.PaymentFactory;
import creational.factory.product.Payment;


public class UPIFactory implements PaymentFactory {
    @Override
    public Payment createPayment() {
        return new UPIPayment();
    }
}
