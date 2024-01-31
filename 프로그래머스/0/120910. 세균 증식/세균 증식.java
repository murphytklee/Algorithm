public class Solution {
    public int solution(int n, int t) {
        int answer = n;
        for (int i = 1; i <= t; i++) {
            answer *= 2;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 2;
        int t = 10;
        int answer = sol.solution(n, t);
        System.out.println("answer = " + answer);
    }
}