public class Solution {

    // Method to calculate score
    public static int scoreOfString(String s) {
        int sum = 0;

        for (int i = 1; i < s.length(); i++) {
            int diff = Math.abs(s.charAt(i) - s.charAt(i - 1));
            sum = sum + diff;
        }
 
        return sum;
    }

    public static void main(String[] args) {
        String s = "code"; 

        int result = scoreOfString(s);   // calling the method
        System.out.println(result);
    }
