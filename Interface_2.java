interface A{
    void display();
    static void func(){
        System.out.println("Function Display");
    }
}
class New implements A{
    public void display(){
        System.out.println("Display");
    }
}
public class Interface_2
{
	public static void main(String[] args) {
		New n = new New();
		n.display();
		A.func();
	}
}