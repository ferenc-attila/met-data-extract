import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ListOfElements {

    private List<DailyPointData> elements = new ArrayList<>();
    private TextFileContent textFileContent = new TextFileContent();

    public void addDailyPointData(Path path) {
        textFileContent.readTextFile(path);
        List<String> content = textFileContent.getFileContent();
        List<Integer> pointIds = parsePointIds(content);
        for (int i = 1; i < content.size(); i++) {
            LocalDate date = parseDate(content.get(i));
            List<Integer> dailyData = parseDailyData(content.get(i));
            for (int j = 0; j < pointIds.size(); j++) {
                elements.add(new DailyPointData(pointIds.get(j), date, dailyData.get(j)));
            }
        }
    }

    private LocalDate parseDate(String tableRow) {
        int year = Integer.parseInt(tableRow.substring(0, 4));
        int month = Integer.parseInt(tableRow.substring(4, 6).strip());
        int day = Integer.parseInt(tableRow.substring(6, 8).strip());
        return LocalDate.of(year, month, day);
    }

    private List<Integer> parsePointIds(List<String> fileContent) {
        String[] stringOfPointIds = fileContent.get(0).split(" ");
        List<Integer> pointIds = new ArrayList<>();
        for (String actual : stringOfPointIds) {
            pointIds.add(Integer.parseInt(actual.strip()));
        }
        return pointIds;
    }

    private List<Integer> parseDailyData(String tableRow) {
        List<Integer> data = new ArrayList<>();
        String dataRow = tableRow.substring(8);
        String[] stringOfData = dataRow.split(" ");
        for (String actual : stringOfData) {
            data.add(Integer.parseInt(actual.strip()));
        }
        return data;
    }
}
