import java.util.ArrayList;
import java.util.List;

public class CreateWeatherTable {

    private String header;
    private Grid grid;
    private ListOfElements elements;

    public void createHeader (TextFileContent textFileContent) {
        StringBuilder headerBuilder = new StringBuilder("date");
        for (GridPoint point : grid.getPoints()) {
           headerBuilder.append(";");
           headerBuilder.append(point.getIdentifier());
        }
        header = headerBuilder.toString();
    }
}
