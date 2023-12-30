import java.util.Arrays;

public class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];

        for (char c: my_string.toCharArray()) {
            if (c >= 'A' && c <= 'Z'){
                answer[c - 'A'] += 1;
            } else if (c >= 'a' && c <= 'z') {
                answer[c - 'a' + 26] += 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "Programmers";
        int[] answer = sol.solution(my_string);
        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
    }
}
