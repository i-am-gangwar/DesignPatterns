package behavioral.memento.originator;

import behavioral.memento.memento.TextMemento;

// Originator: the actual text editor
public class TextEditor {
    private String text = "";

    public void write(String newText) {
        text += newText;
    }

    public String getText() {
        return text;
    }

    // Save current state in a memento
    public TextMemento save() {
        return new TextMemento(text);
    }

    // Restore state from memento
    public void restore(TextMemento memento) {
        text = memento.getState();
    }
}