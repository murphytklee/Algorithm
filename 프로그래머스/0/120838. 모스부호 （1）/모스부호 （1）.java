import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String solution(String letter) {
        StringBuilder answer = new StringBuilder();

        String[] morseKeys = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        char[] morseValues = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        Map<String, Character> morseMap = new HashMap<>();

        for (int i = 0; i < morseKeys.length; i++) {
            morseMap.put(morseKeys[i], morseValues[i]);
        }


        String[] letterArr = letter.split(" ");

        for (String s : letterArr) {
            answer.append(morseMap.get(s));
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String letter = ".... . .-.. .-.. ---";
        String answer = sol.solution(letter);
        System.out.println("answer = " + answer);
    }
}