import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        int n = progresses.length;

        int days = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int remaining = 100 - progresses[i];
            int dayRequired = (int) Math.ceil((double) remaining / speeds[i]);

            if (dayRequired > days) {
                if (count > 0) {
                    answer.add(count);
                }
                count = 1;
                days = dayRequired;
            } else {
                count++;
            }
        }

        if (count > 0) {
            answer.add(count);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};
        int[] answer = sol.solution(progresses, speeds);
        System.out.println("answer = " + Arrays.toString(answer));
    }
}
