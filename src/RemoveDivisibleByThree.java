import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDivisibleByThree {
    List<Integer> integerList = new ArrayList<>(Arrays.asList(3, 9, 11, 18, 20, 22));

    public void remove(List<Integer> list) {
        int some = list.size();
        for (int element = 0; element < some; element++) {
            if (list.get(element) % 3 == 0) {
                list.remove(element);
                element--;
                some--;
            }
        }
    }

    public List<Integer> getList() {
        return this.integerList;
    }
}
