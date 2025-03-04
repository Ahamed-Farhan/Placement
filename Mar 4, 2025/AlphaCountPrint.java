import java.util.*;

class CountAlpha{
    void cal(String str){
        char c;
        String res = "";
        for(int i=0;i<str.length();i++){
            c = str.charAt(i);
            if(Character.isLetter(c)){
                res = res + c;
            }
            if(Character.isDigit(c)){
                int cl = c - '0';
                System.out.print(res.repeat(cl));
                res = "";
            }
        }
        System.out.print(res);
    }
}

public class AlphaCountPrint
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		scn.close();
		CountAlpha ca = new CountAlpha();
		ca.cal(str);
		
	}
}