import java.util.ArrayList;
import java.util.List;

public class VeganDiet implements DietaryRestriction {
    @Override
    public List<String> applyDietaryRestrictions(List<String> foods) {
        List<String> allowedFoods = new ArrayList<>();
        for (String food : foods) {
            if (isVeganFriendly(food)) {
                allowedFoods.add(food);
            }
        }
        return allowedFoods;
    }

    private boolean isVeganFriendly(String food) {
        String lowercaseFood = food.toLowerCase();

        if (lowercaseFood.contains("fish") ||
                lowercaseFood.contains("chicken") ||
                lowercaseFood.contains("tuna") ||
                lowercaseFood.contains("cheese") ||
                lowercaseFood.contains("sour cream")) {
            return false;
        } else {
            return true;
        }
    }
}
