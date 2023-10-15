import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        ArrayList<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toCollection(ArrayList::new));
        for (int[] query : queries) {
            Collections.swap(list, query[0], query[1]);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 3}, {1, 2}, {1, 4}};
        int[] answer = sol.solution(arr, queries);
        System.out.println("answer = " + Arrays.toString(answer));
    }
}
