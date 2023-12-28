public class Solution {
    public int solution(String binomial) {
        int answer = 0;
        int a = Integer.parseInt(binomial.substring(0, binomial.indexOf(" ")));
        int b = Integer.parseInt(binomial.substring(binomial.lastIndexOf(" ") + 1));

        if (binomial.contains("+")){
            answer = a + b;
        } else if (binomial.contains("-")) {
            answer = a - b;
        } else if (binomial.contains("*")) {
            answer = a * b;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String binomial = "0 - 7777";
        int answer = sol.solution(binomial);
        System.out.println("answer = " + answer);
    }
}
