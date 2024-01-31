public class Solution {
    public int solution(int n) {
        double x = Math.sqrt(n);
        if (x - (int) x == 0){
            return 1;
        } else {
            return 2;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 144;
        int answer = sol.solution(n);
        System.out.println("answer = " + answer);
    }
}