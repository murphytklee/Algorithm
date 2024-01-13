import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0){
                list.add(numlist[i]);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 3;
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] answer = sol.solution(n, numlist);
        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
    }
}
