import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<Integer> solution(int[] num_list) {
        List<Integer> list = new ArrayList<>();
        for (int num : num_list) {
            list.add(num);
        }
        Collections.reverse(list);
        return list;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num_list = {1, 2, 3, 4, 5};
        List<Integer> answer = sol.solution(num_list);
        System.out.println("answer = " + answer);
    }
}
