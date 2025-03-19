import java.util.*;

public class ClockAndAntiClockWiseMatrixRotation {
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
		System.out.println("ClockWise : ");
		Ctranspose(arr,m,n);
		System.out.println("Anti - ClockWise : ");
		AntiClockWise(arr,m,n);
    }
    
    public static void printMatrix(int arr[][] , int n, int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
    
    public static void ClockWise(int trans[][] , int n, int m){
        int temp = 0;
        for(int i=0;i<n;i++){
            for(int j=0,k=n-1;j<k;j++,k--){
                temp = trans[i][j];
                trans[i][j] = trans[i][k];
                trans[i][k] = temp;
            }
        }
    }
    
    public static void AntiClockWise(int arr[][] , int n, int m){
        ClockWise(arr,m,n);
        transpose(arr,m,n);
    }
    
    public static void Ctranspose(int arr[][], int m, int n){
       int trans[][] = new int[n][m];
       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               trans[i][j]=arr[j][i];
           }
       }
       ClockWise(trans,m,n);
       printMatrix(trans,n,m);
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