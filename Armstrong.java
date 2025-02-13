import java.util.*;
public class Armstrong
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
        int rev_odd=rev(oddsum);
        int rev_even=rev(evensum);
        int rev_prime=rev(primesum);
        System.out.println("Odd,Even and prime Numbers : "+rev_odd +" Ams: "+arms(rev_odd)+","+rev_even+" Ams: "+arms(rev_even)+","+rev_prime+" Ams:"+arms(rev_prime));
        System.out.println("Odd,Even and prime Numbers in Reverse : "+oddsum +" Ams: "+arms(oddsum)+","+evensum+" Ams: "+arms(evensum)+","+primesum+" Ams:"+arms(primesum));
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
    static boolean arms(int val){
        int temp,armsum=0;
        while(val>0){//153
            temp=val%10;
            armsum=(temp*temp*temp)+armsum;
            val/=10;
        }
        if(armsum==val){
            return true;
        }
        else{
            return false;
        }
    }
}
