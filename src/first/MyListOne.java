package first;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyListOne<T extends Number & Comparable<? super T>> {
    private List<T> listOfT = new ArrayList<>();

    public void add(T some) {
        listOfT.add(some);
    }

    public T getLargestValue() {
        return Collections.max(getListOfT());
    }

    public T getSmallestValue() {
        return Collections.min(getListOfT());
    }

    public List<T> getListOfT() {
        return this.listOfT;
    }
}
