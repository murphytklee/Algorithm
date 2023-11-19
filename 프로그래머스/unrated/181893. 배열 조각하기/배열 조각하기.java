import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr, int[] query) {
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                arr = Arrays.copyOfRange(arr, 0, query[i] + 1);
            } else {
                arr = Arrays.copyOfRange(arr, query[i], arr.length);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {0, 1, 2, 3, 4, 5};
        int[] query = {4, 1, 2};
        int[] answer = sol.solution(arr, query);
        System.out.println("answer = " + Arrays.toString(answer));
    }
}