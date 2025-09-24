package DesignPatterns.structural.decoratorPattern.WithOutDecoratorPattern;

public class SugarCoffee extends SimpleCoffee {

    @Override
    public int getCost() {
        return super.getCost() + 25;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Sugar";
    }
}