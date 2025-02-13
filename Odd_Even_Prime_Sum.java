import java.util.*;
public class Odd_Even_Prime_Sum
{
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
		int temp = scn.nextInt();
		int dup = temp;
		int oddsum=0,evensum=0,primesum=0;
		int digit;
		while(temp>0){
		    digit=temp%10;
		    temp=temp/10;
		    if(digit%2==0){
		        evensum+=digit;
		    }
		    if(digit%2==1){
		        oddsum+=digit;
		    }
		    if(digit==1) continue;
		    boolean prime=true;
		    
		    for (int i = 2; i < digit; i++) {
                if (digit % i == 0) {
                    prime = false;
                }
		    }
    		if(prime)
    		  primesum+=digit;

        }
        System.out.println(oddsum +","+evensum+","+primesum);
    }
}