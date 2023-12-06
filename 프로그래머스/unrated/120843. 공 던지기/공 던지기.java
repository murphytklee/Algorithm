public class Solution {
    public int solution(int[] numbers, int k) {
        int answer = numbers[((k - 1) * 2) % numbers.length];
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int k = 5;
        int answer = sol.solution(numbers, k);
        System.out.println("answer = " + answer);
    }
}
