public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            answer++;
            while (answer % 3 == 0 || String.valueOf(answer).contains("3")){
                answer++;
            }
        }
        
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 40;
        int answer = sol.solution(n);
        System.out.println("answer = " + answer);
    }
}