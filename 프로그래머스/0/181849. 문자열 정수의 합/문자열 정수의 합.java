public class Solution {
    public int solution(String num_str) {
        int answer = 0;

        for (char c : num_str.toCharArray()) {
            answer += Character.getNumericValue(c);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String num_str = "123456789";
        int answer = sol.solution(num_str);
        System.out.println("answer = " + answer);
    }
}