public class LeftPyramid
{
	public static void main(String[] args) {
	    /*printing 1
	               11
	               111
	               1111
	               11111*/
	    for(int i=1;i<=5;i++){
		    for(int j=1;j<=i;j++){
		        System.out.print("1");
		    }
		    System.out.print("\n");
		}         
	    /*printing 1
	               12
	               123
	               1234
	               12345*/
		for(int i=1;i<=5;i++){
		    for(int j=1;j<=i;j++){
		        System.out.print(j);
		    }
		    System.out.print("\n");
		}
		/*printing 1
    	           22
    	           333
    	           4444
    	           55555*/
		for(int i=0;i<=5;i++){
		    for(int j=1;j<=i;j++){
		        System.out.print(i);
		    }
		    System.out.print("\n");
		}
	}
}