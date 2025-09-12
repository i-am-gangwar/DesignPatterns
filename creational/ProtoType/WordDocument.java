package DesignPatterns.Creational.ProtoType;

import java.util.ArrayList;
import java.util.List;


// Concrete Prototype Class
public class WordDocument implements Cloneable {
    
    private String content;  // Immutable
    private List<String> comments;  // Mutable

    // Constructor
    public WordDocument(String content) {
        this.content = content;
        this.comments = new ArrayList<>();
    }

    // Add comment
    public void addComment(String comment) {
        comments.add(comment);
    }

    // Getter Methods
    public String getContent() {
        return content;
    }

    public List<String> getComments() {
        return comments;
    }

    // Overriding clone() method to implement Deep Copy
    @Override
    public WordDocument clone() {
        try {
            // Shallow Copy
            WordDocument clonedDoc = (WordDocument) super.clone();
            
            // Deep Copy for comments list
            clonedDoc.comments = new ArrayList<>(this.comments);

            return clonedDoc;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Error while cloning Word Document", e);
        }
    }

    @Override
    public String toString() {
        return "WordDocument{" +
                "content='" + content + '\'' +
                ", comments=" + comments +
                '}';
    }
}

