import java.util.Scanner;
public class PatternNumberAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter m: ");
        int m = sc.nextInt();
        int sum = 0;
        int num = 0;
        for (int i = 1; i <= m; i++) {
            num = num * 10 + n;
            System.out.println(num);
            sum += num;
        }
        System.out.println("Sum: " + sum);
        
        sc.close();
    }
}
