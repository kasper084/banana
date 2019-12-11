
import java.util.ArrayList;
import java.util.List;

public class MyList<T extends Number> {
    List<T> listOfT = new ArrayList<T>();

    public void add(T someT) {
        listOfT.add(someT);
    }
}
