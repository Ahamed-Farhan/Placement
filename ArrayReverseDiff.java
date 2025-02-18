public class ArrayReverseDiff {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int n = 3; // Reverse size

        for (int i = 0; i < arr.length; i += n) {
            int end = Math.min(i + n - 1, arr.length - 1); // Handle last chunk if not full
            for (int j = end; j >= i; j--) {
                System.out.print(arr[j] + " ");
            }
        }
    }
}
