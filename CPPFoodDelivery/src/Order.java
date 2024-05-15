import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private Restaurant restaurant;
    private Customer customer;
    private List<MenuItem> items;
    private Driver driver;
    private LocalDateTime creationTime;
    private LocalDateTime pickupTime;
    private LocalDateTime deliveryTime;

    private Order(Builder builder) {
        this.restaurant = builder.restaurant;
        this.customer = builder.customer;
        this.items = builder.items;
        this.driver = builder.driver;
        this.creationTime = builder.creationTime;
        this.pickupTime = builder.pickupTime;
        this.deliveryTime = builder.deliveryTime;
    }

    public static class Builder {
        private Restaurant restaurant;
        private Customer customer;
        private List<MenuItem> items = new ArrayList<>();
        private Driver driver;
        private LocalDateTime creationTime;
        private LocalDateTime pickupTime;
        private LocalDateTime deliveryTime;

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

        public Builder creationTime(LocalDateTime creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        public Builder pickupTime(LocalDateTime pickupTime) {
            this.pickupTime = pickupTime;
            return this;
        }

        public Builder deliveryTime(LocalDateTime deliveryTime) {
            this.deliveryTime = deliveryTime;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}
