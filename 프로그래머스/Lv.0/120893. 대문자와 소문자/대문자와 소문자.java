public class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        for (char c : my_string.toCharArray()) {
            if (Character.isUpperCase(c)) {
                answer.append(Character.toLowerCase(c));
            } else {
                answer.append(Character.toUpperCase(c));
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "cccCCC";
        String answer = sol.solution(my_string);
        System.out.println("answer = " + answer);
    }
}