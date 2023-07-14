import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int[] box = new int[m];
        int count = 0;
        Arrays.sort(score);
        for (int j=score.length -1; j >= score.length%m; j--){
            box[count] = score[j];
            count++;
            if (count == m){
                Arrays.sort(box);
                int min = box[0];
                answer += min*m;
                count = 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int k = 4;
        int m = 3;
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        int answer = s.solution(k,m,score);
    }
}