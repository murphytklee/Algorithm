import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        List<String> list = new ArrayList<>(Arrays.asList("aya", "ye", "woo", "ma"));

        for (int i = 0; i < babbling.length; i++) {
            for (String str : list) {
                while (babbling[i].contains(str)) {
                    babbling[i] = babbling[i].replace(str, " ");
                }
            }
            if (babbling[i].trim().isEmpty()){
                answer++;
            }
        }
        return answer;
    }
}
