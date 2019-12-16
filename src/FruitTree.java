import java.util.SortedSet;
import java.util.TreeSet;

public class FruitTree {

    private SortedSet<String> fruitListSortedSet = new TreeSet<>(new DescendingComparator());

    public void add(FruitList fruitList) {
        for (int element = 0; element < fruitList.getFruitsList().size(); element++) {
            String some = fruitList.getFruitsList().get(element);
            getFruitListSortedSet().add(some);
        }
    }

    public void print() {
        for (String some :
                getFruitListSortedSet()) {
            System.out.println(some);
        }
    }

    public SortedSet<String> getFruitListSortedSet() {
        return this.fruitListSortedSet;
    }
}