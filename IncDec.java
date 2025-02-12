import java.util.*;
class IncDec {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a=1,b=1,c=1;
        int v= --a + a++ + ++a +--a + a++;
        int z= b++ + ++b + ++b + b++ + ++b;
        int x= --c + --c + --c + --c;
        System.out.println(v+"\n"+z+"\n"+x);
    }
}