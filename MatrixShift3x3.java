import java.util.*;

public class MatrixShift3x3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m=3;
	    int n=3;
		int arr[][]= new int[m][n];
		for(int i=0;i<m;i++){
		    for(int j=0;j<n;j++){
		        arr[i][j]=scn.nextInt();
		    }
		}
		sortArray(arr,m,n);
		matrixShift(arr,m,n);
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
    
    public static void matrixShift(int arr[][] , int m, int n){
        int row=0,col=0,curr=0,prev=0;
        while(row<m && col<n){
            if(row+2==m || col+2==n)
                break;
            prev=arr[row+1][col];
            for(int i=col;i<n;i++){
                curr=arr[row][i];
                arr[row][i]=prev;
                prev=curr;
            }
            row++;
            
            for(int j=row;j<n;j++){
                curr=arr[j][row+1];
                arr[j][row+1]=prev;
                prev=curr;
            }
            col++;
            
            for(int j=n-2;j>=0;j--){
                curr=arr[col+1][j];
                arr[col+1][j]=prev;
                prev=curr;
            }
            row--;
            
            for(int i=row+1;i<n-1;i++){
                arr[i][row]=prev;
            }
        }
    }
}
