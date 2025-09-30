package structural.facadePattern;

// Subsystem 1: Payment
public class PaymentService {
    public void makePayment(String account, double amount) {
        System.out.println("Payment of $" + amount + " made from account " + account);
    }
}
