package creational.factory.creator.concreteCreator;

import creational.factory.concreteProduct.NetBankingPayment;
import creational.factory.creator.PaymentFactory;
import creational.factory.product.Payment;


public class NetBankingFactory implements PaymentFactory {
    @Override
    public Payment createPayment() {
        return new NetBankingPayment();
    }
}
