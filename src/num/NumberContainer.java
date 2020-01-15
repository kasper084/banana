package num;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberContainer {
    private List<Integer> listOfNumbers = new ArrayList<>();
    private Random random = new Random();

    public void fillUp() {
        for (int start = 0; start < getMagicNum(); start++) {
            getListOfNumbers().add(getRandomInt());
        }
    }

    private Integer getRandomInt() {
        return random.nextInt();
    }

    private List<Integer> getListOfNumbers() {
        return this.listOfNumbers;
    }

    private Integer getMagicNum() {
        return Integer.MAX_VALUE;
    }
}