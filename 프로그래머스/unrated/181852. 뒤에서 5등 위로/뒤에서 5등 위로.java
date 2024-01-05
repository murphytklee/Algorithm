import java.util.Arrays;

public class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length - 5];
        Arrays.sort(num_list);

        for (int i = 0; i < num_list.length - 5; i++) {
            answer[i] = num_list[i + 5];
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
        int[] answer = sol.solution(num_list);
        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
    }
}
