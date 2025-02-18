import java.util.*;
public class Main
{
	public static void ArrayMax(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=scn.nextInt();
		}
		int fmax=arr[1];
		int smax=0,tmax=0;
		for(int i=1;i<n;i++){
		    if(arr[i]>fmax)
		        fmax=arr[i];
		}
		for(int j=0;j<n;j++){
		    if(arr[j]<fmax && fmax>smax)
		        smax=arr[j];
		    }
		for(int k=0;k<n;k++){
		    if(arr[k]<fmax && arr[k]<smax && smax>tmax && fmax>tmax)
		        tmax=arr[k];
		}
		System.out.println("First Max : "+fmax);
		System.out.println("Second Max : "+smax);
		System.out.println("Third Max : "+tmax);
	}
}