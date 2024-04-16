import java.util.ArrayList;
import java.util.List;

public class Solution {

    public String[] solution(String[] picture, int k) {
        List<String> list = new ArrayList<>(picture.length * k);

        for (String s : picture) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < s.length(); j++) {
                sb.append(String.valueOf(s.charAt(j)).repeat(k));
            }
            for (int j = 0; j < k; j++) {
                list.add(sb.toString());
            }
        }
        
        return list.toArray(new String[0]);
    }
}
