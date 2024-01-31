public class Solution {
    public int solution(String str1, String str2) {
        if (str1.contains(str2)){
            return 1;
        } else {
            return 2;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String str1 = "ab6CDE443fgh22iJKlmn1o";
        String str2 = "6CD";
        int answer = sol.solution(str1, str2);
        System.out.println("answer = " + answer);
    }
}