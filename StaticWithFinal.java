import java.util.*;
abstract class Super{
    static final int value;
    static{
        value = 100;
    }
    static void display(){
        System.out.println("Value : "+ value);
    }
}
public class StaticWithFinal
{
	public static void main(String[] args) {
		Super.display();
	}
}