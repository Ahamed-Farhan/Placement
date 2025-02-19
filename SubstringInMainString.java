public class SubstringInMainString {
    public static void main(String[] args) {
        String a = "0001100";
        String b = "110";
        int count, flag = 0;
        char[] arr_a = a.toCharArray();
        char[] arr_b = b.toCharArray();
        int a_len = arr_a.length;
        int b_len = arr_b.length;

        if (b_len > a_len) {
            System.out.println("Substring is Bigger than Original");
        } else {
            for (int i = 0; i <= (a_len - b_len); i++) {
                count = 0;
                for (int j = 0; j < b_len; j++) {
                    if (arr_a[i + j] == arr_b[j]) {
                        count++;
                    }
                }
                if (count == b_len) {
                    System.out.println("Substring Found at index " + i);
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("Substring Not Found");
            }
        }
    }
}
