package first;

import java.util.ArrayList;
import java.util.List;

public class MyListOne<T extends Number> {
    private List<T> listOfT = new ArrayList<>();

    public void add(T some) {
        listOfT.add(some);
    }

    public T largest() {
        T some = getListOfT().get(0);
        for (int element = 1; element < getListOfT().size(); element++) {
            if (getListOfT().get(element).doubleValue() > some.doubleValue()) {
                some = getListOfT().get(element);
            }
        }
        return some;
    }

    public T smallest() {
        T some = getListOfT().get(0);
        for (int element = 1; element < getListOfT().size(); element++) {
            if (getListOfT().get(element).doubleValue() < some.doubleValue()) {
                some = getListOfT().get(element);
            }
        }
        return some;
    }

    public List<T> getListOfT() {
        return this.listOfT;
    }
}
