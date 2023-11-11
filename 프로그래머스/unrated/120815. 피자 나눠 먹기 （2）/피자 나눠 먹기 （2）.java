public class Solution {
    public int solution(int n) {
        int answer = 1;
        while (!((6 * answer) % n == 0)){
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 6;
        int answer = sol.solution(n);
        System.out.println("answer = " + answer);
    }
}
