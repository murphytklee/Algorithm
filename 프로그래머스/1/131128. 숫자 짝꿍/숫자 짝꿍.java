import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String solution(String X, String Y) {
        Map<Character, Integer> countMapX = new HashMap<>();
        Map<Character, Integer> countMapY = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (char digit : X.toCharArray()) {
            countMapX.put(digit, countMapX.getOrDefault(digit, 0) + 1);
        }
        for (char digit : Y.toCharArray()) {
            countMapY.put(digit, countMapY.getOrDefault(digit, 0) + 1);
        }

        for (char digit = '9'; digit >= '0'; digit--) {
            if (countMapX.containsKey(digit) && countMapY.containsKey(digit)) {
                int min = Math.min(countMapX.get(digit), countMapY.get(digit));
                for (int j = 0; j < min; j++) {
                    sb.append(digit);
                }
            }
        }

        if (sb.length() == 0) {
            return "-1";
        } else if (sb.charAt(0) == '0') {
            return "0";
        } else {
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String X = "100";
        String Y = "203045";
        String answer = sol.solution(X, Y);
        System.out.println("answer = " + answer);
    }
}
