public class ShiftingArrayElementsNTimes
{
	public static void main(String[] args) {
		int arr[] ={10,20,5,1,3,2};
		int len=arr.length;
		int n=3;
		int temp;
		for(int i=0;i<n;i++){
		    temp=arr[len-1];
		    for(int j=len-1;j>0;j--){
		        
		        arr[j]=arr[j-1];
		    }
		    arr[0]=temp;
		}
		for(int i=0;i<len;i++){
		    System.out.print(arr[i] + " ");
		}
	}
}
