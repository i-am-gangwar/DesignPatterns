package DesignPatterns.structural.decoratorPattern.withDecoratorPattern;

public class Client {
    public static void main(String[] args) {

        Coffee simpleCoffee   = new  SimpleCoffee();
        System.out.println(simpleCoffee.getDescription() + " => " + simpleCoffee.getCost());

        // Wrap with milk
        Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        System.out.println(milkCoffee.getDescription() + " => " + milkCoffee.getCost());

        // Wrap with sugar
        Coffee sugarCoffee = new SugarDecorator(simpleCoffee);
        System.out.println(sugarCoffee.getDescription() + " => " + sugarCoffee.getCost());

        // simple with milk and sugar
        Coffee milkSugarCoffee = new SugarDecorator(milkCoffee);
        System.out.println(milkSugarCoffee.getDescription() + " => " + milkSugarCoffee.getCost());



    }
}
