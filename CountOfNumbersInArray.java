public CountOfNumbersInArray
{
	public static void main(String[] args) {
		int arr[] ={3,2,3,1,2,9};
		int count=1;
		for(int i=0;i<arr.length;i++){
		    if(arr[i]>-1){
    		    for(int j=i;j<arr.length;j++){
    		        if(i==j) continue;
    		        if(arr[i]==arr[j]){
    		            count++;
    		            arr[j]=-1;
    		        }
    		    }
    		    System.out.println(arr[i] + ":" + count);
    		    count=1;
		    }
		}
	}
}