import java.util.*;
public class AutomorphUptoRange
{
	public static void main(String[] args) {
		Auto();
	}
	public static void Auto(){
	    Scanner scn = new Scanner(System.in);
	    System.out.print("Enter Range : ");
		long n = scn.nextLong();
		
		for(long i=1;i<=n;i++){
    		long temp=i,count=0;;
    		long pow = i*i;
    		while(temp > 0){
    		    count++;
    		    temp=temp/10;
    		}
    		if((long)(pow % Math.pow(10,count))==i)
    		    System.out.println(i);
		}
	}
}