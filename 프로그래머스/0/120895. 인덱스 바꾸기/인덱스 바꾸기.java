public class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            if (i == num1){
                answer.append(my_string.charAt(num2));
            } else if (i == num2) {
                answer.append(my_string.charAt(num1));
            } else {
                answer.append(my_string.charAt(i));
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "hello";
        int num1 = 1;
        int num2 = 2;
        String answer = sol.solution(my_string, num1, num2);
        System.out.println("answer = " + answer);
    }
}