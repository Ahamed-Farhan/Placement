public class CalculateByMethodOverloading
{
    static void calculate(int a,int b){
        System.out.println("Sum is : "+(a+b));
    }
    static void calculate(float a,float b){
        System.out.println("Difference is : "+(a-b));
    }
    static void calculate(double a,double b){
        System.out.println("Multiplication is : "+(a*b));
    }
    static void calculate(double a,int b){
        System.out.println("Division is : "+(a/b));
    }
	public static void main(String[] args) {
		calculate(3,7);
		calculate(7f,5f);
		calculate(5.0,2.0);
		calculate(10.0,2);
	}
}