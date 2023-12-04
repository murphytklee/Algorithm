import java.util.Arrays;

public class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int x = numbers[0] * numbers[1];
        int y = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        return Math.max(x, y);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numbers = {0, -31, 24, 10, 1, 9};
        int answer = sol.solution(numbers);
        System.out.println("answer = " + answer);
    }
}
