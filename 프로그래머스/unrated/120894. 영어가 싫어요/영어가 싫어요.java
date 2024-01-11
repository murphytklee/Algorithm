import java.util.HashMap;
import java.util.Map;

public class Solution {
    public long solution(String numbers) {
        long answer = 0;
        int currentIndex = 0;
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> numberMap = new HashMap<>();

        numberMap.put("zero", 0);
        numberMap.put("one", 1);
        numberMap.put("two", 2);
        numberMap.put("three", 3);
        numberMap.put("four", 4);
        numberMap.put("five", 5);
        numberMap.put("six", 6);
        numberMap.put("seven", 7);
        numberMap.put("eight", 8);
        numberMap.put("nine", 9);

        while (currentIndex < numbers.length()) {
            for (String number : numberMap.keySet()) {
                if (numbers.startsWith(number, currentIndex)) {
                    sb.append(numberMap.get(number));
                    currentIndex += number.length();
                    break;
                }
            }
        }

        answer = Long.parseLong(sb.toString());
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String numbers = "onefourzerosixseven";
        long answer = sol.solution(numbers);
        System.out.println("answer = " + answer);
    }
}
