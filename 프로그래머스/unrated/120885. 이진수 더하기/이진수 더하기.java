public class Solution {
    public String solution(String bin1, String bin2) {
        return Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String bin1 = "1001";
        String bin2 = "1111";
        String answer = sol.solution(bin1, bin2);
        System.out.println("answer = " + answer);
    }
}
