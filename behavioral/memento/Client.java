package behavioral.memento;

import behavioral.memento.caretaker.History;
import behavioral.memento.originator.TextEditor;

// Client code
public class Client {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.write("Hello ");
        history.save(editor);

        editor.write("World!");
        history.save(editor);

        System.out.println("Text: " + editor.getText());

        history.undo(editor);
        System.out.println("After undo: " + editor.getText());

        history.undo(editor);
        System.out.println("After second undo: " + editor.getText());
    }
}