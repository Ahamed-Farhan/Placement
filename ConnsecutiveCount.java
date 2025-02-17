import java.util.*;
public class ConnsecutiveCount
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int count=0;
		int max=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=scn.nextInt();
		}
		for(int i =0;i<n;i++){
		    if(arr[i]==1)
		        count++;
		    if(arr[i]==0)
		        count=0;
		    if(count>max)
		        max=count;
		}
		System.out.println(max);
	}
}