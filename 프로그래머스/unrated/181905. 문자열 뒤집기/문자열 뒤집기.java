public class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder answer = new StringBuilder(my_string.length());

        for (int i = 0; i < s; i++) {
            answer.append(my_string.charAt(i));
        }

        for (int i = e; i >= s; i--) {
            answer.append(my_string.charAt(i));
        }

        for (int i = e + 1; i < my_string.length(); i++) {
            answer.append(my_string.charAt(i));
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "Progra21Sremm3";
        int s = 6;
        int e = 12;
        String answer = sol.solution(my_string, s, e);
        System.out.println("answer = " + answer);
    }
}
