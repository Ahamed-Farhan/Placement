import java.util.*;
public class Classes_Objects
{
	public static void main(String[] args) {
		Myclass.getinfo();
	}
}

class Myclass{
    public static void getinfo(){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        String arr[] = new String[n];
        Long reg[] = new Long[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter name: ");
            arr[i] = scn.nextLine();
            System.out.println("Enter reg.no: ");
            reg[i] = scn.nextLong();
            scn.nextLine();
        }
        for(int i=0;i<n;i++){
            System.out.println("Name : " +arr[i]+"\tReg.no : " + reg[i]);
        }
        scn.close();
        
    }
}