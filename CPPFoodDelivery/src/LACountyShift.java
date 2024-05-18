import java.time.LocalTime;

public class LACountyShift implements TimeShift{
    private static final LocalTime START_SHIFT = LocalTime.of(8,0);
    private static final LocalTime END_SHIFT = LocalTime.of(15,59);

    @Override
    public boolean isAvailable(LocalTime time) {
        return !time.isBefore(START_SHIFT) && !time.isAfter(END_SHIFT);
    }

    @Override
    public String getStartTime() {
        return "08:00";
    }

    @Override
    public String getEndTime() {
        return "15:59";
    }
}
