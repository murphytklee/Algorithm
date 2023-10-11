import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                arr[j]++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 1}, {1, 2},{2, 3}};
        int[] answer = sol.solution(arr, queries);
        System.out.println("answer = " + Arrays.toString(answer));
    }
}
