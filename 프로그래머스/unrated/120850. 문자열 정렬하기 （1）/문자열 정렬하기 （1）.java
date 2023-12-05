import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isDigit(my_string.charAt(i))){
                list.add(Character.getNumericValue(my_string.charAt(i)));
            }
        }
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i); 
        }
        
        Arrays.sort(answer);
        
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "hi12392";
        int[] answer = sol.solution(my_string);
        System.out.println("answer = " + Arrays.toString(answer));
    }
}
