import java.util.*;

class Strip{
    static void reverse(String str){
        String s = str.trim().replaceAll(" +"," ");
        String space = " ",res ="";
        String[] arr = s.split(space);
        for(int i =arr.length-1;i>=0;i--){
            res = res+" "+arr[i];
        }
        res = res.trim();
        System.out.println(res);
    }
}

public class ReverseStringWithStripping_Simple
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scn.nextLine();
        scn.close();
        Strip.reverse(str);
	}
}