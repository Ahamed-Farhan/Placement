import java.util.*;
public class LongAdditionDigitByDigit
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
		Long a = in.nextLong(),b = in.nextLong();
		String as = Long.toString(a), bs = Long.toString(b);
		int al = as.length()-1,bl = bs.length()-1,carry = 0,temp = 0;
		String res = "";
		while(al >= 0 || bl >= 0 || carry==1){
		    if(al>=0){
		        carry+=as.charAt(al) - '0';
		        al--;
		    }
		    if(bl>=0){
		        carry+=bs.charAt(bl) - '0';
		        bl--;
		    }
		    res+=(char)((carry%10)+'0');
		    carry/=10;
		}
		StringBuilder str = new StringBuilder();
		str.append(res);
		System.out.println(str.reverse());
	}
}