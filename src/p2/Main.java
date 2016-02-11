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
        Point2D pt1 = new Point2D(6.2, 5.3);
        Point2D pt2 = new Point2D(2.2, 7.3);

        double a = pt1.distance(pt2);

        System.out.printf("Distance = %f", a);
    }
}
