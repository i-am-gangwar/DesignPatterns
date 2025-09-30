package structural.compositeDesignPattern.withoutCompositePattern;
import java.util.ArrayList;
import java.util.List;

public class Directory {
    private String name;
    private List<Object> children = new ArrayList<>(); // problem: can hold anything

    public Directory(String name) {
        this.name = name;
    }

    public void add(Object obj) {
        children.add(obj);
    }

    public void showDetails() {
        System.out.println("Directory: " + name);
        for (Object obj : children) {
            if (obj instanceof File) {
                ((File) obj).showDetails();
            } else if (obj instanceof Directory) {
                ((Directory) obj).showDetails();
            }
        }
    }
}