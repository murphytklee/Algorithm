public class Solution {
    public String solution(int[] numLog) {
        
        StringBuilder answer = new StringBuilder();

        for (int i = 1; i < numLog.length; i++) {
            if (numLog[i] == numLog[i-1] + 1){
                answer.append("w");
            }
            if (numLog[i] == numLog[i-1] - 1){
                answer.append("s");
            }
            if (numLog[i] == numLog[i-1] + 10){
                answer.append("d");
            }
            if (numLog[i] == numLog[i-1] - 10){
                answer.append("a");
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        String answer = sol.solution(numLog);
        System.out.println("answer = " + answer);
    }
}
