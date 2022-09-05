package com.vlad.javaProject01;

public class MainClass {
     public static void main(String[] args) {
        // Creating a point.
        Point center1 = new Point(1.0, 2.0);
        System.out.println("Center point: "+ center1 + "\n");
        System.out.println(" getX() -> " + center1.getX() + "\n");
        System.out.println(" getY() -> " + center1.getY() + "\n");
        // Creating a circle.
        Circle circle1 = new Circle(center1, 3.5);
        System.out.println("Circle parameters:\n"+ circle1 + "\n");
        System.out.println(" getRadius -> " + circle1.getRadius() + "\n");
        System.out.println(" getCenter -> " + circle1.getCenter() + "\n");

     }
}
class Point {
    // This class defines a point in the X,Y cartesian plain.
    // 1. Defines parameters or values.
    double x;
    double y;
    // 2. Define the constructor:
    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }
    // 3. Define getters.
    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    // 4. Define toString()
    public String toString() {
        return String.format("( %f, %f )\n", this.x, this.y);
    }
}

class Circle {
    // Defines a circle with center in a defined point and specified radius size.
    // 1. Defines parameters or variables.
    Point center;
    double radius;
    // 2. Define class constructor.
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }
    // 3. Define getters.
    public Point getCenter() {
        return  this.center;
    }
    public double getRadius() {
        return this.radius;
    }
    // 4. Define toString method.
    public String toString() {
        String line0 = "------------------------------"+"\n";
        String line1 = "Circle radius: "+ this.radius + "\n";
        String line2 = "Circle center: " + this.center +"\n";
        return line0+line1+line2+line0 ;
    }
}