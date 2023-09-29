import java.util.Arrays;

public class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > answer[0]){
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] array = {1, 8, 3};
        int[] answer = sol.solution(array);
        System.out.println("answer = " + Arrays.toString(answer));
    }
}
