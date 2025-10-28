package creational.protoType;

public class Main {
    public static void main(String[] args) {
        // Create original document
        WordDocument originalDoc = new WordDocument("Prototype Pattern Example");
        originalDoc.addComment("Initial Comment");

        System.out.println("Original Document: " + originalDoc);

        // Clone the document
        WordDocument clonedDoc = originalDoc.clone();
        clonedDoc.addComment("Cloned Document Comment");

        // Display both documents
        System.out.println("Original Document after cloning: " + originalDoc);
        System.out.println("Cloned Document: " + clonedDoc);
        
    }
}
