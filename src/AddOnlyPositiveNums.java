public class AddOnlyPositiveNums {
    public static void main(String[] args) {
        int[] arr = {15, -34, 7, 19, -37, -21, 99};
        int sum = 0;

        for (int start = 0; start < arr.length; start++) {
            if (arr[start] > 0) {
                sum += arr[start];
            } else {
                continue;
            }
        }

        System.out.println(sum);
    }

}
