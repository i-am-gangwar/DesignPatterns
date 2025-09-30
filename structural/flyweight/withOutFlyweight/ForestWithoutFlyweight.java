package structural.flyweight.withOutFlyweight;

public class ForestWithoutFlyweight {
    public static void main(String[] args) {
        // imagine 1,000,000 trees
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree("Oak", "Green", "Rough", i, i+1);
            t.draw();
        }
    }
}
