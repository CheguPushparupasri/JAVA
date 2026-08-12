class Solution {
    public int scoreOfString(String s) {
        int n = s.length();
        int temp , score = 0;
        for(int i = 0; i< n-1 ; i++){
            temp = Math.abs(s.charAt(i) - s.charAt(i+1));
            score = score + temp ;            
        }
        return score;
    }    
        public static void main(String [] args){
            String s;
            int result = scoreOfString(s);
            System.out.println(result);

        }      
}
