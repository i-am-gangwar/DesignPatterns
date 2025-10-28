package creational.factory;

public class UPIPayment  implements Payment{

    @Override
    public String processPayment(double amount) {
       return "UPI payment of amount "+amount+" is successful";
    }
    
}
