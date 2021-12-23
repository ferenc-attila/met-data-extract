import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DailyPointData {

    private int pointId;
    private LocalDate date;
    private int value;

    public DailyPointData(int pointId, LocalDate date, int value) {
        this.pointId = pointId;
        this.date = date;
        this.value = value;
    }

    public int getPointId() {
        return pointId;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getValue() {
        return value;
    }
}
