import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(n);

        while (n != 1){
            if (n % 2 == 0){
                n /= 2;
                list.add(n);
            } else {
                n = 3 * n + 1;
                list.add(n);
            }
        }
        int[] answer = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 10;
        int[] answer = sol.solution(n);
        System.out.println("answer = " + Arrays.toString(answer));
    }
}
