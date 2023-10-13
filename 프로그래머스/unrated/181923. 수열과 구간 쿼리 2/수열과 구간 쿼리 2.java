import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int minValue = Integer.MAX_VALUE;
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (arr[j] > queries[i][2]){
                    minValue = Math.min(minValue, arr[j]);
                }
            }
            answer[i] = (minValue == Integer.MAX_VALUE) ? -1 : minValue;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};
        int[] answer = sol.solution(arr, queries);
        System.out.println("answer = " + Arrays.toString(answer));
    }
}
