package entity.maths;

public class Circle {
    private double radius = 1.0;
    private String color = "blue";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius = " + radius + "," + '\n' +
                "color = " + color + "," + '\n' +
                "area = " + getArea() + '\n' +
                '}';
    }
}
