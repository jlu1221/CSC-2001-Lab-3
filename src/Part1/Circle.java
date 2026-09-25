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
    // Purpose: This method return the center point of the circle
    // Example: (Point(3, 5), 6) -> Point(3, 5)
    public Point getCenter() {
        return center;
    }
    // getRadius method
    // Purpose: This method return the radius of the circle in a double
    // Example: (Point(3,5), 7) -> 7
    public double getRadius() {
        return radius;
    }
}