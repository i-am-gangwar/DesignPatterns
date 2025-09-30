package Creational.Builder;


public class Main {

    public static void main(String[] args) {
        // Create a pizza using builder
         System.out.println("hello");
        Pizza myPizza = new Pizza.PizzaBuilder("Large", "Cheese Burst")
                .addTopping("Olives")
                .addTopping("Capsicum")
                .extraCheese(true)
                .build();

        // Display pizza details
        myPizza.displayPizza();

        // Calculate and display price
        System.out.println("Total Price: ₹" + myPizza.calculatePrice());

        // Create another pizza with different configurations
        Pizza anotherPizza = new Pizza.PizzaBuilder("Medium", "Thin Crust")
                .addTopping("Mushrooms")
                .addTopping("Tomatoes")
                .build();

        anotherPizza.displayPizza();
        System.out.println("Total Price: ₹" + anotherPizza.calculatePrice());
    }
}
