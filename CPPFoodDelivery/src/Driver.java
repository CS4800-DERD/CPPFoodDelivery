public class Driver implements User {
    private TimeShift timeShift;
    private String name;
    private String address;
    private String county;

    public Driver(String name, String address, String county) {
        this.name = name;
        this.address = address;
        this.county = county;
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
}

