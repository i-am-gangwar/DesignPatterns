package creational.factory;

public class PaymentFactory {

    public static Payment getPayment(String paymentType) {
        if (paymentType.equalsIgnoreCase("NETBANKING")) {
            return new NetBankingPayment();
        } else if (paymentType.equalsIgnoreCase("CARD")) {
            return new CardPayment();
        }
        else if (paymentType.equalsIgnoreCase("UPI")){
            return new UPIPayment();
        }
        return null;
    }
    
}
