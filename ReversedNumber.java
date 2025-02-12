class ReversedNumber {
    public static void main(String[] args) {
        int a=596;
        int sum=0;
        int temp;
        while(a>0){
            temp=a%10;
            sum=temp+sum*10;
            a=a/10;
        }
        System.out.println(sum);
    }
}