import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public String[] solution(String myStr) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder temp = new StringBuilder();

        for (char c : myStr.toCharArray()) {
            if (c == 'a' || c == 'b' || c == 'c'){
                if (temp.length() > 0) {
                    list.add(temp.toString());
                    temp.setLength(0);
                }
            } else {
                temp.append(c);
            }
        }
        
        if (temp.length() > 0) {
            list.add(temp.toString());
        }

        String[] answer = list.isEmpty() ? new String[]{"EMPTY"} : list.toArray(new String[0]);

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String myStr = "baconlettucetomato";
        String[] answer = sol.solution(myStr);
        System.out.println("Arrays.toString(ans) = " + Arrays.toString(answer));
    }
}
