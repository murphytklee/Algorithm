import java.util.Arrays;

public class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;

        for (int i = 0; i < n; i++) {
            int h = n - i;
            if (citations[i] >= h) {
                return h;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] elements = {3, 0, 6, 1, 5};
        int answer = sol.solution(elements);
        System.out.println("answer = " + answer);
    }
}
