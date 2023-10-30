import java.util.*;

public class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        answer = my_string.split(" ");
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "i love you";
        String[] answer = sol.solution(my_string);
        System.out.println("answer = " + Arrays.toString(answer));
    }
}
