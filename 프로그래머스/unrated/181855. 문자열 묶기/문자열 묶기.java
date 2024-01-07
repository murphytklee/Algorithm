import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (String str : strArr) {
            int length = str.length();
            countMap.put(length, countMap.getOrDefault(length, 0) + 1);
        }

        int maxCount = 0;
        for (int count : countMap.values()) {
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] strArr = {"a","bc","d","efg","hi"};
        int answer = sol.solution(strArr);
        System.out.println("answer = " + answer);
    }
}
