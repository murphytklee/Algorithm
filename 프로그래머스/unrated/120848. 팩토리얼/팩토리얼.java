import java.util.ArrayList;

public class Solution {

    public int solution(int n) {
        ArrayList<Integer> dp = new ArrayList<>();
        dp.add(0);
        dp.add(1);
        for (int i = 2; dp.get(i - 1) <= n; i++) {
            int factorial = dp.get(i - 1) * i;
            dp.add(factorial);
        }

        return dp.size() - 2;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 3628800;
        int answer = sol.solution(n);
        System.out.println("answer = " + answer);
    }
}
