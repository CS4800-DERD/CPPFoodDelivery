import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Topping implements Meal{
    private Meal decoratedMeal;
    private String toppingName;
    private double toppingFats;
    private double toppingCarbs;
    private double toppingProtein;

    private List<String> optionalToppings;

    public Topping(Meal decoratedMeal, String toppingName, double toppingFats, double toppingCarbs, double toppingProtein){
        this.decoratedMeal = decoratedMeal;
        this.toppingName = toppingName;
        this.toppingFats = toppingFats;
        this.toppingCarbs = toppingCarbs;
        this.toppingProtein = toppingProtein;
        this.optionalToppings = new ArrayList<>(decoratedMeal.getOptionalToppings());
        this.optionalToppings.add(toppingName);
    }

    public String getDescription(){
        return decoratedMeal.getDescription() + ", " + toppingName;
    }

    @Override
    public double getFats() {
        return decoratedMeal.getFats() + toppingFats;
    }

    @Override
    public double getCarbs() {
        return decoratedMeal.getCarbs() + toppingCarbs;
    }

    @Override
    public double getProtein() {
        return decoratedMeal.getProtein() + toppingProtein;
    }

    @Override
    public List<String> getOptionalToppings(){
        return optionalToppings;
    }

}
