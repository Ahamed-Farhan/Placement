import java.util.*;

class RotatePrime {
    boolean prime(int a) {
        if (a < 2) return false;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    int countOfDigits(int temp) {
        return String.valueOf(temp).length();
    }

    int rotate(int a) {
        int count = countOfDigits(a);
        int power = (int) Math.pow(10, count - 1);
        int firstDigit = a / power;
        int remainingPart = a % power;
        return remainingPart * 10 + firstDigit;
    }
    
    int reverse(int a){
        int temp = a,rev=0;
        while(temp>0){
            rev = rev*10+(temp%10);
            temp/=10;
        }
        return rev;
    }
}

public class PrimeRotation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        scn.close();
        
        int original = a;
        boolean allPrime = true;
        
        RotatePrime r = new RotatePrime();
        int count = r.countOfDigits(a);
        
        for (int i = 0; i < count; i++) {
            System.out.println(a + " : " + (r.prime(a) ? "Prime" : "Not Prime"));
            if (!r.prime(a)) {
                allPrime = false;
            }
            a = r.rotate(a);
        }
        
        if (allPrime) {
            System.out.println(original + " is a Circular Prime");
        } else {
            System.out.println(original + " is NOT a Circular Prime");
        }
    }
}
