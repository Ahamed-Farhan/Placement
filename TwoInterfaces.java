interface A{
    static void displayA(){
        System.out.println("A");
    }
    default void displayB(){
        System.out.println("B");
    }
    abstract void displayC();
}

interface B extends A{
    static void displayA(){
        System.out.println("a");
    }
    default void displayB(){
        System.out.println("b");
    }
    abstract void displayC();
}

class Print implements A,B{
    public void displayC(){
        System.out.println("C");
    }
    public void displayB(){
        B.super.displayB();
    }
    public void pi(){
        B.displayA();
        displayB();
    }
}

public class TwoInterfaces
{
	public static void main(String[] args) {
		Print p = new Print();
		p.pi();
		p.displayC();
	}
}