public class CPPFoodDelivery {
    public static CPPFoodDelivery instance;

    private CPPFoodDelivery() {}

    public static CPPFoodDelivery getInstance() {
        if (instance == null) {
            instance = new CPPFoodDelivery();
        }
        return instance;
    }

    public void placeOrder (Order order){
        // logic for placing the order
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}