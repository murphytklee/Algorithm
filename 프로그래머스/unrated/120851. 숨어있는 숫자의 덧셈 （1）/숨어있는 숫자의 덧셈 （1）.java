public class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)){
                answer += Integer.parseInt(String.valueOf(c));
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "aAb1B2cC34oOp";
        int answer = sol.solution(my_string);
        System.out.println("answer = " + answer);
    }
}
