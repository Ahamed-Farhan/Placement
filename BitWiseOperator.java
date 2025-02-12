import java.util.*;
class BitWiseOperator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a= scn.nextInt();
        int b= scn.nextInt();
        int and=a&b;
        int or=a|b;
        int exor=a^b;
        System.out.println("And is : "+ and);
        System.out.println("Or is : "+ or);
        System.out.println("ExOr is : "+ exor);
    }
}