package behavioral.strategy.withoutStrategyPattern;

import java.util.Scanner;

public class PaymentService {

    // This is just polymorphism with conditionals.
    // You’re still writing if-else in the client to decide which implementation to use.

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter payment type:");
        String paymentType = sc.nextLine();
        Payment payment;
        System.out.println("Enter payment amount");
        if(paymentType.equalsIgnoreCase("card")){
               payment = new PaymentByCard();
               int amount = sc.nextInt();
               payment.payAmount(amount);
        }
        else if(paymentType.equalsIgnoreCase("UPI")){
            payment = new PaymentByUPI();
            int amount = sc.nextInt();
            payment.payAmount(amount);
        }
        else if(paymentType.equalsIgnoreCase("Cash")){
            payment = new PaymentCash();
            int amount = sc.nextInt();
            payment.payAmount(amount);
        }
        else {
            System.out.println("Invalid payment type");
        }



    }
}
