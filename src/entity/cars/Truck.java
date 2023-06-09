package entity.cars;

import interfaces.Purchase;

public class Truck extends Car implements Purchase {
    private int weight;

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        if (weight > 2000)
            return super.getSalePrice() * 0.90;
        return super.getSalePrice();
    }

    @Override
    public String getPurchaseInfo() {
        return "TRUCK: ";
    }

    @Override
    public String toString() {
        return "Truck{" +
                "speed = " + super.getSpeed() + "," + '\n' +
                "regularPrice = " + super.getRegularPrice() + "," + '\n' +
                "color = " + super.getColor() + "," + '\n' +
                "weight = " + weight +
                '}';
    }
}
