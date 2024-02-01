public class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] ch = my_string.toCharArray();

        ch[num1] = my_string.charAt(num2);
        ch[num2] = my_string.charAt(num1);

        return String.valueOf(ch);
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