class Super{
    int a;
    public Super(){
        a=10;
    }
    
    void disp(){
        System.out.println("Super a : "+a);
    }
}

class Sub extends Super{
    int a=100;
    public Sub(){
            super();
        }
    public void disp(){
        System.out.println("Super : " +super.a+ "\nSub : "+a);
    }
}
public class SuperKeyword
{
	public static void main(String[] args) {
		Sub s = new Sub();
		s.disp();
	}
}