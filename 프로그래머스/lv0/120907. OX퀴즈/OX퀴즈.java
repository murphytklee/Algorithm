import java.util.Arrays;

public class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            String[] s_arr = quiz[i].split(" ");
            int cal = Integer.parseInt(s_arr[0]);
            
            if (s_arr[1].replaceAll("\\s", "").equals("+")){
                cal += Integer.parseInt(s_arr[2]);
            } else cal -= Integer.parseInt(s_arr[2]);
            
            if (cal == Integer.parseInt(s_arr[4])){
                answer[i] = "O";
            } else answer[i] = "X";
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] quiz = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
        String[] answer = sol.solution(quiz);
        System.out.println("answer = " + Arrays.toString(answer));
    }
}
