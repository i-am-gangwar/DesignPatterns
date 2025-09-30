package structural.flyweight.withFlyweight;

import java.util.ArrayList;
import java.util.List;

public class Forest {
    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String type, String color, String texture) {
        TreeType treeType = TreeFactory.getTreeType(type, color, texture);
        Tree tree = new Tree(x, y, treeType);
        trees.add(tree);
    }

    public void draw() {
        for (Tree t : trees) {
            t.draw();
        }
    }
}