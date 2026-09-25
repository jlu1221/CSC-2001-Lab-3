package Part1;

public class Utility {
    // methods
    // perimeterCircle() method
    public static double perimeter(Circle circle) {
        return 2 * Math.PI * circle.getRadius();
    }
    // areaCircle() method
    public static double area(Circle circle) {
        return Math.PI * Math.pow(circle.getRadius(), 2);
    }

    // perimeterRectangle()
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
