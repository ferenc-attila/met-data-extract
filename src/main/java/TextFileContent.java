import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TextFileContent {

    private List<String> fileContent;

    public void readTextFile (Path path) {
        try {
            fileContent = Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Unable to read file!", ioe);
        }
    }

    public List<String> getFileContent() {
        return new ArrayList<>(fileContent);
    }
}
