abstract class Outer{
    abstract void printA();
    static void printB(){
        System.out.println("B");
    }
    static abstract class Inner{
        abstract void printC();
        static void printD(){
            System.out.println("D");
        }
    }
}

class Normal extends Outer{
    public void printA(){
        System.out.println("A");
    }
    public void printC(){
        System.out.println("C");
    }
    void display(){
        Outer.printB();
        Outer.Inner.printD();
    }
}
public class TwoAbstractClasses
{
	public static void main(String[] args) {
		Normal n = new Normal();
		n.printA();
		n.display();
		n.printC();
	}
}