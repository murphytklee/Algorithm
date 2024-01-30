public class Solution {
    public String solution(int n) {
        String answer = Integer.toString(n);
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 123;
        String answer = sol.solution(n);
        System.out.println("answer = " + answer);
    }
}