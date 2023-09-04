import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        BigInteger num1 = new BigInteger(a);
        BigInteger num2 = new BigInteger(b);
        BigInteger sum = num1.add(num2);
        answer = sum.toString();
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String a = "18446744073709551615";
        String b = "287346502836570928366";
        String answer = sol.solution(a, b);
        System.out.println("answer = " + answer);
    }
}
