public class HollowDiamond
{
	public static void main(String[] args) {
	    int n=4;
	    for(int i=1;i<=n;i++){
		    for(int j=n-i;j>=1;j--){
		        System.out.print(" ");
		    }
		    for(int k=1;k<=i;k++){
		        if(k==1||k==i) System.out.print("* ");
		        else System.out.print("0 ");
		    }
		    System.out.print("\n");
		}
		for(int i=n-1;i>=1;i--){
		    for(int j=1;j<=n-i;j++){
		        System.out.print(" ");
		    }
		    for(int k=1;k<=i;k++){
		       if(k==1||k==i) System.out.print("* ");
		        else System.out.print("0 ");
		    }
		    System.out.print("\n");
		}
	}
}
