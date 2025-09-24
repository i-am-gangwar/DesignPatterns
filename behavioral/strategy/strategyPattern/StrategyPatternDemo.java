package DesignPatterns.behavioral.strategy.strategyPattern;

import behavioral.strategy.strategyPattern.concreteStrategies.CardPayment;
import behavioral.strategy.strategyPattern.concreteStrategies.UPIPayment;
import behavioral.strategy.strategyPattern.strategyInterface.PaymentStrategy;

import java.util.Scanner;

public class StrategyPatternDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose payment method: CARD / UPI");
        String choice = scanner.nextLine().trim().toUpperCase();

        PaymentStrategy strategy = null;
        switch (choice) {
            case "CARD":
                strategy = new CardPayment(choice);
                break;
            case "UPI":
                strategy = new UPIPayment(choice);
                break;
            default:
                System.out.println("Invalid choice!");
                System.exit(0);
        }

        System.out.print("Enter amount to pay: ");
        int amount = scanner.nextInt();

        behavioral.strategy.strategyPattern.PaymentService service = new behavioral.strategy.strategyPattern.PaymentService(strategy);
        service.processPayment(amount);



    }
}
