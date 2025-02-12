import java.util.*;

class CheckPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int num = 2;
        while (num <= n) {
            boolean prime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(num + "\t");
            }
            num++;
        }
    }
}
