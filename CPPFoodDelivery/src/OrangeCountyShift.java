import java.time.LocalTime;

public class OrangeCountyShift implements TimeShift {
    private static final LocalTime START_SHIFT = LocalTime.of(16, 0);
    private static final LocalTime END_SHIFT = LocalTime.of(23, 59);

    @Override
    public boolean isAvailable(LocalTime time) {
        return !time.isBefore(START_SHIFT) && !time.isAfter(END_SHIFT);
    }

    @Override
    public String getStartTime() {
        return "16:00";
    }

    @Override
    public String getEndTime() {
        return "23:59";
    }
}