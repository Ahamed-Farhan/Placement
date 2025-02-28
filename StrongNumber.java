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
            System.out.print(n + ": Is a Strong Number");
        else
            System.out.print(n + ": Is not a Strong Number");
    }
}
public class StrongNumber
{
	public static void main(String[] args) {
	    Strong s = new Strong();
	    Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		s.IsStrong(n);
}
}