import java.util.Arrays;

public class Solution {
    public int solution(int[] date1, int[] date2) {
        return Arrays.compare(date1, date2) < 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] date1 = {2021, 12, 28};
        int[] date2 = {2021, 12, 29};
        int answer = sol.solution(date1, date2);
        System.out.println("answer = " + answer);
    }
}