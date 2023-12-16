import java.util.Arrays;

public class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];

        for (int i = 0; i < score.length; i++) {
            int rank = 1;
            
            for (int j = 0; j < score.length; j++) {
                if ((score[i][0] + score[i][1]) < (score[j][0] + score[j][1])){
                    rank++;
                } else if ((score[i][0] + score[i][1]) == (score[j][0] + score[j][1])){
                    continue;
                }
            }
            answer[i] = rank;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] score = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
        int[] answer = sol.solution(score);
        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
    }
}
