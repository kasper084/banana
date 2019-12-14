import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class <T extends Number> AlterRemoveDivisibleByThee {
    List<Integer> integerList = new ArrayList<>(Arrays.asList(3, 9, 11, 18, 20, 22));

    public void removeWithRemoveIf(List<Integer> list) {
        list.removeIf(element -> element % 3 == 0);
    }

    public List<Integer> getList() {
        return this.integerList;
    }

    public void print() {

    }
}
