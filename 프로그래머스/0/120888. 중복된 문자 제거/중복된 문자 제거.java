import java.util.ArrayList;

public class Solution {
    public String solution(String my_string) {
        ArrayList<Character> list = new ArrayList<>();
        StringBuilder answer = new StringBuilder();
        
        for (char c : my_string.toCharArray()) {
            if (!list.contains(c)){
                list.add(c);
            }
        }

        for (Character character : list) {
            answer.append(character);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "We are the world";
        String answer = sol.solution(my_string);
        System.out.println("answer = " + answer);
    }
}