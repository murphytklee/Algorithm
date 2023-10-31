import java.util.*;

public class Solution {
    public String[] solution(String my_string) {
        List<String> answer = new ArrayList<>();
        int wordStartIndex = -1;
        int wordEndIndex = -1;

        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) != ' '){
                if (wordStartIndex == -1) {
                    wordStartIndex = i;
                }
            } else {
                if (wordStartIndex != -1) {
                    wordEndIndex = i;
                    answer.add(my_string.substring(wordStartIndex, wordEndIndex));
                    wordStartIndex = -1;
                }
            }
        }
        
        if (wordStartIndex != -1) {
            wordEndIndex = my_string.length(); 
            answer.add(my_string.substring(wordStartIndex, wordEndIndex));
        }

        return answer.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "i    love  you";
        String[] answer = sol.solution(my_string);
        System.out.println("answer = " + Arrays.toString(answer));
    }
}
