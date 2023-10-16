import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (j % queries[i][2] == 0){
                    arr[j]++;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 1}, {0, 3, 2}, {0, 3, 3}};
        int[] answer = sol.solution(arr, queries);
        System.out.println("answer = " + Arrays.toString(answer));
    }
}
