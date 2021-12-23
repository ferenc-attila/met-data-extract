public class GridPoint {

    private final String wktGeometry;
    private final int identifier;

    public GridPoint(String wktGeometry, int identifier) {
        this.wktGeometry = wktGeometry;
        this.identifier = identifier;
    }

    public String getWktGeometry() {
        return wktGeometry;
    }

    public int getIdentifier() {
        return identifier;
    }
}
