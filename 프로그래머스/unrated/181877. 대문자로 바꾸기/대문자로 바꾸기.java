public class Solution {
    public String solution(String myString) {
        String answer = myString.toUpperCase();
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String myString = "aBcDeFg";
        String answer = sol.solution(myString);
        System.out.println("answer = " + answer);
    }
}
