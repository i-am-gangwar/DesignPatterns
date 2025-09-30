package structural.decoratorPattern.withDecoratorPattern;

class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);   // 👈 calls parent (CoffeeDecorator) constructor
    }

    @Override
    public int getCost() {
        return super.getCost() + 25; }

    @Override
    public String getDescription() { return super.getDescription() + " + Sugar"; }
}