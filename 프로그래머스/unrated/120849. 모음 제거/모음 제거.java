import java.util.ArrayList;

public class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        ArrayList<Character> vowel = new ArrayList<>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');

        for (int i = 0; i < my_string.length(); i++) {
            if (!vowel.contains(my_string.charAt(i))){
                answer.append(my_string.charAt(i));
            }
        }
        return answer.toString();
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "bus";
        String answer = sol.solution(my_string);
        System.out.println("answer = " + answer);
    }
}