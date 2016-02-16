package p3;

public class Main {
    public static void main(String[] arg) {
        Integer i = 45;
        System.out.println(i);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.parseInt("24") / 2);

        //value, base (e.g. value 24, base 8; therefore 24 in base 8 is 20 in binary
        System.out.println(Integer.parseInt("24", 8));
    }
}
