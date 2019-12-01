public class Revers {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 7, 11};
        int dummy;
        boolean areYouSorted = false;

        while (!areYouSorted) {
            areYouSorted = true;
            for (int start = 0; start < arr.length - 1; start++) {
                if (arr[start] < arr[start + 1]) {
                    dummy = arr[start];
                    arr[start] = arr[start + 1];
                    arr[start + 1] = dummy;
                    areYouSorted = false;
                }
            }
        }

        for (int print = 0; print < arr.length; print++) {
            System.out.print(arr[print]);
        }
    }

}

