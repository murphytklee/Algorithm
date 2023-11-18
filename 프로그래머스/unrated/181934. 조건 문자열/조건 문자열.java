public class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        if (ineq.equals(">") && eq.equals("=") && n >= m){
            return 1;
        } else if (ineq.equals("<") && eq.equals("=") && n <= m) {
            return 1;
        } else if (ineq.equals(">") && eq.equals("!") && n > m) {
            return 1;
        } else if (ineq.equals("<") && eq.equals("!") && n < m) {
            return 1;
        } else return 0;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String ineq = ">";
        String eq = "!";
        int n = 41;
        int m = 78;
        int answer = sol.solution(ineq, eq, n, m);
        System.out.println("answer = " + answer);
    }
}
