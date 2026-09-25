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
    public Point rotate() {
        return new Point(-y, x);
    }
}
