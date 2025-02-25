import java.util.*;

abstract class Circle{
    static double area,perimeter;
    static double r;
    static void getval(){
        Scanner in = new Scanner(System.in);
        r = in.nextDouble();
        in.close();
    }
    
    static void calc_area(){
        area = 3.14*r*r;
        System.out.println("Area : "+area);
    }
    static void calc_peri(){
        perimeter = 3.14*2*r;
        System.out.println("Circumference : "+perimeter);
    }
}

public class AbstractClassWithOutInheritance
{
	public static void main(String[] args) {
	    Circle.getval();
		Circle.calc_area();
		Circle.calc_peri();
	}
}
