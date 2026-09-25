package Part2;

import Part1.Point;

public class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    // getCenter() method
    // Purpose: This method return the center point of the circle
    // Example: (Point(3, 5), 6) -> Point(3, 5)
    public Point getCenter() {
        return center;
    }

    // getRadius() method
    // Purpose: This method return the radius of the circle in a double
    // Example: (Point(3,5), 7) -> 7
    public double getRadius() {
        return radius;
    }

    // perimeter() method
    // Purpose: this method return a double of the perimeter of the circle
    // Example: perimeter(Circle(Point(1,2), 5)) -> 2pi(5) = 10pi
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    // area() method
    // Purpose: this method return a double of the area of the circle
    // Example: perimeter(Circle(Point(1,2), 5)) -> pi(5**2) = 25pi
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
