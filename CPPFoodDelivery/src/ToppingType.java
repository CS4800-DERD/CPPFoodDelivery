public enum ToppingType {
    CHEESE("Cheese", 5.0, 1.0, 7.0),
    AVOCADO("Avocado", 15.0, 10.0, 3.0),
    BACON("Bacon", 10.0, 1.0, 12.0);

    private final String name;
    private final double fats;
    private final double carbs;
    private final double protein;

    ToppingType(String name, double fats, double carbs, double protein) {
        this.name = name;
        this.fats = fats;
        this.carbs = carbs;
        this.protein = protein;
    }

    public String getName() {
        return name;
    }

    public double getFats() {
        return fats;
    }

    public double getCarbs() {
        return carbs;
    }

    public double getProtein() {
        return protein;
    }
}
