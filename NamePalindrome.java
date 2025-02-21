import java.util.*;
public class NamePalindrome
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.nextLine();
		String arr[] = new String[n];
		for(int i=0;i<n;i++){
		    arr[i]=scn.nextLine();
		}
		for(int i=0;i<n;i++){
		    System.out.println(arr[i] +" is " + pali(arr[i]) +" Palindrome ");
		}
	}
	
	public static boolean pali(String name){
	    for (int i =0 ; i<name.length(); i++) {
            if(name.charAt(i) != name.charAt(name.length()-1-i)) return false;
        }
	    return true;
	}
}