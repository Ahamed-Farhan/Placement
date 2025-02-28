import java.util.*;

class Strong{
    
    int fact(int n){
        int fact = 1;
        for(int i = 2;i <= n; i++){
            fact = fact * i;
        }
        return fact;
    }
    
    void IsStrong(int n){
        int temp = n, digit = 0,result = 0;
        while(temp>0){
            digit = temp%10;
            temp = temp/10;
            result=result+fact(digit);
        }
        if(result == n)
            System.out.println(n + ": Is a Strong Number");
    }
}

public class StrongNumbersUptoRange
{
	public static void main(String[] args) {
	    Strong s = new Strong();
	    System.out.print("Enter upto Range : ");
	    Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for(int i=1;i<=n;i++){
		    s.IsStrong(i);
		
	}
  }
}
