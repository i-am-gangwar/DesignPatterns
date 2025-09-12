package structural.WithOutDecoratorPattern;

public class MilkSugarCoffee extends MilkCoffee{
    @Override
    public int getCost() {
        return super.getCost() + 25;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " and with Sugar";
    }
}
