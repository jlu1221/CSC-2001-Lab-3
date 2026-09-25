package Part1;

public class Circle {
    // instance variable
        // center and radius (point and double)
    private Point center;
    private double radius;
    // method
        // constructor
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    // getCenter method
    public Point getCenter() {
        return center;
    }
    // getRadius method
    public double getRadius() {
        return radius;
    }
}