import java.util.*;

public class MatrixSort {
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
		sortArray(arr,m,n);
		printMatrix(arr,m,n);
    }
    
    public static void printMatrix(int arr[][] , int m, int n){
        System.out.println("Sorted Matrix \n");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
    
    public static void sortArray(int arr[][] , int m, int n){
        int[] flatArray = new int[m * n];
        int index = 0;
        
        for (int i = 0; i < m; i++) {        
            for (int j = 0; j < n; j++) { 
                flatArray[index] = arr[i][j];
                index++;
            }
        }

        Arrays.sort(flatArray);
        
        index = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = flatArray[index++];
            }
        }
    }
}
