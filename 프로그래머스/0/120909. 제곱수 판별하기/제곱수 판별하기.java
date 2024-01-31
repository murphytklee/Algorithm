public class Solution {
    public int solution(int n) {
        return Math.sqrt(n) % 1 == 0 ? 1 : 2;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 144;
        int answer = sol.solution(n);
        System.out.println("answer = " + answer);
    }
}