package p1;

/*
 * Basic object exercise
 * CSC 164-402
 * Uros Vorkapic
 * Feb 11, '16
 * Version 0.1
 */

public class Main {

    public static void main(String[] args) {

        Balloon[] things = new Balloon[5];

        // Create first balloon
	    things[0] = new Balloon();

        // Create second balloon
        things[1] = new Balloon(12, "red");

        // Create second balloon
        things[2] = new Balloon(6, "orange");

        // Print properties of the balloons
        for (Balloon each : things) {
            if (each != null) {
                System.out.println(each);
            }
        }
        System.out.printf("number produced: %d%n", Balloon.getQuantity());

        // Destroy a balloon
        Balloon.destruct(1, things);

        System.out.printf("remaining balloons: %d%n", Balloon.getQuantity());
    }
}

class Balloon {
    // "Encapsulation" of code
    private int size;
    private String color;
    private boolean inflated;
    private static int quantity = 0;

    // Custom Constructor
    Balloon(int arg1, String arg2) {
        size = arg1;
        color = arg2;
        inflated = false;
        quantity++;
    }

    // Default Constructor
    Balloon() {
        size = 10;
        color = "blue";
        inflated = false;
        quantity++;
    }

    // Get the size
    int getSize() {
        return size;
    }

    // Get the color
    String getColor() {
        return color;
    }

    // Get the quantity
    static int getQuantity() {
        return quantity;
    }

    // Destruct a balloon
    static void destruct(int i, Balloon[] arg) {
        arg[i] = null;
        quantity--;
    }

    public boolean isInflated() {

        return inflated;
    }

    public void setInflated(boolean i) {
        inflated = i;
    }

    @Override
    public String toString() {
        return "Balloon{" +
                "size = " + size +
                ", color = " + color + ", " +

                (inflated ? "inflated" : "not inflated") +
                '}';
    }
}