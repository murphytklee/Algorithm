import java.util.LinkedHashSet;
import java.util.Set;

public class Solution {
    public String solution(String my_string) {
        Set<Character> uniqueChars = new LinkedHashSet<>();

        for (char c : my_string.toCharArray()) {
            uniqueChars.add(c);
        }

        StringBuilder result = new StringBuilder();
        for (char c : uniqueChars) {
            result.append(c);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "We are the world";
        String answer = sol.solution(my_string);
        System.out.println("answer = " + answer);
    }
}