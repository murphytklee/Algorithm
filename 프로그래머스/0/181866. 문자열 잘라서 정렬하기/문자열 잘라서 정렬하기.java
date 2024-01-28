import java.util.Arrays;

public class Solution {
    public String[] solution(String myString) {
        String[] answer  = myString.replaceAll(" ", "").split("x");
        
        int count = 0;
        for (int i = 0; i < answer.length; i++) {
            if (!answer[i].isEmpty()) {
                answer[count++] = answer[i];
            }
        }

        answer = Arrays.copyOf(answer, count);
        Arrays.sort(answer);
        
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String myString = "dxccxbbbxaaaa";
        String[] answer = sol.solution(myString);
        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
    }
}
