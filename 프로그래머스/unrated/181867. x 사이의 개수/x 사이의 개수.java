import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] solution(String myString) {
        System.out.println("myString = " + myString.length());

        String[] split = myString.split("x");
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < split.length; i++) {
            list.add(split[i].length());
        }
        if (myString.charAt((myString.length()-1)) == 'x'){
            list.add(0);
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String myString = "oxooxoxxox";
        int[] answer = sol.solution(myString);
        System.out.println("answer = " + Arrays.toString(answer));
    }
}
