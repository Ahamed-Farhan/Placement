import java.util.*;

class CountAlpha {
    void cal(String str) {
        StringBuilder res = new StringBuilder();
        StringBuilder numStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isLetter(c)) {
                if (res.length() > 0 && numStr.length() > 0) {
                    int repeatCount = Integer.parseInt(numStr.toString());
                    System.out.print(res.toString().repeat(repeatCount));
                    res.setLength(0);
                    numStr.setLength(0);
                }

                res.append(c);
            } 
            else if (Character.isDigit(c)) {
                numStr.append(c);
            } 
            else {
                System.out.println("Invalid character found: " + c);
                return;
            }
        }

        if (res.length() > 0) {
            if (numStr.length() > 0) {
                int repeatCount = Integer.parseInt(numStr.toString());
                System.out.print(res.toString().repeat(repeatCount));
            } else {
                System.out.print(res.toString());
            }
        }
    }
}

public class AlphaCountPrintMultipleDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scn.nextLine();
        scn.close();
        
        CountAlpha ca = new CountAlpha();
        ca.cal(str);
    }
}
