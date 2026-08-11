import java.util.Scanner;
import java.util.HashSet;

class UniqueStringTraversal {
    private String str;

    public UniqueStringTraversal(String str) {
        this.str = str;
    }

    public String processString() {
        HashSet<Character> set = new HashSet<>();
        StringBuilder unique = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (!set.contains(ch)) {
                set.add(ch);
                unique.append(ch);
            }
        }
        return unique.toString();
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        UniqueStringTraversal obj = new UniqueStringTraversal(input);
        System.out.println(obj.processString());
        sc.close();
    }
}

