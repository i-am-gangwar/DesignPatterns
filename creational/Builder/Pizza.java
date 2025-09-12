package DesignPatterns.Creational.Builder;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    // Required fields
    private final String size;  // Small, Medium, Large
    private final String crust;  // Thin Crust, Cheese Burst, Pan Crust

    // Optional fields
    private final List<String> toppings;
    private final boolean extraCheese;

    // Private constructor to restrict direct instantiation
    private Pizza(PizzaBuilder builder) {
        this.size = builder.size;
        this.crust = builder.crust;
        this.toppings = builder.toppings;
        this.extraCheese = builder.extraCheese;
    }

    // Display pizza details
    public void displayPizza() {
        System.out.println("Pizza Order Summary:");
        System.out.println("Size: " + size);
        System.out.println("Crust: " + crust);
        System.out.println("Toppings: " + (toppings.isEmpty() ? "None" : toppings));
        System.out.println("Extra Cheese: " + (extraCheese ? "Yes" : "No"));
    }

    // Price calculation (optional)
    public double calculatePrice() {
        double price = 0;

        // Base price based on size
        switch (size.toLowerCase()) {
            case "small":
                price += 200;
                break;
            case "medium":
                price += 300;
                break;
            case "large":
                price += 400;
                break;
        }

        // Additional cost for crust
        if (crust.equalsIgnoreCase("cheese burst")) {
            price += 100;
        } else if (crust.equalsIgnoreCase("pan crust")) {
            price += 50;
        }

        // Additional cost for toppings
        price += toppings.size() * 30;

        // Extra cheese cost
        if (extraCheese) {
            price += 50;
        }

        return price;
    }

    // ✅ Inner static Builder Class
    public static class PizzaBuilder {
        // Required fields
        private final String size;
        private final String crust;

        // Optional fields (initialized to default values)
        private List<String> toppings = new ArrayList<>();
        private boolean extraCheese = false;

        // Constructor with mandatory fields
        public PizzaBuilder(String size, String crust) {
            this.size = size;
            this.crust = crust;
        }

        // Method to add toppings
        public PizzaBuilder addTopping(String topping) {
            toppings.add(topping);
            return this;
        }

        // Method to add extra cheese
        public PizzaBuilder extraCheese(boolean extraCheese) {
            this.extraCheese = extraCheese;
            return this;
        }

        // Build method to create Pizza object
        public Pizza build() {
            return new Pizza(this);
        }
    }
}

