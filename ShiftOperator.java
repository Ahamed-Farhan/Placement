import java.util.*;
class ShiftOperator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a= scn.nextInt();
        int b= 2;
        int lshift=a<<b;
        int rshift=a>>b;
        System.out.println("Left Shift : " + lshift);
        System.out.println("Right Shift : " + rshift);
    }
}