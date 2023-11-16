public class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for (int i = 0; i < included.length; i++) {
            if (included[i]){
                answer += a + (d * i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int a = 7;
        int d = 1;
        boolean[] included = {false, false, false, true, false, false, false};
        int answer = sol.solution(a, d, included);
        System.out.println("answer = " + answer);
    }
}
