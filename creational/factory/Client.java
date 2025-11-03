package creational.factory;

import creational.factory.creator.PaymentFactory;
import creational.factory.product.Payment;

public class Client {

    private Payment paymentType;
    public  Client(PaymentFactory paymentFactory){
        this.paymentType = paymentFactory.createPayment();
    }

    public Payment getPaymentType() {
        return paymentType;
    }
}
