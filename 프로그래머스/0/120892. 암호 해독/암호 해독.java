public class Solution {
    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();
        for (int i = code - 1; i < cipher.length(); i += code) {
            answer.append(cipher.charAt(i));
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String cipher = "dfjardstddetckdaccccdegk";
        int code = 4;
        String answer = sol.solution(cipher, code);
        System.out.println("answer = " + answer);
    }
}