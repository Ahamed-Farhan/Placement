import java.util.*;
public class MethodOverloadingAdvanced
{
    static int calculate(int a){
        if(a<=1)
            return a;
        else
            return calculate(a-1)+calculate(a-2);
    }
    
    static double calculate(double a){
        if(a<=1)
            return 1;
        else{
            return a*calculate(a-1);
        }
    }
    
    static void calculate(){
        System.out.print("Enter Range of Prime : ");
        Scanner scn = new Scanner(System.in);
	    int a = scn.nextInt();
	    scn.close();
        int num = 2;
        System.out.print("Prime Numbers : ");
        while (num <= a) {
            boolean prime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(num + " ");
            }
            num++;
        }
    }
	public static void main(String[] args) {
	    int a=10;
	    System.out.print("Fibonacci : ");
		for(int i = 0;i<a;i++){
		    System.out.print(calculate(i)+ " ");
		}
		
		System.out.println();
		System.out.println("Factorial : "+ calculate(5.0));
		calculate();
	}
}