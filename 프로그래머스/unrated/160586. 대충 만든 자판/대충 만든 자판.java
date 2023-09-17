import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < keymap.length; i++) {
            for (int j = 0; j < keymap[i].length(); j++) {
                String c = String.valueOf(keymap[i].charAt(j));

                if (!map.containsKey(c) || map.get(c) > j+1){
                    map.put(c, j + 1);
                }
            }
        }

        for (int i = 0; i < targets.length; i++) {
            for (int j = 0; j < targets[i].length(); j++) {
                String targetC = String.valueOf(targets[i].charAt(j));
                if (map.containsKey(targetC)){
                    answer[i] += map.get(targetC);
                } else {
                    answer[i] = -1;
                    break;
                }

            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] keymap = {"ABACD", "BCEFD"};
        String[] targets = {"ABCD","AABB"};
        int[] answer = sol.solution(keymap, targets);
        System.out.println("answer = " + Arrays.toString(answer));
    }
}
