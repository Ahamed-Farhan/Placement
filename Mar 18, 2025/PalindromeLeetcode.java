class PalindromeLeetcode {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int number=x;
        int reverse=0, digit=0;
        while(number>0){
            digit = number%10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        if(reverse == x)
            return true;
        else
            return false;
    }
}