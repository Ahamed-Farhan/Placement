import java.util.*;


class ReversePrime{
    boolean prime(int a){
        boolean cp = true;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                cp = false;
                break;
            }
        }
        return cp;
    }
    
    int reverse(int a){
        int temp = a,rev=0;
        while(temp>0){
            rev = rev*10+(temp%10);
            temp/=10;
        }
        return rev;
    }
}

public class PrimeandReversePrime
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	    int a = scn.nextInt();
	    
	    ReversePrime r = new ReversePrime();
	    
	    if(r.prime(a)){
	        int rev = r.reverse(a);
	        if(r.prime(rev)){
	            System.out.println("Both the number and it's reverse are PRIME");
	        }
	        else
	            System.out.println("Both the number and it's reverse are NOT PRIME");
	    }
	    else{
	        System.out.println("The Given Number is NOT PRIME");
	    }
	}
}