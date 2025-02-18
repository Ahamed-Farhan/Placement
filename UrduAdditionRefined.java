public class UrduAdditionRefined
{
	public static void main(String[] args) {
		int a[] ={5,1,3};
		int b[] ={9,7,7,7};
		String res="";
		int carry=0,sum=0,i=0,j=0,k=0;
		while(i<a.length||j<b.length||carry>0){
		    if(i<a.length ){
		        carry+=a[i];
		        i++;
		    }
		    if(j<b.length ){
		        carry+=b[j];
		        j++;
		    }
		    res+=(char)((carry%10)+'0');
		    carry/=10;
		    k++;
		    }
		    char resu[] = res.toCharArray();
		    for(i=0;i<resu.length;i++){
		        System.out.print(resu[i]+"\t");
		    }
		}
		
	}
