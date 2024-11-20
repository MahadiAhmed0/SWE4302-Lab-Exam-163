import java.util.ArrayList;
import java.util.List;

class Order {
    private List<IceCreamFlavor> scoops;
    private List<Topping> toppings;
    private Container container;
    private double taxRate;

    public List<IceCreamFlavor> getScoops() {
        return scoops;
    }

    public void setScoops(List<IceCreamFlavor> scoops) {
        this.scoops = scoops;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

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

    public double calculateTotal() {
        double total = 0.0;

        for (IceCreamFlavor scoop : scoops) {
            total += scoop.getPrice();
        }

        for (Topping topping : toppings) {
            total += topping.getPrice();
        }

        if (container != null) {
            total += container.getPrice();
        }

        total += total * taxRate;

        return total;
    }
    
}