public class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if (a % 2 != 0 && b % 2 != 0){
            answer = (int) Math.pow(a, 2) + (int) Math.pow(b, 2);
        } else if (a % 2 != 0 || b % 2 != 0) {
            answer = 2 * (a + b);
        } else {
            answer = Math.abs(a - b);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int a = 3;
        int b = 5;
        int answer = sol.solution(a,b);
        System.out.println("answer = " + answer);
    }
}
