import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer;
        if (k % 2 == 0) {
            answer = Arrays.stream(arr)
                    .map(num -> num + k)
                    .toArray();
        } else {
            answer = Arrays.stream(arr)
                    .map(num -> num * k)
                    .toArray();
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1, 2, 3, 100, 99, 98};
        int k = 3;
        int[] answer = sol.solution(arr, k);
        System.out.println("answer = " + Arrays.toString(answer));
    }
}
