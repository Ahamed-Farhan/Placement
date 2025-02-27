import java.util.*;
public class Automorph
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int digit = 0,temp=n; 
		int pow = (int)(Math.pow(n,2));
		boolean cm = false;
		while(temp > 0){
		    digit = temp%10;
		    temp=temp/10;
		    if(pow%10==digit){
		        cm = true;
		        pow=pow/10;
		    }
		    else{
		        cm = false;
		        break;
		    }
		}
		if(cm)
		    System.out.print("AutoMorph");
		else
		    System.out.print("Not an AutoMorph");
	}
}