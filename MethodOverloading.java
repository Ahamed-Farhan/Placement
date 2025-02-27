import java.util.*;
public class MethodOverloading
{
    static void greet(){
        System.out.println("Hello");
    }
    static void greet(String name){
        System.out.println("Hello " + name);
    }
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
		String name = scn.nextLine();
		greet();
		greet(name);
	}
}