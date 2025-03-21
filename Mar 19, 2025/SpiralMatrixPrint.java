import java.util.*;

public class SpiralMatrixPrint {
    public static void printSpiral(int[][] matrix, int m, int n) {
        int top = 0, bottom = m-1, left = 0, right = n-1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++){
                System.out.print(matrix[top][i] + " ");
            }
            top++;
            for (int i = top; i <= bottom; i++){
                System.out.print(matrix[i][right] + " ");
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--){
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--){
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Rows and Columns : ");
        int m = scn.nextInt();
        int n = scn.nextInt();
        int[][] matrix = new int[m][n];
        System.out.println("Enter elements:");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                matrix[i][j] = scn.nextInt();
            }
        }
        scn.close();
        System.out.println("Spiral order : ");
        printSpiral(matrix, m, n);
    }
}