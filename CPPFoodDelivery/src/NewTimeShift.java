import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class NewTimeShift implements TimeShift {
    private LocalTime startTime;
    private LocalTime endTime;

    public NewTimeShift(String startTime, String endTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
        this.startTime = LocalTime.parse(startTime, formatter);
        this.endTime = LocalTime.parse(endTime, formatter);
    }

    @Override
    public boolean isAvailable(LocalTime time) {
        return !time.isBefore(startTime) && !time.isAfter(endTime);
    }

    @Override
    public String getStartTime() {
        return startTime.toString();
    }

    @Override
    public String getEndTime() {
        return endTime.toString();
    }
}
