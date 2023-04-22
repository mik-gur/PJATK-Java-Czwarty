package entity;

public class Cylinder extends Circle {
    private double height = 4.0;
    private double volume = 2.2;

    public Cylinder() {
    }

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", volume=" + volume +
                '}';
    }
}
