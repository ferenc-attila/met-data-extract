import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Grid {

    private final List<GridPoint> points = new ArrayList<>();
    private final TextFileContent gridFileContent = new TextFileContent();

    public void createGridPoints(Path path) {
        gridFileContent.readTextFile(path);
        List<String> grid = gridFileContent.getFileContent();
        for (int i = 1; i < grid.size(); i++) {
            if (!(grid.get(i).isEmpty())) {
                String[] pointData = grid.get(i).split(";");
                pointData[0] = removeQuotationMark(pointData[0]);
                pointData[1] = removeQuotationMark(pointData[1]);
                points.add(new GridPoint(pointData[0], Integer.parseInt(pointData[1])));
            }
        }
    }

    private String removeQuotationMark(String string) {
        return string.replaceAll("\"", "");
    }

    public List<GridPoint> getPoints() {
        return new ArrayList<>(points);
    }
}
