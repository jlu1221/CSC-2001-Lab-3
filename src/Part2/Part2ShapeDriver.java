package Part2;

import Part1.Point;

import java.util.ArrayList;

public class Part2ShapeDriver {
    // methods
    // main
    public static void main(String[] args) {
        // array of Circle that holds 3 objects
        Circle[] circles  = {
                new Circle(new Point(2, 3), 5),
                new Circle(new Point(1, 2), 3),
                new Circle(new Point(6, 7), 8)
        };
        // array of Rectangle that hold 3 objects
        Rectangle[] rectangles = {
                new Rectangle(new Point(1, 2), new Point(3, 4)),
                new Rectangle(new Point(3, 4), new Point(5, 6)),
                new Rectangle(new Point(10, 12), new Point(15, 20))
        };
        // arraylist that holds perimeter and area of each shape
        ArrayList<Double> computedList = new ArrayList<>();

        // Circles
        computedList.add(circles[0].perimeter());
        computedList.add(circles[0].area());

        computedList.add(circles[1].perimeter());
        computedList.add(circles[1].area());

        computedList.add(circles[2].perimeter());
        computedList.add(circles[2].area());

        // Rectangles
        computedList.add(rectangles[0].perimeter());
        computedList.add(rectangles[0].area());

        computedList.add(rectangles[2].perimeter());
        computedList.add(rectangles[2].area());

        computedList.add(rectangles[2].perimeter());
        computedList.add(rectangles[2].area());


        // print largest and smallest value of the AL
        double[] result = smallLarge(computedList);

        System.out.println("Largest: " + result[1]);
        System.out.println("Smallest: " + result[0]);
    }

    // smallLarge method
    // AL of computedList
    public static double[] smallLarge(ArrayList<Double> list) {
        // return smallest and largest value of the AL as array of double
        double smallest = list.get(0);
        double largest = list.get(0);
        // Check every value in the list and take notes of each one
        for (double value : list) {
            // Compare the current value to the smallest, if value is smaller, then return that value as the smaller
            if (value < smallest) {
                smallest = value;
            }
            // Compare the current value to the largest, if the value is larger, then return that value as the largest
            if (value > largest) {
                largest = value;
            }
        }

        return new double[]{smallest, largest};
    }
}

