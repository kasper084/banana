import java.util.SortedSet;
import java.util.TreeSet;

public class FruitTree {

    private SortedSet<String> fruitListSortedSet = new TreeSet<>(new DescendingComparator());

    public FruitTree(FruitList fruitList) {
        for (int element = 0; element < fruitList.getFruitsList().size(); element++) {
            String some = fruitList.getFruitsList().get(element);
            getFruitListSortedSet().add(some);
        }
    }

    public SortedSet<String> getFruitListSortedSet() {
        return this.fruitListSortedSet;
    }

    public void print() {
        for (String some :
                getFruitListSortedSet()) {
            System.out.println(some);
        }
    }

}