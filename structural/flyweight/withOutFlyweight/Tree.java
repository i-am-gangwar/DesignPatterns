package structural.flyweight.withOutFlyweight;

// Each tree has all its properties (no sharing)
public class Tree {
    private String type;   // intrinsic (shared)
    private String color;  // intrinsic (shared)
    private String texture; // intrinsic (shared)
    private int x;         // extrinsic (unique)
    private int y;         // extrinsic (unique)
    public Tree(String type, String color, String texture, int x, int y) {
        this.type = type;
        this.color = color;
        this.texture = texture;
        this.x = x;
        this.y = y;
    }
    public void draw() {
        System.out.println("Drawing " + type + " tree at (" + x + "," + y + ") with color " + color);
    }
}