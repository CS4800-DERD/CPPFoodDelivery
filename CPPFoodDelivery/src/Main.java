import java.time.LocalTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Registration with the Platform
        System.out.println("- Registration with the Platform -");

        // Drivers registration
        TimeShift la = new LACountyShift();
        TimeShift orange = new OrangeCountyShift();
        TimeShift sb = new SanBernardinoCountyShift();
        Driver driver1 = new Driver("Daniel", "19939 Gary St", "Los Angeles");
        driver1.setTimeShift(la);
        System.out.println("Driver " + driver1.getName() + " registered with the platform.");

        Driver driver2 = new Driver("Emily", "54321 Oak Ave", "Orange County");
        driver2.setTimeShift(orange);
        System.out.println("Driver " + driver2.getName() + " registered with the platform.");

        Driver driver3 = new Driver("Michael", "98765 Pine St", "San Bernardino County");
        driver3.setTimeShift(sb);
        System.out.println("Driver " + driver3.getName() + " registered with the platform.");

        Driver driver4 = new Driver("Timmy", "760 Glass Dr", "Los Angeles");
        driver4.setTimeShift(la);
        System.out.println("Driver " + driver4.getName() + " registered with the platform.");

        Driver driver5 = new Driver("Tommy", "4457 Compass Ave", "Orange County");
        driver5.setTimeShift(orange);
        System.out.println("Driver " + driver5.getName() + " registered with the platform.");

        Driver driver6 = new Driver("Bobby", "99853 Bean St", "San Bernardino County");
        driver6.setTimeShift(sb);
        System.out.println("Driver " + driver6.getName() + " registered with the platform.");

        Driver driver7 = new Driver("Lou", "119 Turtle Rd", "Los Angeles");
        driver7.setTimeShift(la);
        System.out.println("Driver " + driver7.getName() + " registered with the platform.");

        Driver driver8 = new Driver("Aria", "6969 Robot Ave", "Orange County");
        driver8.setTimeShift(orange);
        System.out.println("Driver " + driver8.getName() + " registered with the platform.");

        // Restaurant registration
        Map<String, Double> menu1 = new HashMap<>();
        menu1.put("Burger", 10.0);
        menu1.put("Pizza", 12.0);

        Map<String, Double> menu2 = new HashMap<>();
        menu2.put("Sushi", 15.0);
        menu2.put("Ramen", 10.0);

        Map<String, Double> menu3 = new HashMap<>();
        menu3.put("Taco", 8.0);
        menu3.put("Burrito", 9.0);

        Map<String, Double> menu4 = new HashMap<>();
        menu4.put("Salad", 8.0);
        menu4.put("Sandwich", 10.0);

        Map<String, Map<String, Double>> meals = new HashMap<>();
        meals.put("Burger", new HashMap<>());
        meals.get("Burger").put("fats", 15.0);
        meals.get("Burger").put("carbs", 30.0);
        meals.get("Burger").put("protein", 25.0);

        meals.put("Pizza", new HashMap<>());
        meals.get("Pizza").put("fats", 10.0);
        meals.get("Pizza").put("carbs", 35.0);
        meals.get("Pizza").put("protein", 20.0);

        meals.put("Salad", new HashMap<>());
        meals.get("Salad").put("fats", 5.0);
        meals.get("Salad").put("carbs", 10.0);
        meals.get("Salad").put("protein", 5.0);

        Restaurant restaurant = new Restaurant("Andys Joint", "13342 Fiver Rd", "Los Angeles", la, "Fast Food", menu1, meals);
        System.out.println("Restaurant " + restaurant.getName() + " registered with the platform.");

        Restaurant restaurant2 = new Restaurant("Sushi Bar", "876 Maple Ave", "Orange County", orange, "Japanese", menu3, meals);
        System.out.println("Restaurant " + restaurant2.getName() + " registered with the platform.");

        Restaurant restaurant3 = new Restaurant("Taco Haven", "456 Elm St", "Los Angeles", la, "Mexican", menu2, meals);
        System.out.println("Restaurant " + restaurant3.getName() + " registered with the platform.");

        Restaurant restaurant4 = new Restaurant("Green Leaf", "987 Oak Lane", "San Bernardino County", sb, "Healthy", menu4, meals);
        System.out.println("Restaurant " + restaurant4.getName() + " registered with the platform.");

        // Customer registration
        Customer customer1 = new Customer("Jill", "19383 Onway Ave", "Los Angeles", "Vegan");
        Customer customer2 = new Customer("David", "7654 Birch St", "Orange County", "Nut Allergy");
        Customer customer3 = new Customer("Sophia", "123 Willow Ave", "Los Angeles", "Paleo");
        Customer customer4 = new Customer("John", "555 Pine Lane", "San Bernardino County", "None");
        Customer customer5 = new Customer("Bob", "521 Lory Ave", "Los Angeles", "Vegan");
        Customer customer6 = new Customer("Chris", "789 Eucalyptus St", "Orange County", "Nut Allergy");
        Customer customer7 = new Customer("Zoe", "5000 Tory St", "Los Angeles", "Paleo");
        Customer customer8 = new Customer("Kirk", "422 Simon Lane", "San Bernardino County", "None");
        Customer customer9 = new Customer("Mike", "96874 Oracle Ave", "Los Angeles", "Vegan");
        Customer customer10 = new Customer("Chuck", "666 Hornet St", "Orange County", "Nut Allergy");


        System.out.println("Customer " + customer1.getName() + " registered with the platform.");
        System.out.println("Customer " + customer2.getName() + " registered with the platform.");
        System.out.println("Customer " + customer3.getName() + " registered with the platform.");
        System.out.println("Customer " + customer4.getName() + " registered with the platform.");
        System.out.println("Customer " + customer5.getName() + " registered with the platform.");
        System.out.println("Customer " + customer6.getName() + " registered with the platform.");
        System.out.println("Customer " + customer7.getName() + " registered with the platform.");
        System.out.println("Customer " + customer8.getName() + " registered with the platform.");
        System.out.println("Customer " + customer9.getName() + " registered with the platform.");
        System.out.println("Customer " + customer10.getName() + " registered with the platform.");


        System.out.println("\n- Customer Ordering Process -");

        // Customer 1 ordering from Restaurant 1
        List<String> restrictedMenu1 = customer1.applyDietaryRestrictions(new ArrayList<>(restaurant.getMenu().keySet()));
        System.out.println("Restricted Menu for " + customer1.getName() + ":");
        for (String item : restrictedMenu1) {
            System.out.println(item + " - $" + restaurant.getMenu().get(item));
        }

        Order order1 = new Order.Builder(restaurant, customer1)
                .addItem(new MenuItem.Builder("Burger").build())
                .addItem(new MenuItem.Builder("Pizza").build())
                .driver(driver1)
                .build(LocalTime.of(8, 0));

        System.out.println("Order placed by " + customer1.getName() + " for Burger and Pizza.");


        // Customer 2 ordering from Restaurant 2
        List<String> restrictedMenu2 = customer2.applyDietaryRestrictions(new ArrayList<>(restaurant2.getMenu().keySet()));
        System.out.println("Restricted Menu for " + customer2.getName() + ":");
        for (String item : restrictedMenu2) {
            System.out.println(item + " - $" + restaurant2.getMenu().get(item));
        }

        Order order2 = new Order.Builder(restaurant2, customer2)
                .addItem(new MenuItem.Builder("Sushi").build())
                .addItem(new MenuItem.Builder("Ramen").build())
                .driver(driver2)
                .build(LocalTime.of(16, 0));

        System.out.println("Order placed by " + customer2.getName() + " for Sushi and Ramen.");


        // Customer 3 ordering from Restaurant 2
        List<String> restrictedMenu3 = customer3.applyDietaryRestrictions(new ArrayList<>(restaurant3.getMenu().keySet()));
        System.out.println("Restricted Menu for " + customer3.getName() + ":");
        for (String item : restrictedMenu3) {
            System.out.println(item + " - $" + restaurant3.getMenu().get(item));
        }

        Order order3 = new Order.Builder(restaurant2, customer3)
                .addItem(new MenuItem.Builder("Taco").build())
                .addItem(new MenuItem.Builder("Burrito").build())
                .driver(driver2)
                .build(LocalTime.of(22, 0));

        System.out.println("Order placed by " + customer3.getName() + " for Taco and Burrito.");

        // Customer 4 ordering from Restaurant 4
        List<String> restrictedMenu4 = customer4.applyDietaryRestrictions(new ArrayList<>(restaurant4.getMenu().keySet()));
        System.out.println("Restricted Menu for " + customer4.getName() + ":");
        for (String item : restrictedMenu4) {
            System.out.println(item + " - $" + restaurant4.getMenu().get(item));
        }

        Order order4 = new Order.Builder(restaurant4, customer4)
                .addItem(new MenuItem.Builder("Salad").build())
                .addItem(new MenuItem.Builder("Sandwich").build())
                .driver(driver3)
                .build(LocalTime.of(00, 0));

        System.out.println("Order placed by " + customer4.getName() + " for Salad and Sandwich.");

        // Customer 5 ordering from Restaurant 1
        List<String> restrictedMenu5 = customer5.applyDietaryRestrictions(new ArrayList<>(restaurant.getMenu().keySet()));
        System.out.println("Restricted Menu for " + customer5.getName() + ":");
        for (String item : restrictedMenu5) {
            System.out.println(item + " - $" + restaurant.getMenu().get(item));
        }

        Order order5 = new Order.Builder(restaurant, customer5)
                .addItem(new MenuItem.Builder("Burger").build())
                .addItem(new MenuItem.Builder("Pizza").build())
                .driver(driver1)
                .build(LocalTime.of(8, 0));

        System.out.println("Order placed by " + customer5.getName() + " for Burger and Pizza.");


        // Customer 6 ordering from Restaurant 2
        List<String> restrictedMenu6 = customer6.applyDietaryRestrictions(new ArrayList<>(restaurant2.getMenu().keySet()));
        System.out.println("Restricted Menu for " + customer6.getName() + ":");
        for (String item : restrictedMenu6) {
            System.out.println(item + " - $" + restaurant2.getMenu().get(item));
        }

        Order order6 = new Order.Builder(restaurant2, customer2)
                .addItem(new MenuItem.Builder("Sushi").build())
                .addItem(new MenuItem.Builder("Ramen").build())
                .driver(driver2)
                .build(LocalTime.of(16, 0));

        System.out.println("Order placed by " + customer6.getName() + " for Sushi and Ramen.");


        // Customer 7 ordering from Restaurant 2
        List<String> restrictedMenu7 = customer7.applyDietaryRestrictions(new ArrayList<>(restaurant3.getMenu().keySet()));
        System.out.println("Restricted Menu for " + customer7.getName() + ":");
        for (String item : restrictedMenu7) {
            System.out.println(item + " - $" + restaurant2.getMenu().get(item));
        }

        Order order7 = new Order.Builder(restaurant2, customer3)
                .addItem(new MenuItem.Builder("Taco").build())
                .addItem(new MenuItem.Builder("Burrito").build())
                .driver(driver2)
                .build(LocalTime.of(23, 5));

        System.out.println("Order placed by " + customer7.getName() + " for Taco and Burrito.");

        // Customer 8 ordering from Restaurant 4
        List<String> restrictedMenu8 = customer8.applyDietaryRestrictions(new ArrayList<>(restaurant4.getMenu().keySet()));
        System.out.println("Restricted Menu for " + customer8.getName() + ":");
        for (String item : restrictedMenu8) {
            System.out.println(item + " - $" + restaurant4.getMenu().get(item));
        }

        Order order8 = new Order.Builder(restaurant4, customer8)
                .addItem(new MenuItem.Builder("Salad").build())
                .addItem(new MenuItem.Builder("Sandwich").build())
                .driver(driver3)
                .build(LocalTime.of(05, 0));

        System.out.println("Order placed by " + customer4.getName() + " for Salad and Sandwich.");

        // Customer 9 ordering from Restaurant 2
        List<String> restrictedMenu9 = customer9.applyDietaryRestrictions(new ArrayList<>(restaurant2.getMenu().keySet()));
        System.out.println("Restricted Menu for " + customer9.getName() + ":");
        for (String item : restrictedMenu9) {
            System.out.println(item + " - $" + restaurant2.getMenu().get(item));
        }

        Order order9 = new Order.Builder(restaurant2, customer8)
                .addItem(new MenuItem.Builder("Taco").build())
                .addItem(new MenuItem.Builder("Burrito").build())
                .driver(driver2)
                .build(LocalTime.of(22, 30));

        System.out.println("Order placed by " + customer9.getName() + " for Taco and Burrito.");


// Customer 10 ordering from Restaurant 1
        List<String> restrictedMenu10 = customer10.applyDietaryRestrictions(new ArrayList<>(restaurant.getMenu().keySet()));
        System.out.println("Restricted Menu for " + customer8.getName() + ":");
        for (String item : restrictedMenu10) {
            System.out.println(item + " - $" + restaurant.getMenu().get(item));
        }

        Order order10 = new Order.Builder(restaurant, customer8)
                .addItem(new MenuItem.Builder("Burger").build())
                .addItem(new MenuItem.Builder("Pizza").build())
                .driver(driver1)
                .build(LocalTime.of(11, 45));

        System.out.println("Order placed by " + customer4.getName() + " for Burger and Pizza.");


        System.out.println("\n- Driver Delivery Process -");

        // Order 1 pickup and delivery
        order1.notifyPickupTime(LocalTime.of(9, 0));
        System.out.println("Order picked up by " + driver1.getName() + " at 09:00.");

        order1.notifyDeliveryTime(LocalTime.of(9, 30));
        System.out.println("Order delivered by " + driver1.getName() + " at 09:30.");

// Order 2 pickup and delivery
        order2.notifyPickupTime(LocalTime.of(10, 30));
        System.out.println("Order picked up by " + driver2.getName() + " at 10:30.");

        order2.notifyDeliveryTime(LocalTime.of(11, 15));
        System.out.println("Order delivered by " + driver2.getName() + " at 11:15.");

// Order 3 pickup and delivery
        order3.notifyPickupTime(LocalTime.of(12, 30));
        System.out.println("Order picked up by " + driver3.getName() + " at 12:30.");

        order3.notifyDeliveryTime(LocalTime.of(13, 15));
        System.out.println("Order delivered by " + driver3.getName() + " at 13:15.");

// Order 4 pickup and delivery
        order4.notifyPickupTime(LocalTime.of(14, 30));
        System.out.println("Order picked up by " + driver1.getName() + " at 14:30.");

        order4.notifyDeliveryTime(LocalTime.of(15, 15));
        System.out.println("Order delivered by " + driver1.getName() + " at 15:15.");

    }
}
