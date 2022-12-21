package behavioural.Memento;

import java.util.Stack;

public class Editor {
    private EditorData editorData;
    private Stack<EditorData.Snapshot> snapshots;

    public Editor(EditorData editorData) {
        this.editorData = editorData;
        this.snapshots = new Stack<>();
    }

    public void changeText(String newText) {
        snapshots.push(editorData.createSnapshot());
        editorData.setText(newText);
    }

    public void changeColor(Color newColor) {
        //Create and store current state
        snapshots.push(editorData.createSnapshot());
        editorData.setColor(newColor);
    }

    public void undo() {
        if (!snapshots.isEmpty()) {
            editorData.restoreFromSnapshot(snapshots.pop());
        }
    }

    public void printEditorContent() {
        editorData.print();
    }
}
