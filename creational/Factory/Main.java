package Creational.Factory;

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
        Payment upiPayment =  PaymentFactory.getPayment("UPI");
        System.out.println(upiPayment.processPayment(500));
        break;
        }
        else if(num==2){
        // CARD
        Payment cardPayment =  PaymentFactory.getPayment("CARD");
        System.out.println(cardPayment.processPayment(500));
        break;
        }
        else if(num==3){
        // UPI
        Payment netBankingPayment =  PaymentFactory.getPayment("NETBANKING");
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
