import java.util.ArrayList;
import java.util.List;

public class NoRestriction implements DietaryRestriction {
    @Override
    public List<String> applyDietaryRestrictions(List<String> foods) {
        return new ArrayList<>(foods);
    }
}
