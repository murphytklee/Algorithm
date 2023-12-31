public class Solution {
    public String solution(String myString) {
        StringBuilder answer = new StringBuilder();
        myString = myString.toLowerCase();

        for (char c : myString.toCharArray()) {
            answer.append(c == 'a' ? 'A' : c);
        }
        
        return answer.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String myString = "PrOgRaMmErS";
        String answer = sol.solution(myString);
        System.out.println("answer = " + answer);
    }
}
