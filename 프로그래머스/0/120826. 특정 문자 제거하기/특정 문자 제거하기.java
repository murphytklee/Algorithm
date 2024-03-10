public class Solution {
    public String solution(String my_string, String letter) {
        return my_string.replaceAll(letter, "");
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "abcdef";
        String letter = "f";
        String answer = sol.solution(my_string, letter);
        System.out.println("answer = " + answer);
    }
}