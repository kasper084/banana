package num;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberContainer {
    private static List<Integer> list = new ArrayList<>();
    private Random random = new Random();

    public void fillUp() {
        try {
            for (int start = 0; start < getMagicNum(); start++)
                getList().add(getRandomInt());
        } catch (OutOfMemoryError o) {
            System.err.println("Program crashed.\n"
                    + "Reason: "
                    + o.toString());
        }
    }

    private Integer getMagicNum() {
        return Integer.MAX_VALUE;
    }

    private int getRandomInt() {
        return random.nextInt();
    }

    private static List<Integer> getList() {
        return list;
    }
}