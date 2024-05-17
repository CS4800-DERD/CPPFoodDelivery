import java.util.ArrayList;
import java.util.List;

public class MenuItem implements Meal{
    private String name;
    private double fats;
    private double carbs;
    private double protein;
    private List<String> optionalToppings;

    private MenuItem(Builder builder) {
        this.name = builder.name;
        this.fats = builder.fats;
        this.carbs = builder.carbs;
        this.protein = builder.protein;
        this.optionalToppings = builder.optionalToppings;
    }

    public String getDescription(){
        return name + " " + getFats() + " " + getCarbs() + " " + getProtein() + " " + getOptionalToppings();
    }

    @Override
    public double getFats() {
        return fats;
    }

    @Override
    public double getCarbs() {
        return carbs;
    }

    @Override
    public double getProtein() {
        return protein;
    }
    @Override
    public List<String> getOptionalToppings(){
        return optionalToppings;
    }

    public static class Builder {
        private String name;
        private double fats;
        private double carbs;
        private double protein;
        private List<String> optionalToppings = new ArrayList<>();

        public Builder(String name) {
            this.name = name;
        }

        public Builder fats(double fats) {
            this.fats = fats;
            return this;
        }

        public Builder carbs(double carbs) {
            this.carbs = carbs;
            return this;
        }

        public Builder protein(double protein) {
            this.protein = protein;
            return this;
        }

        public Builder addTopping(String topping) {
            this.optionalToppings.add(topping);
            return this;
        }

        public MenuItem build() {
            return new MenuItem(this);
        }
    }
}
