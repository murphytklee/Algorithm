public class Solution {
    public String solution(String myString) {
        String answer = myString.replaceAll("[a-k]", "l");
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String myString = "abcdevwxyz";
        String answer = sol.solution(myString);
        System.out.println("answer = " + answer);
    }
}