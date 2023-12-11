public class Solution {
    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < rsp.length(); i++) {
            if (rsp.charAt(i) == '2'){
                answer.append("0");
            } else if (rsp.charAt(i) == '0') {
                answer.append("5");
            } else answer.append("2");
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String rsp = "205";
        String answer = sol.solution(rsp);
        System.out.println("answer = " + answer);
    }
}
