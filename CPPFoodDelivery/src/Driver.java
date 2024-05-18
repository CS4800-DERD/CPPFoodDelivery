import java.time.LocalTime;

public class Driver implements User {
    private TimeShift timeShift;
    private String name;
    private String address;
    private String county;
    private Order currentOrder;

    public Driver(String name, String address, String county) {
        this.name = name;
        this.address = address;
        this.county = county;
    }

    public boolean isAvailable(LocalTime time) {
        if (timeShift == null) {
            return false;
        }
        LocalTime startTime = LocalTime.parse(timeShift.getStartTime());
        LocalTime endTime = LocalTime.parse(timeShift.getEndTime());
        return !time.isBefore(startTime) && !time.isAfter(endTime);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getCounty() {
        return county;
    }

    public String getStartTime() {
        return timeShift.getStartTime();
    }

    public String getEndTime() {
        return timeShift.getEndTime();
    }

    public void setTimeShift(TimeShift timeShift) {
        this.timeShift = timeShift;
    }

    public Order getCurrentOrder() {
        return currentOrder;
    }

    public void setCurrentOrder(Order currentOrder) {
        this.currentOrder = currentOrder;
    }
}
