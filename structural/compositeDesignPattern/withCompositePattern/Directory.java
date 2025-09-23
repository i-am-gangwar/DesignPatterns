package DesignPatterns.structural.compositeDesignPattern.withCompositePattern;


import java.util.ArrayList;
import java.util.List;

// Composite
public class Directory implements FileSystem {
    private String name;
    private List<FileSystem> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(FileSystem fs) {
        children.add(fs);
    }

    public void remove(FileSystem fs) {
        children.remove(fs);
    }

    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "+ Directory: " + name);
        for (FileSystem child : children) {
            child.showDetails(indent + "   ");
            // if child if File Object then it will call showDetails of file method print file name and size
            // if child is Directory object then it will call showDetails of directory basically this method again
            // that's why you will get dirc name printed and further again same for that.
        }
    }
}