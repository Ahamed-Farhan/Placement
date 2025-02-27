import java.util.*;

interface SBI{
    void cash();
}

interface Indian{
    void cash();
}

interface CUB{
    void cash();
}

class RBI implements SBI,Indian,CUB{
    public void cash(){
        System.out.println("RBI");
    }
}
public class Interface
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		RBI r = new RBI();
		r.cash();
	}
}