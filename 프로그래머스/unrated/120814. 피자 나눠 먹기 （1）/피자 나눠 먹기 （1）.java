public class Solution {
    public int solution(int n) {
        if (n % 7 == 0){
            return n / 7;
        } else {
            return n / 7 + 1;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 14;
        int answer = sol.solution(n);
        System.out.println("answer = " + answer);
    }
}
