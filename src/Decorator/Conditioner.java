package Decorator;

public class Conditioner extends CarDecorator {
    public Conditioner(Car car) {
        super(car);
    }

    public int getPrice() {
        return car.getPrice() + 2000;
    }

    public String getDescription() {
        return car.getDescription() + " with conditioner";
    }
}
