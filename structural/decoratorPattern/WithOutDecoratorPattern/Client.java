package structural.decoratorPattern.WithOutDecoratorPattern;

public class Client {
    public static void main(String[] args) {
        Coffee c1 = new SimpleCoffee();
        System.out.println(c1.getDescription() + " => " + c1.getCost());

        Coffee c2 = new MilkCoffee();
        System.out.println(c2.getDescription() + " => " + c2.getCost());

        Coffee c3 = new SugarCoffee();
        System.out.println(c3.getDescription() + " => " + c3.getCost());

        Coffee c4 = new MilkSugarCoffee();
        System.out.println(c4.getDescription() + " => " + c4.getCost());

        // ❌ If you want Milk + Sugar, you'd need a new subclass like MilkSugarCoffee
    }
}
