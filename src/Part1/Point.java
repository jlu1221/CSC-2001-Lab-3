package Part1;

public class Point {
    // Instance variable
        // x and y which is a double
    private double x;
    private double y;
    // method
        // constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
        // getters and setters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
        // non-static rotate
    // Purpose: This method return a Point on the circle after swaping the coordinate (-y, x)
    // Example: rotate(3, 4) -> rotate(-4, 3)
    public Point rotate() {
        return new Point(-y, x);
    }
}
