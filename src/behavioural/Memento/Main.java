package behavioural.Memento;

public class Main {

    public static void main(String[] args) {
        EditorData editorData = new EditorData("This is first sentence-----", Color.BLACK);
        Editor editor = new Editor(editorData);

        editor.changeText("second ------");

        editor.changeColor(Color.BLUE);

        editor.changeColor(Color.RED);

        editor.printEditorContent();
        editor.undo();
        editor.printEditorContent();
        editor.undo();
        editor.printEditorContent();
        editor.undo();
        editor.printEditorContent();
    }

}
