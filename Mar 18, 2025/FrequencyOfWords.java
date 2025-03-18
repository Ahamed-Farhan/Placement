import java.util.*;
public class FrequencyOfWords
{
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    String str = scn.nextLine();
	    int count = 1;
	    String arr[] = str.split(" ");
	    int n = arr.length;
	    Arrays.sort(arr);
	    for(int i = 1; i < n;i++){
    	   if(arr[i].equals(arr[i-1])){
    	       count++;
    	   }
    	   else{
    	       System.out.println(arr[i-1]+" : "+count);
	           count=1;
    	   }
    	   if(i==n-1) System.out.println(arr[i]+" : "+count);
	    }
    }
}