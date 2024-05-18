import java.util.List;
public interface Meal {
    String getDescription();
    double getFats();
    double getCarbs();
    double getProtein();
    List<ToppingType> getOptionalToppings();
}
