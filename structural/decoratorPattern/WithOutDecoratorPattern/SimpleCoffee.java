package structural.decoratorPattern.WithOutDecoratorPattern;

class SimpleCoffee implements Coffee {
    @Override
    public int getCost() {
        return 50;
    }

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
}
