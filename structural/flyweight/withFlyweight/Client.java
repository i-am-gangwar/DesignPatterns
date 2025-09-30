package structural.flyweight.withFlyweight;


public class Client {

    public static void main(String[] args) {
        Forest forest = new Forest();
        // Plant many trees
        forest.plantTree(1, 2, "Oak", "Green", "Rough");
        forest.plantTree(5, 7, "Oak", "Green", "Rough"); // reused
        forest.plantTree(3, 4, "Pine", "Dark Green", "Smooth");
        forest.plantTree(9, 1, "Oak", "Green", "Rough"); // reused
        forest.draw();
    }
}

