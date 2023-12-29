import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].contains("ad")){
                continue;
            } else {
                list.add(strArr[i]);
            }
        }

        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] strArr = {"and","notad","abcd"};
        String[] answer = sol.solution(strArr);
        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
    }
}
