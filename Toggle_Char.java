import java.util.Scanner; 

class Toggle_Char { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a String :"); 
        String str = sc.nextLine();        
        // We use StringBuilder because regular Strings cannot be changed directly
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                // Task 1: Replace spaces with '@'
                result.append('@');
            } else if (Character.isLowerCase(ch)) {
                // Task 2: Convert lower case to upper case
                result.append(Character.toUpperCase(ch));
            } else if (Character.isUpperCase(ch)) {
                // Task 2: Convert upper case to lower case
                result.append(Character.toLowerCase(ch));
            } else {
                // Keep numbers or punctuation exactly as they are
                result.append(ch);
            }
        }
        System.out.println("Result: " + result.toString());
        sc.close(); 
    }   
}
