public class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int answerLength = my_string.length() / m;

        if (my_string.length() % m >= c){
            answerLength += 1;
        }

        int index = c-1;
        for (int i = 0; i < answerLength; i++) {

            answer += my_string.charAt(index);
            index += m;
        }
        
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "ihrhbakrfpndopljhygca";
        int m = 4;
        int c = 2;
        String answer = sol.solution(my_string, m, c);
        System.out.println("answer = " + answer);
    }
}
