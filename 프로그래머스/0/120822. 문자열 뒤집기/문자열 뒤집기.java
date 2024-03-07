public class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        for (int i = my_string.length() - 1; i >= 0; i--) {
            answer.append(my_string.charAt(i));
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "jaron";
        String answer = sol.solution(my_string);
        System.out.println("answer = " + answer);
    }
}
