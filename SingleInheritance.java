import java.util.*;
class Add{
    private int a,b;
    Add(){
        Scanner scn = new Scanner(System.in);
        a = scn.nextInt();
        b = scn.nextInt();
    }
    public int get_a(){
        return a;
    }
    public int get_b(){
        return b;
    }
}

  class Sum extends Add{
    int c;
    public void display(){
        c = (int)(get_a()+get_b());
        System.out.println("Sum : "+c);
    }
}
public class SingleInheritance
{
    public static void main(String[] args){
	    Sum s = new Sum();
	    s.display();
    }
}