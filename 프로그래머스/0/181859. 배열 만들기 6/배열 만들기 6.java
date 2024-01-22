import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        int i = 0;

        while (i < arr.length){
            if (stk.isEmpty()){
                stk.push(arr[i]);
                i++;
            } else if (stk.peek().equals(arr[i])) {
                stk.pop();
                i++;
            } else {
                stk.push(arr[i]);
                i++;
            }
        }

        int size = stk.size();
        return size > 0 ? createResultArray(stk, size) : new int[]{-1};
    }

    private int[] createResultArray(Stack<Integer> stk, int size) {
        int[] answer = new int[size];
        for (int j = size - 1; j >= 0; j--) {
            answer[j] = stk.pop();
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {0, 1, 1, 1, 0};
        int[] answer = sol.solution(arr);
        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
    }
}
