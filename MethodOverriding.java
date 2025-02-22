import java.util.*;
class Base{
    public void method1(){
        System.out.println("Public");
    }
    private void method2(){
        System.out.println("Private");
    }
    protected void method3(){
        System.out.println("Protected");
    }
    static void method4(){
        System.out.println("Static");
    }
    void method5(){
        System.out.println("Default");
    }
}
class Sub extends Base{
    public void method1(){
        System.out.println("Public Property");
    }
    protected void method3(){
        System.out.println("Protected Property");
    }
    static void method4(){
        System.out.println("Static Property");
    }
    void method5(){
        System.out.println("Default Property");
    }
}
public class MethodOverriding
{
	public static void main(String[] args) {
	    Base a = new Base();
		Base b = new Sub();
		System.out.println("Base Class: ");
		a.method1();
		a.method3();
		a.method4();
		a.method5();
		System.out.println("Sub Class: ");
		b.method1();
		b.method3();
		b.method4();
		b.method5();
	}
}