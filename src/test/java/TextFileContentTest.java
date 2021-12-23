import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class TextFileContentTest {

    TextFileContent content = new TextFileContent();

    @Test
    void readTextFile() throws IOException {
        content.readTextFile(Path.of("src/test/resources/test.txt"));
        assertEquals("               1       2       3       4       5       6       7", content.getFileContent().get(0));
        assertEquals("20201231    0.62    1.05    1.05    1.14    1.17    1.27    1.32", content.getFileContent().get(7));
    }

    @Test
    void readInvalidTextFile() {
        IllegalStateException ise = assertThrows(IllegalStateException.class, () -> content.readTextFile(Path.of("src/test/resources/test_.txt")));
        assertEquals("Unable to read file!", ise.getMessage());
    }
}