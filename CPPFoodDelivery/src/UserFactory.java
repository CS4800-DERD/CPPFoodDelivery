import java.util.Map;
public class UserFactory {
    public static User createUser(String type, String name, String address, String county, String dietaryRestriction, TimeShift operatingHours, String cuisine, Map<String, Double> menu, Map<String, Map<String, Double>> meals) {
        switch (type) {
            case "Customer":
                return new Customer(name, address, county, dietaryRestriction);
            case "Restaurant":
                return new Restaurant(name, address, county, operatingHours, cuisine, menu, meals);
            case "Driver":
                return new Driver(name, address, county);
            default:
                throw new IllegalArgumentException("Invalid user type: " + type);
        }
    }
}