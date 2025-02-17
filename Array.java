import java.util.*;
public class Array
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=scn.nextInt();
		}
		
		for(int i=0;i<arr.length;i++){
		    System.out.println(arr[i]);
		}
		System.out.println();
		for(int j=arr.length-1;j>=0;j--){
		    System.out.println(arr[j]);
		}
		System.out.println();
		for(int i:arr){
		    System.out.println(i);
		}
	}
}