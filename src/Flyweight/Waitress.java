package Flyweight;

public class Waitress {
    //coffee array
    private static Coffee[] coffees = new Coffee[20];
    //table array
    private static CoffeeContext[] tables = new CoffeeContext[20];
    private static int ordersCount = 0;
    private static CoffeeFactory coffeeFactory;

    public static void takeOrder(String flavorIn, int table) {
        coffees[ordersCount] = coffeeFactory.getCoffeeFlavor(flavorIn);
        tables[ordersCount] = new CoffeeContext(table);
        ordersCount++;
    }
}
