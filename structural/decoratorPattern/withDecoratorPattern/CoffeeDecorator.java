package structural.decoratorPattern.withDecoratorPattern;

abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;   // composition

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int getCost() {
        return coffee.getCost();
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }
}
