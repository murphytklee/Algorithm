import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : tangerine) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> sortedValues = map.values().stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        for (int i = 0; i < sortedValues.size(); i++) {
            k -= sortedValues.get(i);
            answer++;
            if (k<=0){
                break;
            }
        }
//        System.out.println("map.values() = " + map.values().stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int k = 6;
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
        int answer = sol.solution(k, tangerine);
        System.out.println("answer = " + answer);
    }
}
