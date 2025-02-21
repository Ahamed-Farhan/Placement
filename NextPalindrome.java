import java.util.*;
public class NextPalindrome
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=scn.nextInt();
		}
		for(int i=0;i<n;i++){
		    System.out.println("Palindrome of "+ arr[i] +" is :" + pali(arr[i]+1));
		}
	}
	
	public static int pali(int val){
	    int temp=val,rev=0;
	    while(temp>0){
	        rev=rev*10+temp%10;
	        temp=temp/10;
	    }
	    if(val==rev)
	        return rev;
	    else{
	        val++;
	        return pali(val);
	    }
	}
}