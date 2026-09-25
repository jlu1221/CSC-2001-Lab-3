package Part1;

public class Utility {
    // methods
    // perimeterCircle() method
    // Purpose: this method return a double of the perimeter of the circle
    // Example: perimeter(Circle(Point(1,2), 5)) -> 2pi(5) = 10pi
    public static double perimeter(Circle circle) {
        return 2 * Math.PI * circle.getRadius();
    }
    // areaCircle() method
    // Purpose: this method return a double of the area of the circle
    // Example: perimeter(Circle(Point(1,2), 5)) -> pi(5**2) = 25pi
    public static double area(Circle circle) {
        return Math.PI * Math.pow(circle.getRadius(), 2);
    }

    // perimeterRectangle()
    // Purpose: this method return a double of the perimeter of the rectangle
    // Example: perimeter(Rectangle(Point(1,2), Point(3,4)) -> (3-1)*2 + (4-2)*2 = 8
    public static double perimeter(Rectangle rectangle) {
        // Check width of the Rectangle
        double width = Math.abs(rectangle.getBottomRight().getX() -
                rectangle.getTopLeft().getX());
        // Check height of the Rectangle
        double height = Math.abs(rectangle.getBottomRight().getY() -
                rectangle.getTopLeft().getY());

        // return the perimeter (2W + 2H)
        return 2 * width + 2 * height;
    }
    // areaRectangle()
    // Purpose: this method return a double of the area of the rectangle
    // Example: perimeter(Rectangle(Point(1,2), Point(3,4)) -> 2 * 2 = 4
    public static double area(Rectangle rectangle) {
        // Check width of Rectangle
        double width = Math.abs(rectangle.getBottomRight().getX() -
                rectangle.getTopLeft().getX());
        // Check height of Rectangle
        double height = Math.abs(rectangle.getBottomRight().getY() -
                rectangle.getTopLeft().getY());

        // return the area (L * H)
        return width * height;
    }
}
