import java.util.Arrays;

public class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n / k];
        for (int i = 1; i <= n / k; i++) {
            answer[i - 1] = i * k;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 10;
        int k = 3;
        int[] answer = sol.solution(n, k);
        System.out.println("answer = " + Arrays.toString(answer));
    }
}
