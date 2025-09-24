package DesignPatterns.structural.facadePattern;

// Client only talks to Facade
public class ShoppingWithFacade {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.placeOrder("User123", "Laptop", 1200);
    }
}