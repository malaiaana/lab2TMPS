package Decorator;

public class LeatherInterior extends CarDecorator {
    public LeatherInterior(Car car) {
        super(car);
    }

    public int getPrice() {
        return car.getPrice() + 3000;
    }

    public String getDescription() {
        return car.getDescription() + " with leather interior";
    }
}
