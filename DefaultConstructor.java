import java.util.*;
public class DefaultConstructor
{
	public static void main(String[] args) {
	    Car b = new Car();
	    Car c = new Car();
	}
}
class Car{
	    String brand="";
	    static int count = 0;
	    Car(){
	        count++;
	        System.out.print("Object Created! Current Count = "+count);
	    }
	}