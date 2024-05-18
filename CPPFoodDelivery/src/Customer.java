import java.util.*;
 class Customer implements User, Notification {
     private String name;
     private String address;
     private String county;
     private String dietaryRestriction;
     private DietaryRestriction restrictionStrategy;

     public Customer(String name, String address, String county, String dietaryRestriction) {
         this.name = name;
         this.address = address;
         this.county = county;
         this.dietaryRestriction = dietaryRestriction;

         switch(dietaryRestriction) {
             case "No Restriction":
                 restrictionStrategy = new NoRestriction();
                 break;
             case "Paleo":
                 restrictionStrategy = new PaleoDiet();
                 break;
             case "Vegan":
                 restrictionStrategy = new VeganDiet();
                 break;
             case "Nut Allergy":
                 restrictionStrategy = new NutAllergyDiet();
                 break;
             case "None":
                 restrictionStrategy = new NoRestriction(); // Or handle "None" differently based on your logic
                 break;
             default:
                 throw new IllegalArgumentException("Invalid dietary restriction: " + dietaryRestriction);
         }
     }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getCounty() {
        return county;
    }

    public String getDietaryRestriction() {
        return dietaryRestriction;
    }

    @Override
    public void update(String message) {
        System.out.println("Notification for " + name + ": " + message);
    }

    public List<String> applyDietaryRestrictions(List<String> menuFoods) {
        return restrictionStrategy.applyDietaryRestrictions(menuFoods);
    }
}
