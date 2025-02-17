import java.util.*;
public class ZeroToLast
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=scn.nextInt();
		}
		for(int i =0;i<n;i++){
		    if( arr[i]==0){
		        int temp;
    		    for(int j=i;j<n-1;j++){
    		        temp = arr[j];
    		        arr[j]=arr[j+1];
    		        arr[j+1]=temp;
    		    }
		}
	}
    	for(int i =0;i<n;i++){
    	    System.out.print(arr[i]+" ");
    	}
	}
}