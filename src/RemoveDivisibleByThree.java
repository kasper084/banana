import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDivisibleByThree {
    private List<Integer> list = new ArrayList<>(Arrays.asList(3, 9, 11, 18, 20, 22));

    public void remove() {
        int some = getList().size();
        for (int element = 0; element < some; element++) {
            if (getList().get(element) % 3 == 0) {
                getList().remove(element);
                element--;
                some--;
            }
        }
    }

    public void removeWithRemoveIf() {
        getList().removeIf(element -> element % 3 == 0);
    }

    public void print() {
        remove();
        System.out.println(getList());
        removeWithRemoveIf();
        System.out.println(getList());
    }

    public List<Integer> getList() {
        return this.list;
    }
}