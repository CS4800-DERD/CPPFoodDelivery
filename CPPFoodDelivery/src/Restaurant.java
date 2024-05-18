import java.util.Map;
import java.time.LocalTime;

public class Restaurant implements User {
    private String name;
    private String address;
    private String county;
    private TimeShift operatingHours;
    private String cuisine;
    private Map<String, Double> menu;
    //key(string) is meal name and value(Double) is the price
    private Map<String, Map<String, Double>> meals;
    // Meals with nutritional information

    public Restaurant(String name, String address, String county, TimeShift operatingHours, String cuisine, Map<String, Double> menu, Map<String, Map<String, Double>> meals) {
        this.name = name;
        this.address = address;
        this.county = county;
        this.operatingHours = operatingHours;
        this.cuisine = cuisine;
        this.menu = menu;
        this.meals = meals;
    }

    public boolean isAvailable(LocalTime time) {
        LocalTime openingTime = LocalTime.parse(operatingHours.getStartTime());
        LocalTime closingTime = LocalTime.parse(operatingHours.getEndTime());
        return !time.isBefore(openingTime) && !time.isAfter(closingTime);
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
    public String getCuisine() {
        return cuisine;
    }
    public String getOpeningTime() {
        return operatingHours.getStartTime();
    }
    public String getClosingTime() {
        return operatingHours.getEndTime();
    }
    public Map<String, Double> getMenu() {
        return menu;
    }
    public Map<String, Map<String, Double>> getMeals() {
        return meals;
    }

}

