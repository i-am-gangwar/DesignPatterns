package creational.factory;

import creational.factory.creator.PaymentFactory;
import creational.factory.creator.concreteCreator.CardFactory;
import creational.factory.creator.concreteCreator.NetBankingFactory;
import creational.factory.creator.concreteCreator.UPIFactory;
import creational.factory.product.Payment;

import java.util.Scanner;

public class Main {

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("For UPI enter 1");
        System.out.println("For CARD enter 2");
        System.out.println("For Net Banking enter 3");

        int num = sc.nextInt();

        while(true){

        if(num==1){
        // UPI
        Payment upiPayment = new UPIFactory().createPayment();
        System.out.println(upiPayment.processPayment(500));
        break;
        }
        else if(num==2){
        // CARD
        Payment cardPayment = new CardFactory().createPayment();
        System.out.println(cardPayment.processPayment(500));
        break;
        }
        else if(num==3){
        // UPI
        Payment netBankingPayment = new NetBankingFactory().createPayment();
        System.out.println(netBankingPayment.processPayment(500));
        break;
        }
        else{
            System.out.println("Please enter number between 1 to 3");
            num = sc.nextInt();
        }
        

    }





    }
    
}
