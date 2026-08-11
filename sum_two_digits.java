class sum_two_digits {
    public static void main(String[] args){
        int num = 23 ;
        int sum = 0;
        int rem ;
        for(int i = 0; i<= 2 ; i++){
            rem = num % 10;
            sum = sum -(-rem);
            num = num /10;
        }
        System.out.print(sum);
    }
}