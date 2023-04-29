package entity.cars;

import interfaces.Purchase;

public class Ford extends Car implements Purchase {
    private int year;
    private int manufacturerDiscount;

    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    @Override
    public double getSalePrice() {
        return super.getSalePrice() - manufacturerDiscount;
    }

    @Override
    public String getPurchaseInfo() {
        return "FORD: ";
    }

    @Override
    public String toString() {
        return "Ford{" +
                "speed = " + super.getSpeed() + "," + '\n' +
                "regularPrice = " + super.getRegularPrice() + "," + '\n' +
                "color = " + super.getColor() + "," + '\n' +
                "year = " + year + "," + '\n' +
                "manufacturerDiscount = " + manufacturerDiscount +
                '}';
    }
}
