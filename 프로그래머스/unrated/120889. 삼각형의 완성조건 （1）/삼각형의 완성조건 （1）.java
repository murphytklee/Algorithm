import java.util.Arrays;

public class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        
        int answer = 2;
        
        if (sides[2] < sides[1] + sides[0]){
            answer = 1;
        }
        
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] sides = {3, 6, 2};
        int answer = sol.solution(sides);
        System.out.println("answer = " + answer);
    }
}
