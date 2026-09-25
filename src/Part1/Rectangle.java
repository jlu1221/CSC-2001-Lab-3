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
    public Point getTopLeft() {
        return topLeft;
    }
    // getBottomRight() method
    public Point getBottomRight() {
        return bottomRight;
    }
}
