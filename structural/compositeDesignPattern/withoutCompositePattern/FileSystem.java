package DesignPatterns.structural.compositeDesignPattern.withoutCompositePattern;

public class FileSystem {
    public static void main(String[] args) {
        File file1 = new File("notes.txt", 10);
        File file2 = new File("todo.txt", 5);
        File file3 = new File("rootFile.txt", 50);

        Directory folder1 = new Directory("Work");
        folder1.add(file1);
        folder1.add(file2);

        Directory root = new Directory("Root");
        root.add(file3);
        root.add(folder1);
        root.showDetails();
    }
}