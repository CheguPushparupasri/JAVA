import java.util.ArrayList;
class Remove_Prime_num_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();     
        // 1. Add some numbers to the ArrayList
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(6);
        arr.add(7);
        arr.add(10);
        arr.add(11);      
        System.out.println("Original List: " + arr);
        
        // 2. Loop backwards to safely remove items while iterating
        for (int i = arr.size() - 1; i >= 0; i--) {
            if (isPrime(arr.get(i))) {
                arr.remove(i);
            }
        }
        
        System.out.println("List after removing primes: " + arr);
    }
    
    // 3. Helper method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; 
            }
        }
        return true;
    }
}
