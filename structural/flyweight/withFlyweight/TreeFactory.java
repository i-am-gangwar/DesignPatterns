package DesignPatterns.structural.flyweight.withFlyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static Map<String, TreeType> treeTypes = new HashMap<>();
    public static TreeType getTreeType(String type, String color, String texture) {
        String key = type + "-" + color + "-" + texture;
        if (!treeTypes.containsKey(key)) {
            treeTypes.put(key, new TreeType(type, color, texture));
            System.out.println("Created new TreeType: " + key);
        }
        return treeTypes.get(key);
    }
}
