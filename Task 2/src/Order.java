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
    public void addScoop(IceCreamFlavor flavor, int quantity) {
        for (int i = 0; i < quantity; i++) {
            scoops.add(flavor);
        }
    }
    public void addTopping(Topping topping, int quantity) {
        for (int i = 0; i < quantity; i++) {
            toppings.add(topping);
        }
    }
}