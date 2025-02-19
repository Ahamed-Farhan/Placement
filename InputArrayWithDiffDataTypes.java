import java.util.*;
public class InputArrayWithDiffDataTypes
{
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
		int inarr[]= new int[n];
		double darr[]=new double[n];
		float farr[]=new float[n];
		char carr[]=new char[n];
		
		for(int i=0;i<n;i++){
		    System.out.print("Enter an Integer: ");
		    inarr[i]=scn.nextInt();
		    System.out.print("Enter a Double: ");
		    darr[i]=scn.nextDouble();
		    System.out.print("Enter a Float: ");
		    farr[i]=scn.nextFloat();
		    System.out.print("Enter a Character: ");
		    carr[i]=scn.next().charAt(0);
		}
		
		for(int i=1;i<=n;i++){
		    System.out.print("Integer "+i+":" +inarr[i-1]+"\t");
		    System.out.print("Double "+i+":" +darr[i-1]+"\t");
		    System.out.print("Float "+i+":" +farr[i-1]+"\t");
		    System.out.print("Character "+i+":" +carr[i-1]+"\t");
		    System.out.println();
		}
	}
}