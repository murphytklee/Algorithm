import java.util.Arrays;

public class Solution {
    public int[] solution(int[] num_list, int n) {
        num_list = Arrays.copyOfRange(num_list, n - 1, num_list.length);
        return num_list;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num_list = {5, 2, 1, 7, 5};
        int n = 2;
        int[] answer = sol.solution(num_list, n);
        System.out.println("answer = " + Arrays.toString(answer));
    }
}