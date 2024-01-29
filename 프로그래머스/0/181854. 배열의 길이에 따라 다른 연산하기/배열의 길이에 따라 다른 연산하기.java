import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = Arrays.copyOf(arr, arr.length);

        for (int i = 0; i < arr.length; i++) {
            if ((arr.length % 2 == 0 && i % 2 != 0) || (arr.length % 2 != 0 && i % 2 == 0)) {
                answer[i] += n;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {444, 555, 666, 777};
        int n = 100;
        int[] answer = sol.solution(arr, n);
        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
    }
}