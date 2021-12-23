import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GridPointTest {

    @Test
    void createTest() {
        GridPoint point = new GridPoint("POINT (714351.42357095 228795.498968113)", 721);
        assertEquals("POINT (714351.42357095 228795.498968113)", point.getWktGeometry());
        assertEquals(721, point.getIdentifier());
    }
}