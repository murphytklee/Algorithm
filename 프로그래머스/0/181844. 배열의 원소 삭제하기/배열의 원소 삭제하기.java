import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean flag = false;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]){
                    flag = true;
                }
            }
            if (!flag){
                list.add(arr[i]);
            }
            flag = false;
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