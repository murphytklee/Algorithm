import java.util.Arrays;

public class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder(my_string);
        Arrays.sort(indices);
        for (int i = 0; i < indices.length; i++) {
            answer.deleteCharAt(indices[i] - i);
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "apporoograpemmemprs";
        int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};
        String answer = sol.solution(my_string, indices);
        System.out.println("answer = " + answer);
    }
}