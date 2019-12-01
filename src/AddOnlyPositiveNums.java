public class AddOnlyPositiveNums {
    public static void main(String[] args) {
        int[] arr = {15, -34, 7, 19, -37, 21, -99};
        int sum = 0;

        for (int num : arr) {
            if (num > 0) sum += num;
        }

        System.out.println(sum);
    }

}
