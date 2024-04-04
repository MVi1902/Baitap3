import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        EditorModel model = new EditorModel();
        EditorView view = new EditorView();
        EditorController controller = new EditorController(model, view);

        // Load data from file
        try {
            File inputFile = new File("C:\\Users\\LENOVO\\OneDrive\\Desktop\\Workspace\\java oop\\baitapmoi1\\input.txt");
            controller.loadFromFile(inputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Display lines
        controller.displayLines();

        // Save data to file
        try {
            File outputFile = new File("C:\\Users\\LENOVO\\OneDrive\\Desktop\\Workspace\\java oop\\baitapmoi1\\output.txt");
            controller.saveToFile(outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}