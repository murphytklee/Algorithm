import java.util.Arrays;

class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int sum = Arrays.stream(numbers).sum();
        answer = (double) sum / numbers.length;
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double answer = sol.solution(numbers);
        System.out.println("answer = " + answer);
    }
}
