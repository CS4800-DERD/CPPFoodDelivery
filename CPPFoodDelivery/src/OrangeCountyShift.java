import java.time.LocalTime;

public class OrangeCountyShift implements TimeShift{
    private static final LocalTime START_SHIFT = LocalTime.of(16,0);
    private static final LocalTime END_SHIFT = LocalTime.of(0,0);

    @Override
    public boolean isAvailable(LocalTime time) {
        return !time.isBefore(START_SHIFT) && !time.isAfter(END_SHIFT);
    }

    @Override
    public String getStartTime() {
        return "4 PM";
    }

    @Override
    public String getEndTime() {
        return "12 AM";
    }
}
