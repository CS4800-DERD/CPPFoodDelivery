import java.time.LocalTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Registration with the Platform
        System.out.println("- Registration with the Platform -");

        // Drivers registration
        TimeShift la = new LACountyShift();
        Driver driver1 = new Driver("Daniel", "19939 Gary St", "Los Angeles");
        driver1.setTimeShift(la);
        System.out.println("Driver " + driver1.getName() + " registered with the platform.");

        // Restaurant registration
        Map<String, Double> menu = new HashMap<>();
        menu.put("Burger", 10.0);
        menu.put("Pizza", 12.0);
        menu.put("Salad", 8.0);

        Map<String, Map<String, Double>> meals = new HashMap<>();
        meals.put("Burger", new HashMap<>());
        meals.get("Burger").put("fats", 15.0);
        meals.get("Burger").put("carbs", 30.0);
        meals.get("Burger").put("protein", 25.0);

        TimeShift orange = new OrangeCountyShift();
        Restaurant restaurant = new Restaurant("Andys Joint", "13342 Fiver Rd", "Los Angeles", la, "Fast Food", menu, meals);
        System.out.println("Restaurant " + restaurant.getName() + " registered with the platform.");

        // Customer registration
        Customer customer = new Customer("Jill", "19383 Onway Ave", "Los Angeles", "Vegan");
        System.out.println("Customer " + customer.getName() + " registered with the platform.");

        // Customer Ordering Process
        System.out.println("\n- Customer Ordering Process -");

        // Customer browsing and ordering
        List<String> restrictedMenu = customer.applyDietaryRestrictions(new ArrayList<>(restaurant.getMenu().keySet()));
        System.out.println("Restricted Menu for " + customer.getName() + ":");
        for (String item : restrictedMenu) {
            System.out.println(item + " - $" + restaurant.getMenu().get(item));
        }

        // Placing an order
        Order order = new Order.Builder(restaurant, customer)
                .addItem(new MenuItem.Builder("Burger").build())
                .addItem(new MenuItem.Builder("Pizza").build())
                .driver(driver1)
                .build(LocalTime.of(8, 0));

        System.out.println("Order placed by " + customer.getName() + " for Burger and Pizza.");

        // Driver Delivery Process
        System.out.println("\n- Driver Delivery Process -");

        // Order pickup
        order.notifyPickupTime(LocalTime.of(9, 0));
        System.out.println("Order picked up by " + driver1.getName() + " at 09:00.");

        // Delivery to customer
        order.notifyDeliveryTime(LocalTime.of(9, 30));
        System.out.println("Order delivered to " + customer.getName() + " at 09:30.");
    }
}
