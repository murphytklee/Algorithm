import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                if (map.containsKey(photo[i][j])){
                    answer[i] += map.get(photo[i][j]);
                    System.out.println(map.get(photo[i][j]));
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        int[] answer = s.solution(name, yearning, photo);
        System.out.println(Arrays.toString(answer));
    }
}
