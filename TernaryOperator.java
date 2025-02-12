import java.util.*;
class TernaryOperator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a= scn.nextInt();
        int b= scn.nextInt();
        int c= scn.nextInt();
        int max = (a>b&&a>c)?a:(b>c)?b:c;
        System.out.println("Greatest is : "+max);
    }
}