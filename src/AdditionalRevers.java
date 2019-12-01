import java.util.Arrays;
import java.util.Collections;

public class AdditionalRevers {
    public static void main(String[] args) {
        Integer[] arr = {2, 3, 1, 7, 11};
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}
