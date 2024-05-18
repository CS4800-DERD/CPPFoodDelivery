import java.util.ArrayList;
import java.util.List;

public class PaleoDiet implements DietaryRestriction {
    @Override
    public List<String> applyDietaryRestrictions(List<String> foods) {
        List<String> allowedFoods = new ArrayList<>();
        for (String food : foods) {
            if (isPaleoFriendly(food)) {
                allowedFoods.add(food);
            }
        }
        return allowedFoods;
    }

    private boolean isPaleoFriendly(String food) {
        String lowercaseFood = food.toLowerCase();

        if (lowercaseFood.contains("cheese") ||
                lowercaseFood.contains("bread") ||
                lowercaseFood.contains("lentils") ||
                lowercaseFood.contains("tofu") ||
                lowercaseFood.contains("sour cream")) {
            return false;
        } else {
            return true;
        }
    }
}