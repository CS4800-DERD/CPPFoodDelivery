import java.util.Map;

public class Restaurant implements User {
    private String name;
    private String address;
    private String county;
    private String operatingHours;
    private String cuisine;
    private Map<String, Double> menu;
    //key(string) is meal name and value(Double) is the price
    private Map<String, Map<String, Double>> meals;
    // Meals with nutritional information

    public Restaurant(String name, String address, String county, String operatingHours, String cuisine, Map<String, Double> menu, Map<String, Map<String, Double>> meals) {
        this.name = name;
        this.address = address;
        this.county = county;
        this.operatingHours = operatingHours;
        this.cuisine = cuisine;
        this.menu = menu;
        this.meals = meals;
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
    public String getOperatingHours() {
        return operatingHours;
    }
    public String getCuisine() {
        return cuisine;
    }
    public Map<String, Double> getMenu() {
        return menu;
    }
    public Map<String, Map<String, Double>> getMeals() {
        return meals;
    }
}

