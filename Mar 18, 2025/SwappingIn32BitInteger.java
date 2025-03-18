import java.util.*;
public class SwappingIn32BitInteger
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt(), i = scn.nextInt() , j = scn.nextInt();
		String ch_i="",ch_j="";
		String bin = String.format("%32s", Integer.toBinaryString(num)).replaceAll(" ", "0");
		StringBuilder str = new StringBuilder(bin);
		ch_i=ch_i+str.charAt(i);
		ch_j=ch_j+str.charAt(j);
		str.replace(i,i+1,ch_j);
		str.replace(j,j+1,ch_i);
		int res = Integer.parseInt(str.toString(), 2);
		System.out.println(res);
	}
}