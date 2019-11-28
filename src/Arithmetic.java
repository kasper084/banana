import java.util.Random;

public class Arithmetic {

    static byte smallest;
    static short smaller;
    static int big;
    static long biggest;
    static float floating;
    static double longFloating;

    public static void main(String[] args) {
        Random random = new Random();
        smaller = (byte) random.nextInt(127);
        smaller = (short) random.nextInt(32767);
        big = random.nextInt();
        biggest = (big * (big - (smaller + smallest)));
        floating = random.nextFloat();
        longFloating = biggest/floating;
        System.out.println("Some random number:" + "\n" + longFloating);
    }

}
