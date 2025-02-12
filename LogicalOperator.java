import java.util.*;
class LogicalOperator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a= scn.nextInt();
        int b= scn.nextInt();
        int c= scn.nextInt();
        System.out.println("For Short Circuit 1 or For Non Short Circuit 2: ");
        int choice= scn.nextInt();
        switch(choice){
        case 1:
            //short circuit operations
            if(a>b && a>c){
                System.out.println("Greatest is : " + a);
            }
            else if(b>a && b>c){
                System.out.println("Greatest is : " + b);
            }
            else{
                System.out.println("Greatest is : " + c);
            }
            break;
        case 2:
            //non-short circuit operations
            if(a>b & a>c){
                System.out.println("Greatest is : " + a);
            }
            else if(b>a & b>c){
                System.out.println("Greatest is : " + b);
            }
            else{
                System.out.println("Greatest is : " + c);
            }
        }
    }
}