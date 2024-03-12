import java.util.*;

public class Solution {
    public int[] solution(int[] numlist, int n) {
        Integer[] numArray = Arrays.stream(numlist).boxed().toArray(Integer[]::new);

        Arrays.sort(numArray, (a, b) -> {
            int distA = Math.abs(a - n);
            int distB = Math.abs(b - n);

            if (distA == distB)
                return Integer.compare(b, a);
            else
                return Integer.compare(distA, distB);
        });

        return Arrays.stream(numArray).mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numlist = {1, 2, 3, 4, 5, 6};
        int n = 4;
        int[] answer = sol.solution(numlist, n);
        System.out.println(Arrays.toString(answer));
    }
}
