import java.util.Arrays;

public class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);

        for (int i = 1; i < sides[0]; i++) {
            answer++;
        }

        for (int i = sides[1] + 1; i <= sides[0] + sides[1]; i++) {
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] sides = {11, 7};
        int answer = sol.solution(sides);
        System.out.println("answer = " + answer);
    }
}
