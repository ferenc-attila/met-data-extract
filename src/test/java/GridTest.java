import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GridTest {

    @Test
    void createGridPointsTest() {
        Grid grid = new Grid();
        grid.createGridPoints(Path.of("src/test/resources/gridpoints.csv"));

        assertEquals("POINT (714351.42357095 228795.498968113)", grid.getPoints().get(0).getWktGeometry());
        assertEquals(937, grid.getPoints().get(4).getIdentifier());
    }
}