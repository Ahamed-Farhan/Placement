public class EliminateDuplicateInArray
{
	public static void main(String[] args) {
		int arr[] ={3,2,3,1,2,9};
		for(int i=0;i<arr.length;i++){
		    for(int j=i+1;j<arr.length;j++){
		        if(arr[i]==arr[j])
		            arr[j]=-1;
		    }
		}
		for(int i=0;i<arr.length;i++){
		    if(arr[i]>0)
		        System.out.print(arr[i]);
		}
	}
}