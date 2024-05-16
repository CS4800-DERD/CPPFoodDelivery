public class Customer implements User, Notification {
    private String name;
    private String address;
    private String county;
    private String dietaryRestriction;

    public Customer(String name, String address, String county, String dietaryRestriction) {
        this.name = name;
        this.address = address;
        this.county = county;
        this.dietaryRestriction = dietaryRestriction;
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
    public String getDietaryRestriction() {
        return dietaryRestriction;
    }

    @Override
    public void update(String message) {
        System.out.println("Notification for " + name + ": " + message);
    }
}
