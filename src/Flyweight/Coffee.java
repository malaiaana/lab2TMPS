package Flyweight;

public class Coffee {
    private final String flavor;

    public Coffee(String newFlavor) {
        this.flavor = newFlavor;
        System.out.println("Coffee is created! - " + flavor);
    }

    public String getFlavor() {
        return this.flavor;
    }

    public void serveCoffee(CoffeeContext context) {
        System.out.println("Serving " + flavor + " to table " + context.getTable());
    }
}
