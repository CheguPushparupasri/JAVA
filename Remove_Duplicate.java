import java.util.Scanner;
class Remove_Duplicate {
    public static void main (String [ ] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String input = sc.nextLine();
        int[] freq = new int[26];
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            freq[c - 'a']++; 
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int index = c - 'a';
            
            if (freq[index] > 0) {
                result.append(c); 
                freq[index] = 0;  
            }
        }
        System.out.println("Original String: " + input);
        System.out.println("After Removing Duplicates: " + result.toString());       
    }
}















