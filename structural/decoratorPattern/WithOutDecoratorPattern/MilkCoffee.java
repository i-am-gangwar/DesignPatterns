package DesignPatterns.structural.decoratorPattern.WithOutDecoratorPattern;

public class MilkCoffee extends SimpleCoffee{


    @Override
    public int getCost() {
        return super.getCost()+50;
    }

    @Override
    public String getDescription() {
            return  super.getDescription() + " with milk";
    }
}
