public class Solution {
    public int solution(int slice, int n) {
        int answer = 1;
        while (!(answer * slice / n >= 1)){
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int slice = 7;
        int n = 10;
        int answer = sol.solution(slice, n);
        System.out.println("answer = " + answer);
    }
}
