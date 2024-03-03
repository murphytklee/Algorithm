import java.util.*;

public class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < emergency.length; i++) {
            map.put(emergency[i], i);
        }

        Arrays.sort(emergency);
        int order = 1;
        for (int i = emergency.length - 1; i >= 0; i--) {
            answer[map.get(emergency[i])] = order++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] emergency = {3, 76, 24};
        int[] result = sol.solution(emergency);
        System.out.println("Result: " + Arrays.toString(result));
    }
}
