package structural.compositeDesignPattern.withCompositePattern;


// Leaf
public class File implements FileSystem {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "- File: " + name + " (" + size + "KB)");
    }
}

