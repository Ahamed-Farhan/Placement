import java.util.Scanner;

public class addLargestAddition {
    public static String addLargeNumbers(String num1, String num2) {
        // Convert both numbers to character arrays
        char[] arr1 = num1.toCharArray();
        char[] arr2 = num2.toCharArray();

        int i = arr1.length - 1;  // Pointer for first number (rightmost digit)
        int j = arr2.length - 1;  // Pointer for second number
        int carry = 0;            // Carry for addition
        StringBuilder result = new StringBuilder();

        // Process each digit from right to left
        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? arr1[i] - '0' : 0; // Convert char to int
            int digit2 = (j >= 0) ? arr2[j] - '0' : 0;
            
            int sum = digit1 + digit2 + carry;  // Sum including carry
            result.append(sum % 10);           // Append last digit of sum
            carry = sum / 10;                  // Carry for next iteration
            
            i--;  // Move left
            j--;
        }

        return result.reverse().toString(); // Reverse since we built it backwards
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first large number: ");
        String num1 = sc.nextLine();
        
        System.out.print("Enter second large number: ");
        String num2 = sc.nextLine();
        
        String sum = addLargeNumbers(num1, num2);
        System.out.println("Sum: " + sum);
        
        sc.close();
    }
}
