import java.util.*;
class Area{
    static float area(float r){
        return (float)(3.14f*r*r);
    }
    
    static double area(int l,int b){
        return (double)(l*b);
    }
    
    static double area(double s){
        return (double)(s*s);
    }
    
    static double area(double h,double ba){
        return (double)(0.5*h*ba);
    }
}
public class AreaWithMethodOverloading
{
	public static void main(String[] args) {
	    System.out.println("Area of Circle: " +Area.area(5.0f));
	    System.out.println("Area of Rectangle: " +Area.area(5,6));
	    System.out.println("Area of Square: " +Area.area(5.00));
	    System.out.println("Area of Triangle: " +Area.area(6.0,5.0));
	}
}