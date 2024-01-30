import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        HashSet<Integer> deleteSet = new HashSet<>();
        for (int num : delete_list) {
            deleteSet.add(num);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if (!deleteSet.contains(num)) {
                list.add(num);
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
        int[] arr = {293, 1000, 395, 678, 94};
        int[] delete_list = {94, 777, 104, 1000, 1, 12};
        int[] answer = sol.solution(arr, delete_list);
        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
    }
}