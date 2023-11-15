public class Solution {
    public int solution(String number) {
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            sum += Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        return sum % 9;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String number = "78720646226947352489";
        int answer = sol.solution(number);
        System.out.println("answer = " + answer);
    }
}
