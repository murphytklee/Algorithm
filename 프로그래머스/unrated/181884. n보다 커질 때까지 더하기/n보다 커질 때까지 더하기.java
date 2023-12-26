public class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;

        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
            if (answer > n){
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numbers = {34, 5, 71, 29, 100, 34};
        int n = 123;
        int answer = sol.solution(numbers, n);
        System.out.println("answer = " + answer);
    }
}
