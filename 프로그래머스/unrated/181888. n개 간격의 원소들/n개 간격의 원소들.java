import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < num_list.length; i++) {
            list.add(num_list[i]);
            i += n - 1;
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num_list = {4, 2, 6, 1, 7, 6};
        int n = 2;
        int[] answer = sol.solution(num_list, n);
        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
    }
}
