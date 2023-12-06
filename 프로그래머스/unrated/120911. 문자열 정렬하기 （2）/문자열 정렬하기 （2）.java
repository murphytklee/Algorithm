import java.util.Arrays;

public class Solution {

    public String solution(String my_string) {
        char[] charArray = my_string.toLowerCase().toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "Bcad";
        String answer = sol.solution(my_string);
        System.out.println("answer = " + answer);
    }
}
