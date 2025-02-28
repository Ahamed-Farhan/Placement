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
    
    void harshad(int i){
        int sum = sumcount(i);
    	if(i%sum==0)
    	   System.out.println(i + " : is a Niven Number");
    }
    
    void abundant(int i){
        int abu = 0;
        for(int j=1;j<i;j++){
            if(i%j==0){
                abu = abu + j;
                if(abu>i) break;
            }
        }
        if(abu>i)
            System.out.println(i + " : is an Abundant Number");
    }
    
    void pronic(int n){
        for(int i=1;i<n-1;i++){
            if(i*(i+1)==n)
                System.out.println(n + " : is a Pronic Number");
            if(i*(i+1)>n)
                break;
        }
    }
}

public class PronicAbundantAndNivenUptoRange
{
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    scn.close();
	    Harshad h = new Harshad();
	    for(int i=1;i<=n;i++){
    	    h.pronic(i);
    	    h.harshad(i);
    	    h.abundant(i);
	    }
    }
}
