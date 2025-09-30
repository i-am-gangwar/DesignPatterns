package structural.decoratorPattern.withDecoratorPattern;

class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);  // 👈 calls parent (CoffeeDecorator) constructor
    }

    @Override
    public int getCost() {
        return super.getCost() + 50; }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Milk";
    }
}