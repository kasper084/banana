import java.util.ArrayList;
import java.util.List;

public class MyList<T extends Comparable> {
    private List<T> listOfT = new ArrayList<>();

    public void add(T some) {
        getListOfT().add(some);
    }

    public <Z extends Comparable<? super Z>> Z largest(MyList<Z> list) {
        Z some = list.get(0);
        for (int element = 1; element < list.size(); element++) {
            if (some.compareTo(list.get(element)) < 0) some = list.get(element);
        }
        return some;
    }

    public <Z extends Comparable<? super Z>> Z smallest(MyList<Z> list) {
        Z some = list.get(0);
        for (int element = 1; element < list.size(); element++) {
            if (some.compareTo(list.get(element)) > 0) some = list.get(element);
        }
        return some;
    }

    private int size() {
        return getListOfT().size();
    }

    private T get(int element) {
        return getListOfT().get(element);
    }

    public List<T> getListOfT() {
        return this.listOfT;
    }
}