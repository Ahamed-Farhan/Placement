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

public class HarshadNumberUptoRange
{
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    System.out.print("Enter Starting Range:");
	    int s = scn.nextInt();
	    System.out.print("Enter upto Range:");
	    int n = scn.nextInt();
	    scn.close();
	    Harshad h = new Harshad();
	    for(int i=s;i<=n;i++){
	        int sum = h.sumcount(i);
    	    if(i%sum==0)
    	        System.out.println(i + " : is a Harshad Number");
	    }
	}
}
