import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> frequency = new HashMap<>();

        for (int num : array) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        int maxFrequency = 0;
        int answer = -1;
        boolean flag = false;

        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            int value = entry.getKey();
            int count = entry.getValue();

            if (count > maxFrequency) {
                maxFrequency = count;
                answer = value;
                flag = false;
            } else if (count == maxFrequency) {
                flag = true;
            }
        }

        return flag ? -1 : answer;
    }
}
