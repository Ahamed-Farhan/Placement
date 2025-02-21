import java.util.*;
public class HappyNumbers
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.nextLine();
        System.out.println(happynumber(n));
	}
	
	public static int happynumber(int n){
	    HashSet<Integer> visited = new HashSet<>();
	    int hpmn=0, temp=n, flag = 0, tsum = 0;
	    while(temp>0){
	        tsum = temp%10;
	        hpmn=hpmn + (int)(Math.pow(tsum,2));
	        temp/=10;
	        if(temp==0){
	            if(hpmn==1){
	                flag=1;
	                break;
	            }
	            if(visited.contains(hpmn)){
	                flag = -1;
	                break;
	            }
	            visited.add(hpmn);
	            temp = hpmn;
	            hpmn = 0;
	        }
	    }
	    return flag;
	}
}