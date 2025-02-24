import java.util.Scanner;

public class MatrixTriangleSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns: ");
        int n = scanner.nextInt();
        
        int[][] matrix = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        int lowerSum = 0, upperSum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > j) { 
                    lowerSum += matrix[i][j];
                } else if (j > i) { 
                    upperSum += matrix[i][j];
                }
            }
        }
        
        matrix[0][0] = lowerSum;
        matrix[n-1][n-1] = upperSum;
        
        System.out.println("Modified matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
