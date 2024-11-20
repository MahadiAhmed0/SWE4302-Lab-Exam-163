abstract class Container {
    String name;
    double price;

    public Container(String name, double price){
        this.name = name;
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }
}
