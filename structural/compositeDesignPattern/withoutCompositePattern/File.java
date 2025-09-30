package structural.compositeDesignPattern.withoutCompositePattern;

public class File {

    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void showDetails() {
        System.out.println("File: " + name + " (Size: " + size + "KB)");
    }
}
