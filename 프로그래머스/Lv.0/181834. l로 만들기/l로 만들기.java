public class Solution {
    public String solution(String myString) {
        StringBuilder answer = new StringBuilder();
        for (char c : myString.toCharArray()) {
            if (c <= 'l'){
                answer.append('l');
            } else {
                answer.append(c);
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String myString = "abcdevwxyz";
        String answer = sol.solution(myString);
        System.out.println("answer = " + answer);
    }
}