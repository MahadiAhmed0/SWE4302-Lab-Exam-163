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

    public String generateInvoice() {
        StringBuilder invoice = new StringBuilder("Ice Cream Shop Invoice\n");
        double subtotal = 0.0;

        for (IceCreamFlavor scoop : scoops) {
            invoice.append(scoop.name()).append(" - 1 scoop: $").append(String.format("%.2f", scoop.getPrice())).append("\n");
            subtotal += scoop.getPrice();
        }

        for (Topping topping : toppings) {
            invoice.append(topping.name()).append(" - 1 time: $").append(String.format("%.2f", topping.getPrice())).append("\n");
            subtotal += topping.getPrice();
        }

        if (container != null) {
            invoice.append(container.getName()).append(": $").append(String.format("%.2f", container.getPrice())).append("\n");
            subtotal += container.getPrice();
        }

        double tax = subtotal * taxRate;
        double total = subtotal + tax;

        invoice.append("Subtotal: $").append(String.format("%.2f", subtotal)).append("\n");
        invoice.append("Tax: $").append(String.format("%.2f", tax)).append("\n");
        invoice.append("Total Amount Due: $").append(String.format("%.2f", total));

        return invoice.toString();
    }

}