import java.util.*;

class Harshad{
    int sumcount(int n){
        int temp = n,sum=0;
        while(temp>0){
            sum = sum + (temp%10);
            temp/=10;
        }
        return sum;
    }
}

public class HarshadNumber
{
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    Harshad h = new Harshad();
	    int sum = h.sumcount(n);
	    if(n%sum==0)
	        System.out.println(n + " : is a Harshad Number");
	    else
		    System.out.println(n + " : is not a Harshad Number");
	}
}
