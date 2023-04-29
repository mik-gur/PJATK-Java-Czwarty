package entity.maths;

public class Cylinder extends Circle {
    private double height = 4.0;

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
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height = " + height + "," + '\n' +
                "radius = " + super.getRadius() + "," + '\n' +
                "color = " + super.getColor() + "," + '\n' +
                "volume = " + getVolume() + "," + '\n' +
                "area = " + super.getArea() + '\n' +
                '}';
    }
}
