import java.util.*;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m=scn.nextInt();
        int n=scn.nextInt();
		int arr[][]= new int[m][n];
		for(int i=0;i<m;i++){
		    for(int j=0;j<n;j++){
		        arr[i][j]=scn.nextInt();
		    }
		}
		transpose(arr,m,n);
    }
    
    public static void printMatrix(int arr[][] , int n, int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
    
   public static void transpose(int arr[][], int m, int n){
       int trans[][] = new int[n][m];
       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               trans[i][j]=arr[j][i];
           }
       }
       printMatrix(trans,n,m);
   }
}
