public class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int index = myString.indexOf(pat);

        while (index != -1) {
            answer++;
            index = myString.indexOf(pat, index + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String myString = "aaaa";
        String pat = "aa";
        int answer = sol.solution(myString, pat);
        System.out.println("answer = " + answer);
    }
}
