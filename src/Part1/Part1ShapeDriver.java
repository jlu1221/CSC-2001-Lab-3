package Part1;

import java.util.ArrayList;

public class Part1ShapeDriver {
    // methods
    // main
    public static void main(String[] args) {
        // array of Circle that holds 3 objects
        Circle[] circles = {
                new Circle(new Point(2, 3), 5),
                new Circle(new Point(1,2), 3),
                new Circle(new Point(6, 7), 8)
        };
        // array of Rectangle that hold 3 objects
        Rectangle[] rectangles = {
                new Rectangle(new Point(1,2), new Point(3, 4)),
                new Rectangle(new Point(3, 4), new Point(5,6)),
                new Rectangle(new Point(10,12), new Point(15,20))
        };
        // arraylist that holds perimeter and area of each shape
        ArrayList<Double> computedList = new ArrayList<>();

        // Circles
        computedList.add(Utility.perimeter(circles[0]));
        computedList.add(Utility.area(circles[0]));

        computedList.add(Utility.perimeter(circles[1]));
        computedList.add(Utility.area(circles[1]));

        computedList.add(Utility.perimeter(circles[2]));
        computedList.add(Utility.area(circles[2]));

        // Rectangles
        computedList.add(Utility.perimeter(rectangles[0]));
        computedList.add(Utility.area(rectangles[0]));

        computedList.add(Utility.perimeter(rectangles[1]));
        computedList.add(Utility.area(rectangles[1]));

        computedList.add(Utility.perimeter(rectangles[2]));
        computedList.add(Utility.area(rectangles[2]));


        }
        // print largest and smallest value of the AL
    }
    // smallLarge method
        // AL of computedList
        // return smallest and largest value of the AL as array of double
}
