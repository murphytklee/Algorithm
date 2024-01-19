import java.util.Arrays;

public class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for (int i = 0; i < n; i++) {
            answer[i][i] = 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 3;
        int[][] answer = sol.solution(n);
        System.out.println("Arrays.deepToString(answer) = " + Arrays.deepToString(answer));
    }
}