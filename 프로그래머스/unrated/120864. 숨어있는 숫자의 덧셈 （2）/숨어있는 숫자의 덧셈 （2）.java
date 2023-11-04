public class Solution {
    public int solution(String my_string) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        my_string += "A";
        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                sb.append(Character.getNumericValue(c));
            } else if (sb.length() > 0) {
                answer += Integer.parseInt(sb.toString());
                sb.setLength(0);
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
