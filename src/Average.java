public class Average {
    public static void main(String[] args) {
        int[] arr = {15, 34, 7, 19, 37, 21, 99};
        float sum = 0f;
        float average;

        for (int start = 0; start < arr.length; start++) {
            sum += arr[start];
        }

        average = sum/arr.length;
        System.out.println(average);
    }
}
