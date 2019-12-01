import java.util.Arrays;

public class AlterReversArrays {
    public static void main(String[] args) {
        Integer[] arr = {2, 3, 1, 7, 11};
        Arrays.sort(arr, (element1, element2) -> element2.compareTo(element1));
        System.out.println(Arrays.toString(arr));
    }
}
