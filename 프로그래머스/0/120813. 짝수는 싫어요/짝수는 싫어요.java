import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 1;
        while (i <= n){
            list.add(i);
            i += 2;
        }

        int[] answer = new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            answer[j] = list.get(j);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 15;
        int[] answer = sol.solution(n);
        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
    }
}