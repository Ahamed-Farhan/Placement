import java.util.*;
public class BubbleSort
{
	public static void main(String[] args) {
	    int temp = 0;
	    boolean s;
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=scn.nextInt();
		}
		scn.close();
		for(int i = 0; i < n-1; i++){
		    s=false;
		    for(int j = 0 ;j < n-i-1; j++){
		        if(arr[j]>arr[j+1]){
		            temp = arr[j];
		            arr[j]=arr[j+1];
		            arr[j+1]=temp;
		            s=true;
		        }
		    }
		    if(s=false)
		        break;
		}
		
		for(int i=0;i<n;i++){
		    System.out.print(arr[i] + " ");
		}
	}
}