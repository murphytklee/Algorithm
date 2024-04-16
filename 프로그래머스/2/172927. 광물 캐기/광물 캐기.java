import java.util.*;

public class Solution {

    public int solution(int[] picks, String[] minerals) {
        int answer = 0;
        int[][] fatigue = {{1, 1, 1}, {5, 1, 1}, {25, 5, 1}};

        int totalPicks = Arrays.stream(picks).sum();
        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < minerals.length; i += 5) {
            if (totalPicks == 0){
                break;
            }

            int dia = 0, iron = 0, stone = 0;

            for (int j = i; j < i + 5; j++) {
                if (j == minerals.length){
                    break;
                }
                String mineral = minerals[j];
                int val = getMineralTypeIndex(mineral);
                dia += fatigue[0][val];
                iron += fatigue[1][val];
                stone += fatigue[2][val];
            }
            list.add(new int[]{dia, iron, stone});
            totalPicks--;
        }
        
        Collections.sort(list, (o1, o2) -> o2[2] - o1[2]);
        
        for (int[] m : list) {
            int dia = m[0];
            int iron = m[1];
            int stone = m[2];

            if (picks[0] > 0) {
                answer += dia;
                picks[0]--;
            } else if (picks[1] > 0) {
                answer += iron;
                picks[1]--;
            } else if (picks[2] > 0) {
                answer += stone;
                picks[2]--;
            }
        }

        return answer;
    }

    private int getMineralTypeIndex(String mineral) {
        switch (mineral) {
            case "diamond":
                return 0;
            case "iron":
                return 1;
            case "stone":
                return 2;
            default:
                return -1;
        }
    }
}
