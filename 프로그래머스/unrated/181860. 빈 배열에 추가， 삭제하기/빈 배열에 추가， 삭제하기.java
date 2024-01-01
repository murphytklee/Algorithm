import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < flag.length; i++) {
            if (flag[i]){
                for (int j = 0; j < arr[i] * 2; j++) {
                    stack.push(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    stack.pop();
                }
            }
        }

        int[] answer = new int[stack.size()];
        for (int i = answer.length - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {3, 2, 4, 1, 3};
        boolean[] flag = {true, false, true, false, false};
        int[] answer = sol.solution(arr, flag);
        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
    }
}
