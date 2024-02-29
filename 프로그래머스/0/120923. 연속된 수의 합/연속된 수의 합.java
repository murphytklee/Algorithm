import java.util.Arrays;

public class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = total / num - (num - 1) / 2;

        for (int i = 0; i < num; i++) {
            answer[i] = start + i;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int num = 4;
        int total = 14;
        int[] answer = sol.solution(num, total);
        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
    }
}
