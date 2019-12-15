import java.util.Comparator;

public class DescendingComparator implements Comparator<String> {



    @Override
    public int compare(String first, String second) {
        return second.compareTo(first);
    }
}