import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] answer = new int[num_list.length];

        for (int i = n; i < num_list.length; i++) {
            list.add(num_list[i]);
        }

        for (int i = 0; i < n; i++) {
            list.add(num_list[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num_list = {5, 2, 1, 7, 5};
        int n = 3;
        int[] answer = sol.solution(num_list, n);
        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
    }
}
