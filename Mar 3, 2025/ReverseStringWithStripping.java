import java.util.*;

class Strip{
    static String strip(String str){
        StringBuilder s = new StringBuilder();
        char c;
        str = str.trim();
        for(int i=0;i<str.length();i++){
            c = str.charAt(i);
            if(Character.isLetter(c)){
                s.append(c);
            }
            else if(c == ' '){
                if(str.charAt(i-1)!=' ')
                    s.append(c);
            }
        }
        return s.toString();
    }
    
    static void reverse(String str){
        String s = strip(str);
        String spaces = " ",res ="";
        String[] arr = s.split(spaces);
        for(int i =arr.length-1;i>=0;i--){
            res = res+" "+arr[i];
        }
        res = res.trim();
        System.out.println(res);
    }
}

public class ReverseStringWithStripping
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scn.nextLine();
        scn.close();
        Strip.reverse(str);
	}
}