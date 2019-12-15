import java.util.SortedSet;
import java.util.TreeSet;

public class FruitTree {

    private SortedSet<FruitList> fruitListSortedSet = new TreeSet<>(new DescendingComparator());

    public FruitTree(FruitList fruitList) {
        getFruitListSortedSet().add(fruitList);
    }


    public SortedSet<FruitList> getFruitListSortedSet() {
        return this.fruitListSortedSet;
    }

    public String getStringValue(FruitList fruitList) {
        String some = null;
        for (int element = 0; element < fruitList.getFruitsList().size(); element++) {
            some = fruitList.getFruitsList().get(element);
        }
        return some;
    }

    public void print() {
        for (FruitList some :
                getFruitListSortedSet()) {
            System.out.println(some);
        }
    }

}
