import java.util.Scanner;
class Count_Repeated_Word{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        int cnt = 0;
        for(int  i =0; i<n; i++){
            if(str.charAt(i) == 'h' && str.charAt(i+1) == 'i' && str.charAt(i+2) == ' '){
                cnt ++;
            }
        }
        System.out.println(str + ":" + cnt);
        
    }
}