package Part1;

public class Rectangle {
    // instance variable
        // topLeft and bottomRight
    private Point topLeft;
    private Point bottomRight;

    // method
        // constructor
    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // getTopLeft() method
    // Purpose: this method return a Point of the topLeft Point of the rectangle
    // Example: (Point(1, 2), Point(3, 4) -> Point(1,2)
    public Point getTopLeft() {
        return topLeft;
    }
    // getBottomRight() method
    // Purpose: this method return a Point of the bottomRight Point of the rectangle
    // Example: (Point(1, 2), Point(3, 4) -> Point(3,4)
    public Point getBottomRight() {
        return bottomRight;
    }
}
