package structural.compositeDesignPattern.withCompositePattern;


// Client
public class FileSystemComposite {
    public static void main(String[] args) {
        File file1 = new File("notes.txt", 10);
        File file2 = new File("todo.txt", 5);
        File file3 = new File("photo.jpg", 200);

        Directory workDir = new Directory("Work");
        workDir.add(file1);
        workDir.add(file2);

        Directory imagesDir = new Directory("Images");
        imagesDir.add(file3);

        Directory root = new Directory("Root");
        root.add(new File("rootFile.txt",40));
        root.add(workDir);
        root.add(imagesDir);
        root.showDetails(" ");
    }
}