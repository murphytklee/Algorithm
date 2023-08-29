import java.util.Arrays;

class Solution {
    public int[] solution(int start_num, int end_num) {
        int size = end_num - start_num + 1;
        int[] answer = new int[size];

        for (int i = 0; i < size; i++) {
            answer[i] = start_num + i;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int start_num = 3;
        int end_num = 10;
        int[] answer = sol.solution(start_num, end_num);
        System.out.println("answer = " + Arrays.toString(answer));
    }
}
