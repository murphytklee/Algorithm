import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i++) {
            list.add(my_string.substring(i));
        }
        list.sort(String::compareTo);
        
        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String myString = "programmers";
        String[] answer = sol.solution(myString);
        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
    }
}
