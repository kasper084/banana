import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlterRemoveDivisibleByThee {
    private List<Integer> integerList = new ArrayList<>(Arrays.asList(3, 9, 11, 18, 20, 22));

    public void removeWithRemoveIf() {
        getList().removeIf(element -> element % 3 == 0);
        System.out.println(getList());
    }

    public List<Integer> getList() {
        return this.integerList;
    }
}
