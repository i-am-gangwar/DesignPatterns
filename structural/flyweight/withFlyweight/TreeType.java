package DesignPatterns.structural.flyweight.withFlyweight;

public class TreeType {
    private String type;
    private String color;
    private String texture;

    public TreeType(String type, String color, String texture) {
        this.type = type;
        this.color = color;
        this.texture = texture;
    }

    public void draw(int x, int y) {
        System.out.println("Drawing " + type + " tree at (" + x + "," + y + ") with color " + color);
    }
}
