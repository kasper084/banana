import java.util.Arrays;
import java.util.Comparator;

public class AlterReversArrays {
    public static void main(String[] args) {
        Integer[] arr = {2, 3, 1, 7, 11};
        Arrays.sort(arr, Comparator.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}
