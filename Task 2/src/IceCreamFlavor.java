public enum IceCreamFlavor {
    MINT_CHOCOLATE_CHIP(2.80),
    CHOCOLATE_FUDGE(3.00),
    STRAWBERRY_SWIRL(2.75),
    PISTACHIO_DELIGHT(3.25);

    private final double price;

    IceCreamFlavor(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
