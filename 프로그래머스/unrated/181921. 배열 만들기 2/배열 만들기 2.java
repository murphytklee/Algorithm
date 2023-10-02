import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (isZeroAndFiveOnly(i)) {
                answer.add(i);
            }
        }

        if (answer.isEmpty()) {
            return new int[]{-1};
        } else {
            return answer.stream().mapToInt(Integer::intValue).toArray();
        }
    }

    private boolean isZeroAndFiveOnly(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit != 0 && digit != 5) {
                return false;
            }
            num /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int l = 5;
        int r = 555;
        int[] answer = sol.solution(l, r);
        System.out.println(Arrays.toString(answer));
    }
}
