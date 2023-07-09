import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        Map<String, Integer> indexMap = new HashMap<>();
        Map<Integer, String> indexMap2 = new TreeMap<>();

        for (int i = 0; i < players.length; i++) {
            indexMap.put(players[i], i);
            indexMap2.put(i, players[i]);
        }

        for (int i = 0; i <callings.length ; i++) {
            // 추월한 선수
            String tempPlayer = callings[i];

            int tempIndex = indexMap.get(tempPlayer);

            // 추월당한 선수
            String tempPlayer2 = indexMap2.get(tempIndex-1);

            indexMap.replace(tempPlayer, (tempIndex-1)); // kai = 2
            indexMap.replace(tempPlayer2, tempIndex);

            indexMap2.replace(tempIndex-1, tempPlayer);
            indexMap2.replace(tempIndex, tempPlayer2);
        }
        for (int i = 0; i < players.length; i++) {
            answer[i] = indexMap2.get(i);
        }
        return answer;
    }
}