package behavioral.visitor.elements;

import behavioral.visitor.ShoppingCartVisitor;

public class Fruit implements ItemElement {
    private int pricePerKg;
    private int weight;
    private String name;

    public Fruit(int priceKg, int wt, String name) {
        this.pricePerKg = priceKg;
        this.weight = wt;
        this.name = name;
    }

    public int getPricePerKg() { return pricePerKg; }
    public int getWeight() { return weight; }
    public String getName() { return name; }

    @Override
    public void accept(ShoppingCartVisitor visitor) {
        visitor.visit(this);
    }
}

