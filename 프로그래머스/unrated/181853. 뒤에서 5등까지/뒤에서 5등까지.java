import java.util.Arrays;

public class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        return Arrays.copyOfRange(num_list, 0, 5);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
        int[] answer = sol.solution(num_list);
        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
    }
}
