public class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < parts.length; i++) {
            answer.append(my_strings[i].substring(parts[i][0], parts[i][1] + 1));
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] my_string = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] parts = {{0, 4}, {1, 2}, {3, 5}, {7, 7}};
        String answer = sol.solution(my_string,parts);
        System.out.println("answer = " + answer);
    }
}