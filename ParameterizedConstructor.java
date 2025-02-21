import java.util.*;
public class ParameterizedConstructor
{
	public static void main(String[] args) {
	    Car b = new Car("Koenigsegg");
	    b.display();
	}
}
class Car{
	    String brand="";
	    static int count = 0;
	    Car(String m){
	        brand = m;
	    }
	    void display(){
	        System.out.println("Model : "+brand);
	    }
	}