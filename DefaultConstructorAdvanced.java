import java.util.*;
public class DefaultConstructorAdvanced
{
	public static void main(String[] args) {
	    Car b = new Car();
	}
}
class Car{
	    String brand="";
	    Car(){
	    brand = "Unknown";
	    System.out.println(brand);
	    setBrand();
	    System.out.println(brand);
	    }
	    void setBrand(){
	        Scanner scn = new Scanner(System.in);
	        brand=scn.nextLine();
	    }
	}