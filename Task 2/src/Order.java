import java.util.ArrayList;
import java.util.List;

class Order {
    private List<IceCreamFlavor> scoops;
    private List<Topping> toppings;
    private Container container;
    private double taxRate;

    public Order() {
        scoops = new ArrayList<>();
        toppings = new ArrayList<>();
        taxRate = 0.08; 
    }
}