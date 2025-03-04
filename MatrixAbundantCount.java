import java.util.*;

public class MatrixAbundantCount {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter no. of Rows and Columns: ");
        int r = scn.nextInt();
        int c = scn.nextInt();
        int arr[][] = new int[r][c];

        System.out.println("Enter Matrix Values: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = scn.nextInt();
                while (count(arr[i][j]) < 4) {
                    System.out.println("Number should be at least 4 digits...\nPlease enter again:");
                    arr[i][j] = scn.nextInt();
                }
            }
        }

        result(arr, r, c);
        scn.close();
    }

    static int count(int a) {
        return String.valueOf(Math.abs(a)).length(); 
    }

    static void result(int arr[][], int r, int c) {
        int count = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (abundant(arr[i][j])) {
                    count++;
                }
            }
        }
        if (count % 2 == 0)
            System.out.println("YES, Abundant Count in the matrix is: " + count);
        else
            System.out.println("NO");
    }

    static boolean abundant(int num) {
        if (num < 1) return false;

        int sum = 0;
        for (int j = 1; j <= num / 2; j++) {
            if (num % j == 0) {
                sum += j;
            }
        }
        return sum > num;
    }
}