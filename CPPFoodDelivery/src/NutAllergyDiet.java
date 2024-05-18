import java.util.ArrayList;
import java.util.List;

public class NutAllergyDiet implements DietaryRestriction {
    @Override
    public List<String> applyDietaryRestrictions(List<String> foods) {
        List<String> allowedFoods = new ArrayList<>();
        for (String food : foods) {
            if (isNutAllergyFriendly(food)) {
                allowedFoods.add(food);
            }
        }
        return allowedFoods;
    }

    private boolean isNutAllergyFriendly(String food) {
        String lowercaseFood = food.toLowerCase();

        if (lowercaseFood.contains("pistachio") ||
                lowercaseFood.contains("peanuts")) {
            return false;
        } else {
            return true;
        }
    }
}