public class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;

        if (myString.toLowerCase().contains(pat.toLowerCase())){
            answer = 1;
        }
        
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String myString = "AbCdEfG";
        String pat = "aBc";
        int answer = sol.solution(myString, pat);
        System.out.println("answer = " + answer);
    }
}
