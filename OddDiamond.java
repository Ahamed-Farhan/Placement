public class OddDiamond
{
	public static void main(String[] args) {
	    int n=5;
	    for(int i=1;i<=n*2;i++){
	        if(i%2!=0){
    		    for(int j=(n*2)-i;j>=1;j--){
    		        System.out.print(" ");
    		    }
    		    for(int k=1;k<=i;k++){
    		        System.out.print("* ");
    		    }
		    System.out.print("\n");
		    }
	    }
		    for(int i=(n*2)-2;i>=1;i--){
	        if(i%2!=0){
    		    for(int j=1;j<(n*2)-i;j++){
    		        System.out.print(" ");
    		    }
    		    for(int k=1;k<=i;k++){
    		        System.out.print(" *");
    		    }
		    System.out.print("\n");
		    }
	    }
	}
}