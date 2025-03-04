import java.util.*;

class Substring{
    void stringbuilder(String str, int n, int m){
        StringBuilder st = new StringBuilder(str);
        System.out.println("By String Builder : "+ st.substring(n,m));
    }
    
    void stringbuffer(String str, int n, int m){
        StringBuffer st = new StringBuffer(str);
        System.out.println("By String Buffer : "+ st.substring(n,m));
    }
    
    void stringmethod(String str, int n, int m){
        System.out.println("By String Methods : "+ str.substring(n,m));
    }
}
public class SubstringExtraction
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = scn.nextLine();
		System.out.println("Entered String is : "+str);
		System.out.println("Pick a Starting and Ending Index to Extract: ");
		int n = scn.nextInt();
		int m = scn.nextInt();
		Substring s = new Substring();
		s.stringmethod(str,n,m);
		s.stringbuilder(str,n,m);
		s.stringbuffer(str,n,m);
	}
}