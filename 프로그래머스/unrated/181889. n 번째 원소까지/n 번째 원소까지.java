import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = num_list[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num_list = {5, 2, 1, 7, 5};
        int n = 3;
        int[] answer = sol.solution(num_list, n);
        System.out.println("answer = " + Arrays.toString(answer));
    }
}
