import java.util.*;
class Palindrome {
	void Stringbuilder(String str) {
		StringBuilder st = new StringBuilder();
		StringBuilder rs = new StringBuilder();
		st.append(str);
		rs.append(str);
		st.reverse();
		if(st.compareTo(rs)==0) {
			System.out.println("Palindrome by StringBuilder");
		}
		else {
			System.out.println("Not a Palindrome by StringBuilder");
		}
	}

	void StringMethod(String str) {
		int len = str.length();
		for(int i=0; i<len/2; i++) {
			if(str.charAt(i)!=str.charAt(len-i-1)) {
				System.out.println("Not a Palindrome by StringBuilt-in");
				break;
			}
		}
		System.out.println("Palindrome by StringBuilt-in");
	}

	void StringWithoutMethod(String str) {
		char[] arr = str.toCharArray();
		int len = arr.length;
		for (int i=0; i<len/2; i++) {
			if(arr[i]!=arr[len-i-1]) {
				System.out.println("Not a Palindrome by String Without Methods");
				break;
			}
		}
		System.out.println("Palindrome by String Without Methods");
	}

	void Stringbuffer(String str) {
		StringBuffer st = new StringBuffer();
		StringBuffer rs = new StringBuffer();
		st.append(str);
		rs.append(str);
		st.reverse();
		if(st.compareTo(rs)==0) {
			System.out.println("Palindrome by StringBuffer");
		}
		else {
			System.out.println("Not a Palindrome by StringBuffer");
		}
	}
}
public class PalindromeByStringVariants
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		Palindrome p = new Palindrome();
		p.StringMethod(str);
		p.Stringbuilder(str);
		p.Stringbuffer(str);
		p.StringWithoutMethod(str);
	}
}