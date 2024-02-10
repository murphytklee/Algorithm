import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public String solution(String s) {
        return Arrays.stream( s.split(""))
                .filter( c -> s.indexOf(c) == s.lastIndexOf(c))
                .sorted()
                .collect( Collectors.joining() );
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "hello";
        String answer = sol.solution(s);
        System.out.println("answer = " + answer);
    }
}