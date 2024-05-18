import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private Restaurant restaurant;
    private Customer customer;
    private List<MenuItem> items;
    private Driver driver;
    private LocalTime creationTime;
    private LocalTime pickupTime;
    private LocalTime deliveryTime;

    private Order(Builder builder, LocalTime currentTime) {
        this.restaurant = builder.restaurant;
        this.customer = builder.customer;
        this.items = builder.items;
        this.driver = builder.driver;
        this.creationTime = currentTime;
        notifyCustomer("Order Placed at " + creationTime);
    }

    public static class Builder {
        private Restaurant restaurant;
        private Customer customer;
        private List<MenuItem> items = new ArrayList<>();
        private Driver driver;

        public Builder(Restaurant restaurant, Customer customer) {
            this.restaurant = restaurant;
            this.customer = customer;
        }

        public Builder addItem(MenuItem item) {
            this.items.add(item);
            return this;
        }

        public Builder driver(Driver driver) {
            this.driver = driver;
            return this;
        }

        public Order build(LocalTime currentTime) {
            if (!restaurant.isAvailable(currentTime)) {
                throw new IllegalArgumentException("Order can't be place, Restaurant not open.");
            }
            if (!driver.isAvailable(currentTime)) {
                throw new IllegalArgumentException("Order can't be place, Driver not available.");
            }
            return new Order(this, currentTime);
        }
    }

    private void notifyCustomer(String message) {
        if (customer != null) {
            customer.update(message);
        }
    }

    public void notifyPickupTime(LocalTime pickupTime) {
        this.pickupTime = pickupTime;
        notifyCustomer("Order Picked Up at " + pickupTime);
    }

    public void notifyDeliveryTime(LocalTime deliveryTime) {
        this.deliveryTime = deliveryTime;
        notifyCustomer("Order Delivered at " + deliveryTime);
    }
}