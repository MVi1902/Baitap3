import java.io.File;
import java.io.IOException;

public class EditorController {
    private EditorModel model;
    private EditorView view;

    public EditorController(EditorModel model, EditorView view) {
        this.model = model;
        this.view = view;
    }

    public void addLine(String line) {
        model.addLine(line);
    }

    public void loadFromFile(File file) throws IOException {
        model.loadFromFile(file);
    }

    public void saveToFile(File file) throws IOException {
        model.saveToFile(file);
    }

    public void displayLines() {
        view.displayLines(model.getLines());
    }
}