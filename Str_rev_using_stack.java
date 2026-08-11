import java.util.Scanner;
import java.util.Stack;
class Str_rev_using_stack{
    public static void main (String[] args ){
        Scanner sc = new Scanner(System.in);
        String Str = sc.nextLine();
        int n = Str.length();
        Stack<Character> stack = new Stack<>();
        for (int i = 0 ; i <n ; i ++){
            stack.push(Str.charAt(i));
        }
        for( int i = 0; i< n ; i++){
            System.out.print(stack.pop());
        }

    }
}