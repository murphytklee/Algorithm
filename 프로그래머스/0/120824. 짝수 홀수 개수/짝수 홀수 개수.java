import java.util.Arrays;

public class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for (int i : num_list) {
            if (i % 2 == 0){
                answer[0]++;
            } else {
                answer[1]++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num_list = {1, 2, 3, 4, 5};
        int[] answer = sol.solution(num_list);
        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
    }
}
