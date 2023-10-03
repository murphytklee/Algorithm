import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int[] section = Arrays.copyOfRange(arr, intervals[i][0], intervals[i][1]+1);
            for (int j = 0; j < section.length; j++) {
                list.add(section[j]);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1, 2, 3, 4, 5};
        int[][] intervals = {{1, 3},{0, 4}};
        int[] answer = sol.solution(arr, intervals);
        System.out.println(Arrays.toString(answer));
    }
}
