import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        while (i < arr.length){
            if (stack.isEmpty()){
                stack.push(arr[i]);
                i++;
            } else if (stack.peek() < arr[i]) {
                stack.push(arr[i]);
                i++;
            } else {
                stack.pop();
            }
        }
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1, 4, 2, 5, 3};
        int[] answer = sol.solution(arr);
        System.out.println(Arrays.toString(answer));
    }
}
