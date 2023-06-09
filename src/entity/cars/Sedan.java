package entity.cars;

import interfaces.Purchase;

public class Sedan extends Car implements Purchase {
    private int length;

    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    @Override
    public double getSalePrice() {
        if (length > 20)
            return super.getSalePrice() * 0.95;
        return super.getSalePrice() * 0.90;
    }

    @Override
    public String getPurchaseInfo() {
        return "SEDAN: ";
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "speed = " + super.getSpeed() + "," + '\n' +
                "regularPrice = " + super.getRegularPrice() + "," + '\n' +
                "color = " + super.getColor() + "," + '\n' +
                "length = " + length +
                '}';
    }
}
