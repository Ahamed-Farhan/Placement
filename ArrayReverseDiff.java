public class ArrayReverseDiff
{
	public static void main(String[] args) {
		int arr[] ={1,2,3,4,5,6,7,8,9,10,11,12};
		int n=3;
		int temp=(n-1)+n;
    	for(int i=n-1;i>=0;i--){
    		   System.out.print(arr[i]);
    	}
    	while(temp<=arr.length+1){
    	    for(int i=temp;i>=n;i--){
    	        System.out.print(arr[i]);
    	    }
    	    temp=temp+n;
    	    n+=n;
    	}
	}
}