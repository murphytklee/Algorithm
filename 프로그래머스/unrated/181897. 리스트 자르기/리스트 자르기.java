import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        ArrayList<Integer> list = new ArrayList<>();
        if (n == 1){
            for (int i = 0; i < slicer[1] + 1; i++) {
                list.add(num_list[i]);
            }
        } else if (n == 2) {
            for (int i = slicer[0]; i < num_list.length; i++) {
                list.add(num_list[i]);
            }
        } else if (n == 3) {
            for (int i = slicer[0]; i < slicer[1] + 1; i++) {
                list.add(num_list[i]);
            }
        } else if (n == 4) {
            for (int i = slicer[0]; i < slicer[1] + 1; i++) {
                list.add(num_list[i]);
                i += slicer[2] - 1;
            }
        } else throw new IllegalArgumentException("Wrong Input (n)");

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 4;
        int[] slicer = {1, 5, 2};
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] answer = sol.solution(n, slicer, num_list);
        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
    }
}
