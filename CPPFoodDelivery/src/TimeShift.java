import java.time.LocalTime;

public interface TimeShift {
    boolean isAvailable(LocalTime time);

    String getStartTime();

    String getEndTime();
}
