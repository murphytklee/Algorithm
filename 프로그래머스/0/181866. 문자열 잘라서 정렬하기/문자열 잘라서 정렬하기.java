import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public String[] solution(String myString) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        myString += "x";
        for (char c : myString.replaceAll(" ", "").toCharArray()) {
            if (c != 'x'){
                sb.append(c);
            } else {
                if (sb.length() > 0){
                    list.add(sb.toString());
                }
                sb.setLength(0);
            }
        }

        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String myString = " dxccxbbbxaaaa";
        String[] answer = sol.solution(myString);
        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
    }
}
