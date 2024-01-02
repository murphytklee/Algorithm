public class Solution {
    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = my_string.length() - n; i < my_string.length(); i++) {
            answer.append(my_string.charAt(i));
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "ProgrammerS123";
        int n = 11;
        String answer = sol.solution(my_string, n);
        System.out.println("answer = " + answer);
    }
}
