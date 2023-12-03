import java.util.Arrays;

public class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);

        return numbers[numbers.length -1] * numbers[numbers.length -2];
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numbers = {1, 2, 3, 4, 5};
        int answer = sol.solution(numbers);
        System.out.println("answer = " + answer);
    }
}
