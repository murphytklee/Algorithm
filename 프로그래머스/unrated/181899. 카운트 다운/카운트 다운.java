import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int start, int end_num) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = start; i >= end_num; i--) {
            list.add(i);
        }

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int start = 10;
        int end_num = 3;
        int[] answer = sol.solution(start, end_num);
        System.out.println("answer = " + Arrays.toString(answer));
    }
}
