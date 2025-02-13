import java.util.*;
public class Odd_Even_Prime_Num
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
		        evensum=evensum*10+digit;
		    }
		    if(digit%2==1){
		        oddsum=oddsum*10+digit;
		    }
		    if(digit==1) continue;
		    boolean prime=true;
		    
		    for (int i = 2; i < digit; i++) {
                if (digit % i == 0) {
                    prime = false;
                }
		    }
    		if(prime)
    		  primesum=primesum*10+digit;

        }
        System.out.println(oddsum +","+evensum+","+primesum);
        
        
        System.out.println(rev(oddsum) +","+rev(evensum)+","+rev(primesum));
    }
    static int rev(int digit){
        int temp,sum=0;
        while(digit>0){
            temp=digit%10;
            sum=temp+sum*10;
            digit/=10;
        }
        return sum;
    }
}