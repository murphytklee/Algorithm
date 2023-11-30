public class Solution {
    public int solution(double flo) {
        int answer= (int) flo;
        return answer;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        double flo = 1.42;
        int answer = sol.solution(flo);
        System.out.println("answer = " + answer);
    }
}