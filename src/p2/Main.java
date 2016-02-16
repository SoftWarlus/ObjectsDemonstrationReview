package p2;

/*
 * Basic object exercise
 * CSC 164-402
 * Uros Vorkapic
 * Feb 11, '16
 * Version 0.1
 */

import javafx.geometry.Point2D;

public class Main {

    public static void main(String[] arg) {
        // Define two points
        Point2D pt1 = new Point2D(4, 0);
        Point2D pt2 = new Point2D(0, 3);

        // Print information about the points
        System.out.println(pt1.toString());
        System.out.println(pt2.toString());

        // Find the hypotenuse
        double hyp = pt1.distance(pt2);

        // Print the hypotenuse
        System.out.printf("Hypotenuse = %.1f", hyp);
    }
}
