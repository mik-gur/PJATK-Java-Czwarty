package tests;

import entity.maths.Circle;
import entity.maths.Cylinder;

public class TestCircleAndCylinder {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle();
        System.out.println("Circle1 radius: " + circle1.getRadius());
        System.out.println("Circle1 color: " + circle1.getColor());
        System.out.println("Circle1 area: " + circle1.getArea());
        System.out.println(circle1);
        System.out.println('\n');

        System.out.println("Circle2 radius: " + circle2.getRadius());
        System.out.println("Circle2 color: " + circle2.getColor());
        System.out.println("Circle2 color: " + circle2.getArea());
        System.out.println(circle2);
        System.out.println('\n');


        Cylinder cylinder1 = new Cylinder();
        Cylinder cylinder2 = new Cylinder(3.0);
        Cylinder cylinder3 = new Cylinder(6.0, 8.0);
        System.out.println("Cylinder1 height: " + cylinder1.getHeight());
        System.out.println("Cylinder1 volume: " + cylinder1.getVolume());
        System.out.println("Cylinder1 radius: " + cylinder1.getRadius());
        System.out.println("Cylinder1 color: " + cylinder1.getColor());
        System.out.println("Cylinder1 area: " + cylinder1.getArea());
        System.out.println(cylinder1);
        System.out.println('\n');


        System.out.println("Cylinder2 height: " + cylinder2.getHeight());
        System.out.println("Cylinder2 volume: " + cylinder2.getVolume());
        System.out.println("Cylinder2 radius: " + cylinder2.getRadius());
        System.out.println("Cylinder2 color: " + cylinder2.getColor());
        System.out.println("Cylinder2 area: " + cylinder2.getArea());
        System.out.println(cylinder2);
        System.out.println('\n');


        System.out.println("Cylinder3 height: " + cylinder3.getHeight());
        System.out.println("Cylinder3 volume: " + cylinder3.getVolume());
        System.out.println("Cylinder3 radius: " + cylinder3.getRadius());
        System.out.println("Cylinder3 color: " + cylinder3.getColor());
        System.out.println("Cylinder3 area: " + cylinder3.getArea());
        System.out.println(cylinder3);
        System.out.println('\n');
    }
}
