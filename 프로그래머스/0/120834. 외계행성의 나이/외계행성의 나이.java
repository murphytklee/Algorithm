import java.util.HashMap;

public class Solution {
    public String solution(int age) {
        StringBuilder answer = new StringBuilder();
        HashMap<Character, Character> map = new HashMap<>();
        char key = '0';
        char value = 'a';

        while (value <= 'z') {
            map.put(key++, value++);
        }

        for (char c : String.valueOf(age).toCharArray()) {
            answer.append(map.get(c));
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int age = 23;
        String answer = sol.solution(age);
        System.out.println("answer = " + answer);
    }
}